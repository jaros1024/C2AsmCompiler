package com.perez.jaroslav.compiler.expressions.evaluator;

import com.perez.jaroslav.compiler.components.variables.AbstractVariable;
import com.perez.jaroslav.compiler.helpers.Registers;
import com.perez.jaroslav.compiler.helpers.TypeHelper;
import com.perez.jaroslav.compiler.util.RandomString;

import java.util.Stack;

public class ExpressionEvaluator {
    private StringBuilder content = new StringBuilder();
    private int primaryExprCounter = 0;

    public boolean copyExpValue = true;
    public boolean copyAddress = false;
    public String copyMov;
    public String copyRegister;
    public String copyType;

    private Stack<String> usedRegisters = new Stack<>();
    private String assignmentTarget;

    private RandomString randomString = new RandomString(8);

    public String getExpression(){
        return content.toString();
    }

    //used when loading variable
    public void loadPrimaryExpression(String operand, String type){
        if(copyExpValue){
            String baseRegister = getNextRegister();
            String mov = TypeHelper.getMove(type);
            String register = Registers.getRegisterForType(baseRegister, type);
            if(copyAddress){
                copyRegister = baseRegister;
                copyType = type;
            }
            content.append("XOR %" + register + ",%" + register + "\n");
            content.append(mov.toUpperCase() + " " + operand + ",%" + register + "\n");

            if(copyAddress){
                loadOperandAddress(operand);
                copyMov = mov;
            }
        }
        else {
            assignmentTarget = operand;
        }
    }

    //used when loading const
    public void loadPrimaryExpression(String operand){
        if(copyExpValue){
            String register = getNextRegister();
            content.append("XOR %" + register + ",%" + register + "\n");
            content.append("MOV " + operand + ",%" + register + "\n");
        }
        else {
            assignmentTarget = operand;
        }
    }

    private void loadOperandAddress(String operand){
        String register = getNextRegister();
        content.append("XOR %" + register + ",%" + register + "\n");
        content.append("LEA " + operand + ",%" + register + "\n");
    }

    public void loadAdditiveExpression(){
        if(copyExpValue){
            String first = releaseRegister();
            String second = getLatestRegister();
            content.append("ADD %" + first + ",%" + second + "\n");
        }
    }

    public void loadSubtractiveExpression(){
        if(copyExpValue){
            String first = releaseRegister();
            String second = getLatestRegister();
            content.append("SUB %" + first + ",%" + second + "\n");
        }
    }

    public void loadDivisionExpression(){
        if(copyExpValue){
            String first = releaseRegister();
            String second = getLatestRegister();
            content.append("MOV %" + second + ",%rax\n");
            content.append("XOR %rdx,%rdx\n");
            content.append("IDIV %" + first + "\n");
            content.append("MOV %rax,%" + second + "\n");
        }
    }

    public void loadModuloExpression(){
        if(copyExpValue){
            String first = releaseRegister();
            String second = getLatestRegister();
            content.append("MOV %" + second + ",%rax\n");
            content.append("XOR %rdx,%rdx\n");
            content.append("IDIV %" + first + "\n");
            content.append("MOV %rdx,%" + second + "\n");
        }
    }

    public void loadPostfixIncrementExpression(){
        String address = releaseRegister();
        String copyValueRegister = Registers.getRegisterForType(copyRegister, copyType);
        content.append("PUSH %" + copyRegister + "\n");
        content.append("INC %" + copyValueRegister + "\n");
        content.append(copyMov.toUpperCase() + " %" + copyValueRegister + ",(%" + address + ")\n");
        content.append("POP %" + copyRegister + "\n");
    }

    public void loadPostfixDecrementExpression(){
        String address = releaseRegister();
        String copyValueRegister = Registers.getRegisterForType(copyRegister, copyType);
        content.append("PUSH %" + copyRegister + "\n");
        content.append("DEC %" + copyValueRegister + "\n");
        content.append(copyMov.toUpperCase() + " %" + copyValueRegister + ",(%" + address + ")\n");
        content.append("POP %" + copyRegister + "\n");
    }

    public void loadPrefixIncrementExpression(){
        String address = releaseRegister();
        String copyValueRegister = Registers.getRegisterForType(copyRegister, copyType);
        content.append("INC %" + copyValueRegister + "\n");
        content.append(copyMov.toUpperCase() + " %" + copyValueRegister + ",(%" + address + ")\n");
    }

