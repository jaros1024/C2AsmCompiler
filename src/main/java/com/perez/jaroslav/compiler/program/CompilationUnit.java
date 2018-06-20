package com.perez.jaroslav.compiler.program;

import com.perez.jaroslav.compiler.components.*;
import com.perez.jaroslav.compiler.components.callarguments.MethodArgument;
import com.perez.jaroslav.compiler.components.callarguments.TextArgument;
import com.perez.jaroslav.compiler.components.functions.AbstractFunction;
import com.perez.jaroslav.compiler.components.functions.ExternalFunction;
import com.perez.jaroslav.compiler.components.functions.Function;
import com.perez.jaroslav.compiler.components.functions.MainFunction;
import com.perez.jaroslav.compiler.components.loops.AbstractLoop;
import com.perez.jaroslav.compiler.components.loops.DoLoop;
import com.perez.jaroslav.compiler.components.loops.ForLoop;
import com.perez.jaroslav.compiler.components.loops.WhileLoop;
import com.perez.jaroslav.compiler.components.statement.IfStatement;
import com.perez.jaroslav.compiler.components.statement.SelectionStatement;
import com.perez.jaroslav.compiler.components.variables.AbstractVariable;
import com.perez.jaroslav.compiler.components.variables.ArgumentVariable;
import com.perez.jaroslav.compiler.components.variables.Global;
import com.perez.jaroslav.compiler.components.variables.Variable;
import com.perez.jaroslav.compiler.exceptions.BadSyntaxException;
import com.perez.jaroslav.compiler.helpers.Registers;
import com.perez.jaroslav.compiler.helpers.StackHelper;
import com.perez.jaroslav.compiler.helpers.SystemFunctions;
import com.perez.jaroslav.compiler.helpers.TypeHelper;

import java.util.*;

import static java.lang.String.format;

public class CompilationUnit {
    private StringBuilder stringBuilder = new StringBuilder();

    private HashMap<String, Define> defines = new HashMap<>();
    private HashMap<String, Global> globals = new HashMap<>();
    private HashMap<String, Function> functions = new HashMap<>();
    private MainFunction mainFunction = new MainFunction();
    private HashMap<String, ExternalFunction> externalFunctions = new HashMap<>();

    /*private Stack<WhileLoop> whileLoops = new Stack<>();
    private Stack<ForLoop> forLoops = new Stack<>();
    private Stack<DoLoop> doLoops = new Stack<>();*/
    private Stack<AbstractLoop> loops = new Stack<>();
    private Stack<SelectionStatement> selectionStatement = new Stack<>();

    public Function parsedFunction;

    public String generate(){
        makeConstants();
        stringBuilder.append("\n");
        makeGlobals();
        stringBuilder.append("\n");
        stringBuilder.append(".text \n");
        stringBuilder.append(".global _start \n");

        makeFunctions();
        return stringBuilder.toString();
    }

    public void addHeader(String name){
        Collection<HashMap<String, ExternalFunction>> module = SystemFunctions.getExternalFunctions(name);
        if(module == null){
            throw new BadSyntaxException(format("Unknown module: %s", name));
        }
        for(HashMap<String, ExternalFunction> function : module){
            for(ExternalFunction externalFunction : function.values()){
                externalFunctions.put(externalFunction.name, externalFunction);
            }
        }
    }

    public void addDefine(String identifier, String value){
        defines.put(identifier, new Define(identifier, value));
    }

    public void addGlobal(String identifier, String type, String value, boolean pointer){
        globals.put(identifier, new Global(identifier, type, value, pointer));
    }

    public void addFunction(String identifier, String type, HashMap<String, ArgumentVariable> args){
        if(identifier.equals("main") && type.equals("int")){
            parsedFunction = mainFunction;
            parsedFunction.arguments = args;
            parsedFunction.name = identifier;
            parsedFunction.type = type;
            parsedFunction.start();
        }
        else {
            Function f = new Function(identifier, type, args);
            functions.put(identifier, f);
            parsedFunction = f;
        }
    }

    public void startFunction(String identifier){
        if(!identifier.equals("main")){
            parsedFunction = functions.get(identifier);
            parsedFunction.start();
        }
    }

    public void endFunction(){
        if(!parsedFunction.name.equals("main") || !parsedFunction.type.equals("int")){
            functions.put(parsedFunction.name, parsedFunction);
        }
        parsedFunction = null;
    }

    public void callFunction(String name, List<MethodArgument> arguments){
        AbstractFunction function = functions.get(name);
        if(function == null){
            function = externalFunctions.get(name);
            if(function == null){
                throw new BadSyntaxException(format("Unknown function: %s", name));
            }
            else {
                callExternalFunction((ExternalFunction)function, arguments);
            }
        }
        else {
            callOwnFunction((Function)function, arguments);
        }
    }

