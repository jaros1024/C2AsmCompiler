package com.perez.jaroslav.compiler.listener.functional;

import com.perez.jaroslav.compiler.antlr.C2asmParser;
import com.perez.jaroslav.compiler.components.functions.Function;
import com.perez.jaroslav.compiler.listener.base.AbstractBaseListener;

public class ReturnListener extends AbstractBaseListener {
    private boolean waitForReturnVariable = true;
    private Function function;

    public ReturnListener(Function function) {
        this.function = function;
    }

    @Override
    public void exitPrimary_expression(C2asmParser.Primary_expressionContext ctx) {
        if(waitForReturnVariable && redirectListener.getCompilationUnit().parsedFunction != null){
            function.functionReturnVariable(ctx.getText());
            redirectListener.setBaseListener(new MainListener(), this);
        }
    }

    @Override
    public void enterConstant(C2asmParser.ConstantContext ctx) {
        if(waitForReturnVariable && redirectListener.getCompilationUnit().parsedFunction != null){
            function.functionReturnConstant(ctx.getText());
            redirectListener.setBaseListener(new MainListener(), this);
        }
    }

}
