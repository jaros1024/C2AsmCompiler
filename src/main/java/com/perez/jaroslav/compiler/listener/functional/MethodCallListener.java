package com.perez.jaroslav.compiler.listener.functional;

import com.perez.jaroslav.compiler.antlr.C2asmParser;
import com.perez.jaroslav.compiler.helpers.SystemFunctions;
import com.perez.jaroslav.compiler.listener.base.AbstractBaseListener;

import java.util.LinkedList;
import java.util.List;

public class MethodCallListener extends AbstractBaseListener {
    private String methodName;
    List<String> arguments = new LinkedList<>();

    public MethodCallListener(String methodName) {
        this.methodName = methodName;
    }

    @Override
    public void enterPrimary_expression(C2asmParser.Primary_expressionContext ctx) {
        String argument = ctx.getText();
        arguments.add(argument);
    }

    @Override
    public void exitArgument_expression_list(C2asmParser.Argument_expression_listContext ctx) {
        //redirectListener.getCompilationUnit().parsedFunction
        redirectListener.setBaseListener(new MainListener());
    }
}
