package com.perez.jaroslav.compiler.components.loops;

public class ForLoop extends AbstractLoop {
    public String addTestAfterWhile(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TEST %rax, %rax\n");
        stringBuilder.append("JNE " + label + "_before\n");
        return stringBuilder.toString();
    }
}