    private void callExternalFunction(ExternalFunction function, List<MethodArgument> arguments){
        StringBuilder stringBuilder = new StringBuilder();
        int arg_count = 0;
        for(MethodArgument arg : arguments){
            if(arg instanceof TextArgument){
                TextArgument textArgument = (TextArgument) arg;
                globals.put(textArgument.label, new Global(textArgument.label, "text", textArgument.value, false));
                String where = Registers.getRegisterForArgument(arg_count);
                if(where == null){
                    stringBuilder.append("PUSH $" + textArgument.label + "\n");
                }
                else {
                    stringBuilder.append("MOV $" + textArgument.label + ",%" + where + "\n");
                    arg_count++;
                }
            }
            else if(arg.type == MethodArgument.TYPE_CONST){
                String where = Registers.getRegisterForArgument(arg_count);
                //there are no more free registers, we have to push the argument into the stack
                if(where == null){
                    stringBuilder.append("PUSH $" + arg.value + "\n");
                }
                //there is a free register
                else {
                    stringBuilder.append("MOV $" + arg.value + ",%" + where + "\n");
                    arg_count++;
                }
            }
            else if(arg.type == MethodArgument.TYPE_VAR){
                AbstractVariable variable = getVariable(arg.value);

                String where = Registers.getRegisterForArgument(arg_count);
                if(where == null){
                    stringBuilder.append("XOR %r15,%r15\n");

                    //if this is a variable
                    if(variable instanceof Variable){
                        Variable v = (Variable) variable;
                        stringBuilder.append(TypeHelper.getMove(v.type).toUpperCase() + " " + v.address +
                                ",%" + Registers.getRegisterForType("r15", v.type) + "\n");
                    }
                    //if this is global variable
                    else if(variable instanceof Global){
                        stringBuilder.append(TypeHelper.getMove(variable.type).toUpperCase() + " " + variable.name +
                                ",%" + Registers.getRegisterForType("r15", variable.type) + "\n");
                    }
                    else if(variable instanceof ArgumentVariable){
                        ArgumentVariable av = (ArgumentVariable) variable;
                        if(av.storageType == ArgumentVariable.TYPE_STACK){
                            int position = StackHelper.getPositionOnStack(Integer.parseInt(av.location));
                            stringBuilder.append("MOV " + position + "(%rbp),%" +
                                    Registers.getRegisterForType("r15", av.type) + "\n");
                        }
                        else {
                            stringBuilder.append("MOV %" + av.location + ",%" +
                                    Registers.getRegisterForType("r15", av.type) + "\n");
                        }
                    }
                    stringBuilder.append("PUSH %r15\n");
                }
                else {
                    stringBuilder.append("XOR %" + where + ",%" + where + "\n");
                    //if this is variable
                    if(variable instanceof Variable){
                        Variable v = (Variable) variable;
                        stringBuilder.append(TypeHelper.getMove(v.type).toUpperCase() + " " + v.address +
                                ",%" + Registers.getRegisterForType(where, v.type) + "\n");
                    }
                    //if this is global variable
                    else if(variable instanceof Global){
                        stringBuilder.append(TypeHelper.getMove(variable.type).toUpperCase() + " " + variable.name +
                                ",%" + Registers.getRegisterForType(where, variable.type) + "\n");
                    }
                    //if this is function argument variable
                    else if(variable instanceof ArgumentVariable){
                        ArgumentVariable av = (ArgumentVariable) variable;
                        if(av.storageType == ArgumentVariable.TYPE_STACK){
                            int position = StackHelper.getPositionOnStack(Integer.parseInt(av.location));
                            stringBuilder.append(TypeHelper.getMove(av.type) + " " + position + "(%rbp),%" +
                                    Registers.getRegisterForType(where, av.type) + "\n");
                        }
                        else {
                            stringBuilder.append("MOV %" + av.location + ",%" + where + "\n");
                        }
                    }
                }
            }
        }
        if(function.variableLength){
            //int vArguments = arguments.size() - function.mustHaveArguments;
            //stringBuilder.append("MOV $" + vArguments + ",%rax\n");
            stringBuilder.append("XOR %eax,%eax\n");
        }
        stringBuilder.append(format("CALL %s\n", function.name));
        if(!function.type.equals("void")){
            //todo replace r8 with actual register
            stringBuilder.append("MOV %rax,%r8\n");
        }
        parsedFunction.addCode(stringBuilder.toString());
    }

