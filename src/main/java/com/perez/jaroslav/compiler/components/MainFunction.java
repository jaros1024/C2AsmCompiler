package com.perez.jaroslav.compiler.components;
import com.perez.jaroslav.compiler.helpers.SystemFunctions;

import static java.lang.String.format;

public class MainFunction extends Function {
    @Override
    public String generate(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(".global _start \n");
        stringBuilder.append("_start: \n");

        //todo implement the rest

        stringBuilder.append("MOV $" + SystemFunctions.EXIT_64 + ",%rax \n");
        stringBuilder.append("SYSCALL \n");

        return stringBuilder.toString();
    }
}
