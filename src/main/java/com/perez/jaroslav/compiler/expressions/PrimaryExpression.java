package com.perez.jaroslav.compiler.expressions;

public class PrimaryExpression {
    public static final int TYPE_VARIABLE = 0;
    public static final int TYPE_CONST = 1;

    public int type;
    public String operand;
}
