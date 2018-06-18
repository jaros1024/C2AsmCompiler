package com.perez.jaroslav.compiler.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Registers {
    private static List<String> registersForArguments = new ArrayList<>();

    static {
        registersForArguments.add("rdi");
        registersForArguments.add("rsi");
        registersForArguments.add("rdx");
        registersForArguments.add("rcx");
        registersForArguments.add("r8");
        registersForArguments.add("r9");
    }

    public static String getRegisterForArgument(int n){
        if(n >= registersForArguments.size()){
            return null;
        }
        return registersForArguments.get(n);
    }
}
