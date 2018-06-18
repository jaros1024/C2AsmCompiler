package com.perez.jaroslav.compiler.helpers;

public class StackHelper {
    public static int getPositionOnStack(int argNo){
        return (argNo*8) + 16;
    }
}
