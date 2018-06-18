package com.perez.jaroslav.compiler.components.functions;

import com.perez.jaroslav.compiler.components.variables.ArgumentVariable;

import java.util.HashMap;
import java.util.List;

public abstract class AbstractFunction {
    public String name;
    public String type;
    public boolean variableLength;
    public int mustHaveArguments;
    public HashMap<String, ArgumentVariable> arguments;

    public ArgumentVariable getArgument(String name){
        return arguments.get(name);
    }
}
