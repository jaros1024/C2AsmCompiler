package com.perez.jaroslav.compiler.helpers;

import java.util.HashMap;

public class TypeHelper {
    private static HashMap<String, String> types = new HashMap<>();
    private static HashMap<String, Integer> typeSizes = new HashMap<>();

    static {
        types.put("int", ".dword");
        types.put("char", ".byte");

        typeSizes.put("int", 4);
        typeSizes.put("char", 1);
        typeSizes.put("void", 0);
    }

    public static String getAssemblyType(String name){
        return types.get(name);
    }

    public static Integer getTypeSize(String name){
        return typeSizes.get(name);
    }
}