    public void loadPrefixDecrementExpression(){
        String address = releaseRegister();
        String copyValueRegister = Registers.getRegisterForType(copyRegister, copyType);
        content.append("DEC %" + copyValueRegister + "\n");
        content.append(copyMov.toUpperCase() + " %" + copyValueRegister + ",(%" + address + ")\n");
    }

    public void loadBiggerThanExpression(){
        if(copyExpValue){
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
        if(copyExpValue){
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
        if(copyExpValue){
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
        if(copyExpValue){
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
        if(copyExpValue){
            String register = getLatestRegister();
            String label = "bool_" + randomString.nextString();
            content.append("TEST %" + register + ",%" + register + "\n");
            content.append("JNZ " + label + "\n");
            content.append("MOV $1,%" + register + "\n");
            content.append("JMP " + label + "_after\n");
            content.append(label + ":\n");
            content.append("XOR %" + register + ",%" + register + "\n");
            content.append(label + "_after:\n");
        }
    }

    public void loadLogicalOrExpression(){
        if(copyExpValue){
            String first = releaseRegister();
            String second = getLatestRegister();
            content.append("OR %" + first + ",%" + second + "\n");
        }
    }

    public void loadLogicalAndExpression(){
        if(copyExpValue){
            String first = releaseRegister();
            String second = getLatestRegister();
            content.append("AND %" + first + ",%" + second + "\n");
        }
    }

    public void loadMultiplicativeExpression(){
        if(copyExpValue){
            String first = releaseRegister();
            String second = getLatestRegister();
            content.append("IMUL %" + first + ",%" + second + "\n");
        }
    }

    public void loadEqualityExpression(){
        if(copyExpValue){
            String first = releaseRegister();
            String second = getLatestRegister();
            content.append("XOR %" + first + ",%" + second + "\n");
            content.append("NOT %" + second + "\n");
        }
    }

    public void loadInequalityExpression(){
        if(copyExpValue){
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
        if(copyExpValue){
            String register = releaseRegister();
            content.append("MOV %" + register +",%rax\n");
        }
    }

    public void loadAddAssignmentExpression(){
        String operand = releaseRegister();
        String address = releaseRegister();
        String copyValueRegister = Registers.getRegisterForType(copyRegister, copyType);
        content.append("ADD %" + operand + ",%" + copyRegister + "\n");
        content.append(copyMov.toUpperCase() + " %" + copyValueRegister + ",(%" + address + ")\n");
    }

    public void loadSubAssignmentExpression(){
        String operand = releaseRegister();
        String address = releaseRegister();
        String copyValueRegister = Registers.getRegisterForType(copyRegister, copyType);
        content.append("SUB %" + operand + ",%" + copyRegister + "\n");
        content.append(copyMov.toUpperCase() + " %" + copyValueRegister + ",(%" + address + ")\n");
    }

    public void loadMulAssignmentExpression(){
        String operand = releaseRegister();
        String address = releaseRegister();
        String copyValueRegister = Registers.getRegisterForType(copyRegister, copyType);
        content.append("IMUL %" + operand + ",%" + copyRegister + "\n");
        content.append(copyMov.toUpperCase() + " %" + copyValueRegister + ",(%" + address + ")\n");
    }

    public void loadDivAssignmentExpression(){
        String operand = releaseRegister();
        String address = releaseRegister();
        String copyValueRegister = Registers.getRegisterForType(copyRegister, copyType);
        content.append("MOV %" + copyRegister + ",%rax\n");
        content.append("XOR %rdx,%rdx\n");
        content.append("IDIV %" + operand + "\n");
        content.append("MOV %rax,%" + copyRegister + "\n");
        content.append(copyMov.toUpperCase() + " %" + copyValueRegister + ",(%" + address + ")\n");
    }

    public void loadModAssignmentExpression(){
        String operand = releaseRegister();
        String address = releaseRegister();
        String copyValueRegister = Registers.getRegisterForType(copyRegister, copyType);
        content.append("MOV %" + copyRegister + ",%rax\n");
        content.append("XOR %rdx,%rdx\n");
        content.append("IDIV %" + operand + "\n");
        content.append("MOV %rdx,%" + copyRegister + "\n");
        content.append(copyMov.toUpperCase() + " %" + copyValueRegister + ",(%" + address + ")\n");
    }

    public void loadAddressExpression(){
        String address = releaseRegister();
        content.append("MOV %" + address + ",%" + copyRegister + "\n");
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
