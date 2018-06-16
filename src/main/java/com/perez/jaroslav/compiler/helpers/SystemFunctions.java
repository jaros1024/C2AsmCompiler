package com.perez.jaroslav.compiler.helpers;

import com.perez.jaroslav.compiler.components.functions.ExternalFunction;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

public class SystemFunctions {
    public static final int WRITE_64 = 1;
    public static final int EXIT_64 = 60;

    public static final int STDOUT = 1;

    private static HashMap<String, HashMap<String, ExternalFunction>> headers = new HashMap<>();

    static {
        HashMap<String, ExternalFunction> stdio = new HashMap<>();
        ExternalFunction printf = new ExternalFunction();
        printf.name = "printf";
        printf.type = "void";
        //todo add variable length argument list
        printf.argumentList = new LinkedList<>();
        stdio.put(printf.name, printf);
        headers.put("stdio", stdio);
    }

    public static Collection<HashMap<String, ExternalFunction>> getExternalFunctions(String name){
        return headers.values();
    }
}
