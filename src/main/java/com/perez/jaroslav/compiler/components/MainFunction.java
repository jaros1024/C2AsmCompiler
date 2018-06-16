package com.perez.jaroslav.compiler.components;
import com.perez.jaroslav.compiler.components.functions.Function;
import com.perez.jaroslav.compiler.helpers.SystemFunctions;

import static java.lang.String.format;

public class MainFunction extends Function {
    private String returnText;

    @Override
    public String generate(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("_start: \n");

        stringBuilder.append(content);

        stringBuilder.append(returnText);

        return stringBuilder.toString();
    }

    @Override
    public void functionReturnConstant(String constant){
        StringBuilder sb = new StringBuilder();
        sb.append("MOV $" + constant + ",%rdi\n");
        sb.append("MOV $" + SystemFunctions.EXIT_64 + ",%rax\n");
        sb.append("SYSCALL\n");
        returnText = sb.toString();
    }
}