    private void callOwnFunction(Function function, List<MethodArgument> arguments){
        Stack<MethodArgument> stack = new Stack<>();
        for(MethodArgument methodArgument : arguments){
            stack.push(methodArgument);
        }

        StringBuilder stringBuilder = new StringBuilder();
        while(!stack.empty()){
            MethodArgument methodArgument = stack.pop();
            if(methodArgument instanceof TextArgument){
                TextArgument textArgument = (TextArgument) methodArgument;
                globals.put(textArgument.label, new Global(textArgument.label, "text", textArgument.value, false));
                stringBuilder.append("PUSH $" + textArgument.label + "\n");
            }
            else if(methodArgument.type == MethodArgument.TYPE_CONST){
                stringBuilder.append("PUSH $" + methodArgument.value + "\n");
            }
            else if(methodArgument.type == MethodArgument.TYPE_VAR){
                AbstractVariable variable = getVariable(methodArgument.value);

                stringBuilder.append("XOR %r15,%r15\n");

                //if this is a variable
                if(variable instanceof Variable){
                    Variable v = (Variable) variable;
                    stringBuilder.append(TypeHelper.getMove(v.type).toUpperCase() + " " + v.address +
                            ",%" + Registers.getRegisterForType("r15", v.type) + "\n");
                }
                //if this is global variable
                else if(variable instanceof Global){
                    stringBuilder.append(TypeHelper.getMove(variable.type).toUpperCase() + " " + variable.name +
                            ",%" + Registers.getRegisterForType("r15", variable.type) + "\n");
                }
                else if(variable instanceof ArgumentVariable){
                    ArgumentVariable av = (ArgumentVariable) variable;
                    if(av.storageType == ArgumentVariable.TYPE_STACK){
                        int position = StackHelper.getPositionOnStack(Integer.parseInt(av.location));
                        stringBuilder.append("MOV " + position + "(%rbp),%" +
                                Registers.getRegisterForType("r15", av.type) + "\n");
                    }
                    else {
                        stringBuilder.append("MOV %" + av.location + ",%" +
                                Registers.getRegisterForType("r15", av.type) + "\n");
                    }
                }
                stringBuilder.append("PUSH %r15\n");
            }
        }
        stringBuilder.append(format("CALL %s\n", function.name));
        if(!function.type.equals("void")){
            //todo replace r8 with actual register
            stringBuilder.append("MOV %rax,%r8\n");
        }
        parsedFunction.addCode(stringBuilder.toString());
    }

    private void makeConstants(){
        for(String s : defines.keySet()){
            stringBuilder.append(format(".equ %s, %s \n", defines.get(s).name, defines.get(s).value));
        }
    }

    private void makeGlobals(){
        stringBuilder.append(".data \n");
        for(String str : globals.keySet()){
            Global g = globals.get(str);
            stringBuilder.append(format("%s: \n", str));
            stringBuilder.append(format("%s %s \n", TypeHelper.getAssemblyType(g.type), g.value));
        }
    }

    private void makeFunctions(){
        stringBuilder.append(mainFunction.generate());

        for(String f : functions.keySet()){
            stringBuilder.append(functions.get(f).generate());
        }
    }

    public AbstractVariable getVariable(String name){
        AbstractVariable variable = parsedFunction.getLocalVariable(name);
        if(variable == null){
            variable = parsedFunction.getArgument(name);
            if(variable == null){
                variable = globals.get(name);
            }
        }
        return variable;
    }

    public boolean inLoop(){
        //return !whileLoops.empty() || !forLoops.empty() || !doLoops.empty();
        return !loops.empty();
    }

    public void addWhileLoop(){
        WhileLoop whileLoop = new WhileLoop();
       // whileLoops.push(whileLoop);
        loops.push(whileLoop);
        parsedFunction.addCode(whileLoop.label + "_before:\n");
    }

    public void removeWhileLoop(){
        //WhileLoop whileLoop = whileLoops.pop();
        WhileLoop whileLoop = (WhileLoop)loops.pop();
        parsedFunction.addCode("JMP " + whileLoop.label + "_before\n");
        parsedFunction.addCode(whileLoop.label + "_after:\n");
    }

    public void addForLoop(){
        ForLoop forLoop = new ForLoop();
        loops.push(forLoop);
        parsedFunction.addCode(forLoop.label + "_before\n");
    }

    public void removeForLoop(){
        ForLoop forLoop = (ForLoop)loops.pop();
        parsedFunction.addCode(forLoop.label + "_after\n");
    }

    public void addDoLoop(){
        DoLoop doLoop = new DoLoop();
        loops.push(doLoop);
        parsedFunction.addCode(doLoop.label + "_before\n");
    }

    public void removeDoLoop(){
        DoLoop doLoop = (DoLoop)loops.pop();
        parsedFunction.addCode(doLoop.label + "_after\n");
    }

    public void doBreak(){
        if(!inLoop()){
            throw new BadSyntaxException("Break not allowed when not in loop");
        }
        AbstractLoop loop = loops.peek();
        parsedFunction.addCode("JMP " + loop.label + "_after\n");
    }

    public void doContinue(){
        if(!inLoop()){
            throw new BadSyntaxException("Continue not allowed when not in loop");
        }
        AbstractLoop loop = loops.peek();
        parsedFunction.addCode("JMP " + loop.label + "_before\n");
    }

    public void addLoopJumpToEnd(){
        AbstractLoop loop = loops.peek();
        parsedFunction.addCode("TEST %rax,%rax\n");
        parsedFunction.addCode("JZ " + loop.label + "_after\n");
    }

    public void addLoopJumpToBegin(){
        AbstractLoop loop = loops.peek();
        parsedFunction.addCode("JMP " + loop.label + "_before\n");
    }

    public void addStatementJump(SelectionStatement selection) {
        selectionStatement.push(selection);
        parsedFunction.addCode(selection.addJumpAfterExpression());
    }

    public void addStatementLabel(){
        parsedFunction.addCode( selectionStatement.pop().addAfterLabel());
    }
}
