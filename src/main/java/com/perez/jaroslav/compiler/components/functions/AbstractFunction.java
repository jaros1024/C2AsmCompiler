package com.perez.jaroslav.compiler.components.functions;

import java.util.List;

public abstract class AbstractFunction {
    public String name;
    public String type;
    public boolean variableLength;
    public int mustHaveArguments;
    public List<Function.Argument> argumentList;
}
