package com.perez.jaroslav.compiler.components.statement;

import com.perez.jaroslav.compiler.util.RandomString;

public class IfStatement extends SelectionStatement{

    @Override
    public String addJumpAfterExpression(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TEST %rax, %rax\n");
        stringBuilder.append("JE " + label + "_else\n");
        return stringBuilder.toString();
    }

    @Override
    public String addAfterLabel() {
        return label + "_else:\n";
    }
}
