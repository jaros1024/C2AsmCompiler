package com.perez.jaroslav.compiler.expressions.evaluator;

import com.perez.jaroslav.compiler.helpers.Registers;
import com.perez.jaroslav.compiler.helpers.TypeHelper;

import java.util.Stack;

public class ExpressionEvaluator {
    private StringBuilder content = new StringBuilder();
    private int primaryExprCounter = 0;
    public boolean copyValues = true;
    private Stack<String> usedRegisters = new Stack<>();
    private String assignmentTarget;

    public String getExpression(){
        return content.toString();
    }

    public void loadPrimaryExpression(String operand, String type){
        if(copyValues){
            String register = getNextRegister();
            String mov = TypeHelper.getMove(type);
            register = Registers.getRegisterForType(register, type);
            content.append("XOR %" + register + ",%" + register + "\n");
            content.append(mov.toUpperCase() + " " + operand + ",%" + register + "\n");
        }
        else {
            assignmentTarget = operand;
        }
    }

    public void loadPrimaryExpression(String operand){
        if(copyValues){
            String register = getNextRegister();
            content.append("XOR %" + register + ",%" + register + "\n");
            content.append("MOV " + operand + ",%" + register + "\n");
        }
        else {
            assignmentTarget = operand;
        }
    }

    public void loadAdditiveExpression(){
        if(copyValues){
            String first = releaseRegister();
            String second = getLatestRegister();
            content.append("ADD %" + first + ",%" + second + "\n");
        }
    }

    public void loadLogicalOrExpression(){
        if(copyValues){
            String first = releaseRegister();
            String second = getLatestRegister();
            content.append("OR %" + first + ",%" + second + "\n");
        }
    }

    public void loadLogicalAndExpression(){
        if(copyValues){
            String first = releaseRegister();
            String second = getLatestRegister();
            content.append("AND %" + first + ",%" + second + "\n");
        }
    }

    public void loadMultiplicativeExpression(){
        if(copyValues){
            String first = releaseRegister();
            String second = getLatestRegister();
            content.append("IMUL %" + first + ",%" + second + "\n");
        }
    }

    public void loadEqualityExpression(){
        if(copyValues){
            String first = releaseRegister();
            String second = getLatestRegister();
            content.append("XOR %" + first + ",%" + second + "\n");
            content.append("NOT %" + second + "\n");
        }
    }

    public void loadInequalityExpression(){
        if(copyValues){
            String first = releaseRegister();
            String second = getLatestRegister();
            content.append("XOR %" + first + ",%" + second + "\n");
        }
    }

    public void loadAssignmentExpression(){
        content.append("MOV %r8," + assignmentTarget + "\n");
        assignmentTarget = null;
    }

    public void loadInnerExpression(){
        if(copyValues){
            String register = releaseRegister();
            content.append("MOV %" + register +",%rax\n");
        }
    }

    private String getNextRegister(){
        String register = Registers.getRegisterForOperand(primaryExprCounter);
        usedRegisters.push(register);
        primaryExprCounter++;

        return register;
    }

    private String releaseRegister(){
        String register = usedRegisters.pop();
        primaryExprCounter--;
        return register;
    }

    private String getLatestRegister(){
        return usedRegisters.peek();
    }

    private void clearRegisterStack(){
        primaryExprCounter = 0;
        usedRegisters.clear();
    }
}
