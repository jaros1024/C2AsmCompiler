package com.perez.jaroslav.compiler.program;

import com.perez.jaroslav.compiler.components.*;
import com.perez.jaroslav.compiler.components.functions.AbstractFunction;
import com.perez.jaroslav.compiler.components.functions.ExternalFunction;
import com.perez.jaroslav.compiler.components.functions.Function;
import com.perez.jaroslav.compiler.exceptions.BadSyntaxException;
import com.perez.jaroslav.compiler.helpers.SystemFunctions;
import com.perez.jaroslav.compiler.helpers.TypeHelper;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import static java.lang.String.format;

public class CompilationUnit {
    private StringBuilder stringBuilder = new StringBuilder();

    private HashMap<String, Define> defines = new HashMap<>();
    private HashMap<String, Global> globals = new HashMap<>();
    private HashMap<String, Function> functions = new HashMap<>();
    private MainFunction mainFunction = new MainFunction();
    //private List<String> externalFunctions = new LinkedList<>();
    private HashMap<String, ExternalFunction> externalFunctions = new HashMap<>();

    public Function parsedFunction;

    public String generate(){
        makeConstants();
        stringBuilder.append("\n");
        makeGlobals();
        stringBuilder.append("\n");
        stringBuilder.append(".text \n");
        stringBuilder.append(".global _start \n");
        makeExterns();

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

    public void addGlobal(String identifier, String type, String value){
        globals.put(identifier, new Global(identifier, type, value));
    }

    public void addFunction(String identifier, String type, List<Function.Argument> args){
        if(identifier.equals("main") && type.equals("int")){
            parsedFunction = mainFunction;
            parsedFunction.argumentList = args;
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

    public void callFunction(String name, List<String> arguments){
        AbstractFunction function = functions.get(name);
        if(function == null){
            function = externalFunctions.get(name);
            if(function == null){
                throw new BadSyntaxException(format("Unknown function: %s", name));
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(String arg : arguments){

        }
        stringBuilder.append(format("CALL %s\n", name));

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

    private void makeExterns(){
        for(String s : externalFunctions.keySet()){
            stringBuilder.append(format("extern %s \n", s));
        }
    }
}
