package com.perez.jaroslav.compiler.components.statement;

import com.perez.jaroslav.compiler.util.RandomString;

public class IfStatement extends SelectionStatement{

    public String addJumpIfFalse(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TEST %rax, %rax\n");
        stringBuilder.append("JE " + label + "_else\n");
        return stringBuilder.toString();
    }

}
