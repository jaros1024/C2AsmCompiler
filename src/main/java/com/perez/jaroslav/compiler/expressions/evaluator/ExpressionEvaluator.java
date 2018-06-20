package com.perez.jaroslav.compiler.expressions.evaluator;

import com.perez.jaroslav.compiler.helpers.Registers;
import com.perez.jaroslav.compiler.helpers.TypeHelper;
import com.perez.jaroslav.compiler.util.RandomString;

import java.util.Stack;

public class ExpressionEvaluator {
    private StringBuilder content = new StringBuilder();
    private int primaryExprCounter = 0;
    public boolean copyValues = true;
    private Stack<String> usedRegisters = new Stack<>();
    private String assignmentTarget;

    private RandomString randomString = new RandomString(8);

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

    public void loadSubtractiveExpression(){
        if(copyValues){
            String first = releaseRegister();
            String second = getLatestRegister();
            content.append("SUB %" + first + ",%" + second + "\n");
        }
    }

    public void loadDivisionExpression(){
        if(copyValues){
            String first = releaseRegister();
            String second = getLatestRegister();
            content.append("MOV %" + second + ",%rax\n");
            content.append("XOR %rdx,%rdx\n");
            content.append("IDIV %" + first + "\n");
            content.append("MOV %rax,%" + second + "\n");
        }
    }

    public void loadModuloExpression(){
        if(copyValues){
            String first = releaseRegister();
            String second = getLatestRegister();
            content.append("MOV %" + second + ",%rax\n");
            content.append("XOR %rdx,%rdx\n");
            content.append("IDIV %" + first + "\n");
            content.append("MOV %rdx,%" + second + "\n");
        }
    }

    public void loadPostfixIncrementExpression(){
        //todo postfix increment expression
    }

    public void loadPostfixDecrementExpression(){
        //todo postfix decrement expression
    }

    public void loadPrefixIncrementExpression(){
        //todo prefix increment expression
    }

    public void loadPrefixDecrementExpression(){
        //todo prefix decrement expression
    }

    public void loadBiggerThanExpression(){
        if(copyValues){
            String first = releaseRegister();
            String second = getLatestRegister();
            String label = "cmp_" + randomString.nextString();
            content.append("CMP %" + first + ",%" + second + "\n");
            content.append("JG " + label + "\n");
            content.append("XOR %" + second + ",%" + second + "\n");
            content.append("JMP " + label + "_after\n");
            content.append(label + ":\n");
            content.append("MOV $1,%" + second + "\n");
            content.append(label + "_after:\n");
        }
    }

    public void loadLessThanExpression(){
        if(copyValues){
            String first = releaseRegister();
            String second = getLatestRegister();
            String label = "cmp_" + randomString.nextString();
            content.append("CMP %" + first + ",%" + second + "\n");
            content.append("JL " + label + "\n");
            content.append("XOR %" + second + ",%" + second + "\n");
            content.append("JMP " + label + "_after\n");
            content.append(label + ":\n");
            content.append("MOV $1,%" + second + "\n");
            content.append(label + "_after:\n");
        }
    }

    public void loadBiggerEqualExpression(){
        if(copyValues){
            String first = releaseRegister();
            String second = getLatestRegister();
            String label = "cmp_" + randomString.nextString();
            content.append("CMP %" + first + ",%" + second + "\n");
            content.append("JGE " + label + "\n");
            content.append("XOR %" + second + ",%" + second + "\n");
            content.append("JMP " + label + "_after\n");
            content.append(label + ":\n");
            content.append("MOV $1,%" + second + "\n");
            content.append(label + "_after:\n");
        }
    }

    public void loadLessEqualExpression(){
        if(copyValues){
            String first = releaseRegister();
            String second = getLatestRegister();
            String label = "cmp_" + randomString.nextString();
            content.append("CMP %" + first + ",%" + second + "\n");
            content.append("JLE " + label + "\n");
            content.append("XOR %" + second + ",%" + second + "\n");
            content.append("JMP " + label + "_after\n");
            content.append(label + ":\n");
            content.append("MOV $1,%" + second + "\n");
            content.append(label + "_after:\n");
        }
    }

    public void loadNotExpression(){
        //todo logical not expression
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
