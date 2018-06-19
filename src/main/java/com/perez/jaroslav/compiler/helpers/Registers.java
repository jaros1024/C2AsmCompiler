package com.perez.jaroslav.compiler.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Registers {
    private static List<String> registersForArguments = new ArrayList<>();
    private static HashMap<RegisterData, String> registersForData = new HashMap<>();
    private static List<String> registersForOperands = new ArrayList<>();

    static {
        registersForArguments.add("rdi");
        registersForArguments.add("rsi");
        registersForArguments.add("rdx");
        registersForArguments.add("rcx");
        registersForArguments.add("r8");
        registersForArguments.add("r9");

        registersForData.put(new RegisterData("rax", 8), "rax");
        registersForData.put(new RegisterData("rax", 4), "eax");
        registersForData.put(new RegisterData("rax", 2), "ax");
        registersForData.put(new RegisterData("rax", 1), "al");
        registersForData.put(new RegisterData("rbx", 8), "rbx");
        registersForData.put(new RegisterData("rbx", 4), "ebx");
        registersForData.put(new RegisterData("rbx", 2), "bx");
        registersForData.put(new RegisterData("rbx", 1), "bl");
        registersForData.put(new RegisterData("rcx", 8), "rcx");
        registersForData.put(new RegisterData("rcx", 4), "ecx");
        registersForData.put(new RegisterData("rcx", 2), "cx");
        registersForData.put(new RegisterData("rcx", 1), "cl");
        registersForData.put(new RegisterData("rdx", 8), "rdx");
        registersForData.put(new RegisterData("rdx", 4), "edx");
        registersForData.put(new RegisterData("rdx", 2), "dx");
        registersForData.put(new RegisterData("rdx", 1), "dl");
        registersForData.put(new RegisterData("rsi", 8), "rsi");
        registersForData.put(new RegisterData("rsi", 4), "esi");
        registersForData.put(new RegisterData("rsi", 2), "si");
        registersForData.put(new RegisterData("rsi", 1), "sil");
        registersForData.put(new RegisterData("rdi", 8), "rdi");
        registersForData.put(new RegisterData("rdi", 4), "edi");
        registersForData.put(new RegisterData("rdi", 2), "di");
        registersForData.put(new RegisterData("rdi", 1), "dil");
        registersForData.put(new RegisterData("rbp", 8), "rbp");
        registersForData.put(new RegisterData("rbp", 4), "ebp");
        registersForData.put(new RegisterData("rbp", 2), "bp");
        registersForData.put(new RegisterData("rbp", 1), "bpl");
        registersForData.put(new RegisterData("rsp", 8), "rsp");
        registersForData.put(new RegisterData("rsp", 4), "esp");
        registersForData.put(new RegisterData("rsp", 2), "sp");
        registersForData.put(new RegisterData("rsp", 1), "spl");
        registersForData.put(new RegisterData("r8", 8), "r8");
        registersForData.put(new RegisterData("r8", 4), "r8d");
        registersForData.put(new RegisterData("r8", 2), "r8w");
        registersForData.put(new RegisterData("r8", 1), "r8b");
        registersForData.put(new RegisterData("r9", 8), "r9");
        registersForData.put(new RegisterData("r9", 4), "r9d");
        registersForData.put(new RegisterData("r9", 2), "r9w");
        registersForData.put(new RegisterData("r9", 1), "r9b");
        registersForData.put(new RegisterData("r10", 8), "r10");
        registersForData.put(new RegisterData("r10", 4), "r10d");
        registersForData.put(new RegisterData("r10", 2), "r10w");
        registersForData.put(new RegisterData("r10", 1), "r10b");
        registersForData.put(new RegisterData("r11", 8), "r11");
        registersForData.put(new RegisterData("r11", 4), "r11d");
        registersForData.put(new RegisterData("r11", 2), "r11w");
        registersForData.put(new RegisterData("r11", 1), "r11b");
        registersForData.put(new RegisterData("r12", 8), "r12");
        registersForData.put(new RegisterData("r12", 4), "r12d");
        registersForData.put(new RegisterData("r12", 2), "r12w");
        registersForData.put(new RegisterData("r12", 1), "r12b");
        registersForData.put(new RegisterData("r13", 8), "r13");
        registersForData.put(new RegisterData("r13", 4), "r13d");
        registersForData.put(new RegisterData("r13", 2), "r13w");
        registersForData.put(new RegisterData("r13", 1), "r13b");
        registersForData.put(new RegisterData("r14", 8), "r14");
        registersForData.put(new RegisterData("r14", 4), "r14d");
        registersForData.put(new RegisterData("r14", 2), "r14w");
        registersForData.put(new RegisterData("r14", 1), "r14b");
        registersForData.put(new RegisterData("r15", 8), "r15");
        registersForData.put(new RegisterData("r15", 4), "r15d");
        registersForData.put(new RegisterData("r15", 2), "r15w");
        registersForData.put(new RegisterData("r15", 1), "r15b");

        registersForOperands.add("r8");
        registersForOperands.add("r9");
        registersForOperands.add("r10");
        registersForOperands.add("r11");
        registersForOperands.add("r12");
        registersForOperands.add("r13");
        registersForOperands.add("r14");
    }

    public static String getRegisterForArgument(int n){
        if(n >= registersForArguments.size()){
            return null;
        }
        return registersForArguments.get(n);
    }

    public static String getRegisterForType(String register, String type){
        int size = TypeHelper.getTypeSize(type);
        RegisterData registerData = new RegisterData(register, size);
        return registersForData.get(registerData);
    }

    public static String getRegisterForOperand(int operand){
        return registersForOperands.get(operand);
    }

    private static class RegisterData {
        public String register;
        public int size;

        public RegisterData(String register, int size) {
            this.register = register;
            this.size = size;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            RegisterData that = (RegisterData) o;
            return size == that.size &&
                    Objects.equals(register, that.register);
        }

        @Override
        public int hashCode() {
            return Objects.hash(register, size);
        }
    }
}
