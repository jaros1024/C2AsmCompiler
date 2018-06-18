package com.perez.jaroslav.compiler.helpers;

import java.util.HashMap;

public class TypeHelper {
    private static HashMap<String, String> types = new HashMap<>();
    private static HashMap<String, Integer> typeSizes = new HashMap<>();
    private static HashMap<String, String> moves = new HashMap<>();

    static {
        types.put("int", ".long");
        types.put("char", ".byte");
        types.put("text", ".asciz");
        types.put("long", ".quad");

        typeSizes.put("int", 4);
        typeSizes.put("char", 1);
        typeSizes.put("void", 0);

        moves.put("int", "movl");
        moves.put("long", "movq");
        moves.put("char", "movb");
    }

    public static String getAssemblyType(String name){
        return types.get(name);
    }

    public static Integer getTypeSize(String name){
        return typeSizes.get(name);
    }

    public static String getMove(String type){
        return moves.get(type);
    }
}
