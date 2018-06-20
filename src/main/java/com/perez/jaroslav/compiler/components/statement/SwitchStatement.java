package com.perez.jaroslav.compiler.components.statement;

public class SwitchStatement extends SelectionStatement {

    @Override
    public String addJumpAfterExpression(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TEST %rax, %rax\n");
        stringBuilder.append("JE " + label + "_afterCase\n");
        return stringBuilder.toString();
    }

    @Override
    public String addAfterLabel() {
        return label+"_afterCase:\n";
    }
}
