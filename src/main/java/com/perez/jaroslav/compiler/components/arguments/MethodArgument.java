package com.perez.jaroslav.compiler.components.arguments;

import java.util.List;

public class MethodArgument {
    public static final int TYPE_CONST = 0;
    public static final int TYPE_VAR = 1;

    public int type;
    public String value;
}
