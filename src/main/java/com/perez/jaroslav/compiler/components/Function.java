package com.perez.jaroslav.compiler.components;

import com.perez.jaroslav.compiler.helpers.TypeHelper;

import java.util.List;
import static java.lang.String.format;

public class Function {
    public String name;
    public String type;
    public List<Argument> argumentList;

    protected StringBuilder content;

    public Function() {
    }

    public Function(String name, String type, List<Argument> argumentList) {
        this.name = name;
        this.type = type;
        this.argumentList = argumentList;
    }

    public String generate(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(format(".type %s,@function \n\n", name));
        stringBuilder.append(format("%s: \n", name));
        initStack(stringBuilder);

        //todo implement

        cleanStack(stringBuilder);
        stringBuilder.append(ret(TypeHelper.getTypeSize(type)));
        stringBuilder.append('\n');


        return stringBuilder.toString();
    }

    public void start(){

    }

    private String ret(int size){
        return (size == 0 ? "ret" : format("ret %d", size));
    }

    private void initStack(StringBuilder stringBuilder){
        stringBuilder.append("PUSH %rbp\n");
        stringBuilder.append("MOV %rsp,%rbp\n");
    }

    private void cleanStack(StringBuilder stringBuilder){
        stringBuilder.append("MOV %rbp,%rsp\n");
        stringBuilder.append("POP %rbp\n");
    }

    public static class Argument {
        public String name;
        public String type;
    }
}
