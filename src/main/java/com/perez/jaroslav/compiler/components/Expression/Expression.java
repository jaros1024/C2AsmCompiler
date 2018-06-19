package com.perez.jaroslav.compiler.components.Expression;

import com.perez.jaroslav.compiler.util.RandomString;

import java.util.concurrent.ThreadLocalRandom;

public class Expression {
    private String leftExpr;
    private String rightExpr;
    private String operator;

    public Expression(String operator, String leftExpr, String rightExpr) {
        this.operator = operator;
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
    }

    public String generate(String operator){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MOV $" + leftExpr + ", %eax\n");
        stringBuilder.append("MOV $" + rightExpr + ", %ebx\n");
        stringBuilder.append("CMP %eax, %ebx\n");
        return stringBuilder.toString();
    }

    public String addJumpAndLabel(String operator, String label){
        StringBuilder stringBuilder = new StringBuilder();
        if(operator.equals(">")) {
            stringBuilder.append("JG " + label + "\n\n");
        }
        else if(operator.equals("<")) {
            stringBuilder.append("JL " + label + "\n\n");
        }
        else if(operator.equals("<=")) {
            stringBuilder.append("JNGE " + label + "\n\n");
        }
        else if(operator.equals(">=")) {
            stringBuilder.append("JNLE " + label + "\n\n");
        }
        else if(operator.equals("==")) {
            stringBuilder.append("JE " + label + "\n\n");
        }
        stringBuilder.append(label +":\n");
        return stringBuilder.toString();
    }

}