package com.perez.jaroslav.compiler.components.functions;

import com.perez.jaroslav.compiler.components.variables.ArgumentVariable;
import com.perez.jaroslav.compiler.components.variables.Variable;
import com.perez.jaroslav.compiler.exceptions.BadSyntaxException;
import com.perez.jaroslav.compiler.helpers.Registers;
import com.perez.jaroslav.compiler.helpers.TypeHelper;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import static java.lang.String.format;

public class Function extends AbstractFunction {

    protected HashMap<String, Variable> localVariables = new LinkedHashMap<>();
    protected StringBuilder content;
    protected int localVariableStackPtr = 0;

    public Function() {
    }

    public Function(String name, String type, HashMap<String, ArgumentVariable> arguments) {
        this.name = name;
        this.type = type;
        this.arguments = arguments;
    }

    public String generate(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(format(".type %s,@function \n\n", name));
        stringBuilder.append(format("%s: \n", name));
        initStack(stringBuilder);
        makeLocalVariables(stringBuilder);

        stringBuilder.append(content.toString());

        cleanStack(stringBuilder);
        stringBuilder.append(ret());
        stringBuilder.append('\n');

        return stringBuilder.toString();
    }

    public void start(){
        content = new StringBuilder();
    }

    public void functionReturn(){
        if(!type.equals("void")){
            throw new BadSyntaxException("Function must return value");
        }

        cleanStack(content);
        content.append(ret());
    }

    public void functionReturnVariable(String variable){
        if(type.equals("void")){
            throw new BadSyntaxException("Void function cannot return any values");
        }

        Variable result = localVariables.get(variable);
        String mov = TypeHelper.getMove(result.type);
        String register = Registers.getRegisterForType("rax", result.type);
        content.append("XOR %rax,%rax\n");
        content.append(mov.toUpperCase() + " " + result.address + ",%" + register + "\n");

        cleanStack(content);
        content.append(ret());
    }

    public void addCode(String code){
        content.append(code);
    }

    public void functionReturnConstant(String constant){
        if(type.equals("void")){
            throw new BadSyntaxException("Void function cannot return any values");
        }

        content.append("MOV $" + constant + ",%rax\n");
        cleanStack(content);
        content.append(ret());
    }

    public void addLocalVariable(String identifier, String type, String value, boolean pointer){
        int size = TypeHelper.getTypeSize(type);
        localVariableStackPtr += size;
        Variable variable = new Variable(identifier, type, value, "-" + localVariableStackPtr + "(%rbp)", pointer);
        localVariables.put(identifier, variable);
    }

    private String ret(){
        int argumentsSize = 0;
        for(String argName : arguments.keySet()){
            ArgumentVariable argumentVariable = arguments.get(argName);
            argumentsSize += TypeHelper.getTypeSize(argumentVariable.type);
        }
        return (argumentsSize == 0 ? "ret" : format("ret %d", argumentsSize)) + "\n";
    }

    private void initStack(StringBuilder stringBuilder){
        stringBuilder.append("PUSH %rbp\n");
        stringBuilder.append("MOV %rsp,%rbp\n");
    }

    private void cleanStack(StringBuilder stringBuilder){
        stringBuilder.append("MOV %rbp,%rsp\n");
        stringBuilder.append("POP %rbp\n");
    }

    protected void makeLocalVariables(StringBuilder stringBuilder){
        for(String str : localVariables.keySet()){
            Variable v = localVariables.get(str);
            int length = TypeHelper.getTypeSize(v.type);
            stringBuilder.append("SUB $" + length + ",%rsp\n");
            stringBuilder.append(TypeHelper.getMove(v.type).toUpperCase() + " $" + v.value + "," + v.address + "\n");
        }
    }

    public Variable getLocalVariable(String name){
        return localVariables.get(name);
    }
}
