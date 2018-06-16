package com.perez.jaroslav.compiler.components.functions;

import com.perez.jaroslav.compiler.exceptions.BadSyntaxException;
import com.perez.jaroslav.compiler.helpers.TypeHelper;

import java.util.List;
import static java.lang.String.format;

public class Function extends AbstractFunction{

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

        stringBuilder.append(content.toString());

        cleanStack(stringBuilder);
        stringBuilder.append(ret(0));
        stringBuilder.append('\n');

        return stringBuilder.toString();
    }

    public void start(){
        content = new StringBuilder();
    }

    public void functionReturn(){
        if(!type.equals("void")){
            throw new BadSyntaxException("Function must return value");
        }

        cleanStack(content);
        content.append(ret(TypeHelper.getTypeSize(type)));
    }

    public void functionReturnVariable(String variable){
        if(type.equals("void")){
            throw new BadSyntaxException("Void function cannot return any values");
        }

        //todo implement
    }

    public void addCode(String code){
        content.append(code);
    }

    public void functionReturnConstant(String constant){
        if(type.equals("void")){
            throw new BadSyntaxException("Void function cannot return any values");
        }

        content.append("MOV $" + constant + ",%rax\n");
        cleanStack(content);
        content.append(ret(0));
    }

    private String ret(int size){
        return (size == 0 ? "ret" : format("ret %d", size)) + "\n";
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
