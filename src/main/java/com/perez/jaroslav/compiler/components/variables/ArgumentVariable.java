package com.perez.jaroslav.compiler.components.variables;

public class ArgumentVariable extends AbstractVariable {
    public static final int TYPE_STACK = 0;
    public static final int TYPE_REGISTER = 1;

    public String location;
    public int storageType;
}
