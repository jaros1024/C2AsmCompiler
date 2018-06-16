package com.perez.jaroslav.compiler.listener.base;

import com.perez.jaroslav.compiler.antlr.C2asmBaseListener;
import com.perez.jaroslav.compiler.listener.RedirectListener;

public abstract class AbstractBaseListener extends C2asmBaseListener {
    protected RedirectListener redirectListener;

    public void setRedirectListener(RedirectListener redirectListener) {
        this.redirectListener = redirectListener;
    }
}
