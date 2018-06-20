package com.perez.jaroslav.compiler.listener.functional;

import com.perez.jaroslav.compiler.antlr.C2asmParser;
import com.perez.jaroslav.compiler.components.callarguments.MethodArgument;
import com.perez.jaroslav.compiler.components.callarguments.TextArgument;
import com.perez.jaroslav.compiler.listener.base.AbstractBaseListener;

import java.util.LinkedList;
import java.util.List;

public class MethodCallListener extends AbstractBaseListener {
    private String methodName;
    List<MethodArgument> arguments = new LinkedList<>();

    public MethodCallListener(String methodName) {
        this.methodName = methodName;
    }

    @Override
    public void enterPrimary_expression(C2asmParser.Primary_expressionContext ctx) {
        C2asmParser.ConstantContext constantContext = ctx.constant();
        MethodArgument argument;
        String value = ctx.getText();
        if(constantContext == null){
            argument = new MethodArgument();
            argument.type = MethodArgument.TYPE_VAR;
            argument.value = value;
        }
        else {
            if(value.charAt(0) == '"' && value.charAt(value.length()-1) == '"'){
                argument = new TextArgument();
            }
            else {
                argument = new MethodArgument();
            }
            argument.type = MethodArgument.TYPE_CONST;
            argument.value = value;
        }
        arguments.add(argument);
    }

    @Override
    public void exitArgument_expression_list(C2asmParser.Argument_expression_listContext ctx) {
        arguments.remove(0);
        redirectListener.getCompilationUnit().callFunction(methodName, arguments);
        redirectListener.setBaseListener(redirectListener.previousListener, new MainListener());
    }
}
