package com.perez.jaroslav.compiler.helpers;

import com.perez.jaroslav.compiler.components.variables.AbstractVariable;
import com.perez.jaroslav.compiler.components.variables.ArgumentVariable;
import com.perez.jaroslav.compiler.components.variables.Global;
import com.perez.jaroslav.compiler.components.variables.Variable;
import com.perez.jaroslav.compiler.exceptions.BadSyntaxException;
import com.perez.jaroslav.compiler.program.CompilationUnit;

public class VariableHelper {
    public static String getVariableOperand(String name, CompilationUnit compilationUnit){
        AbstractVariable variable = compilationUnit.getVariable(name);

        if(variable instanceof Variable){
            Variable v = (Variable) variable;
            return v.address;
        }
        //if this is global variable
        else if(variable instanceof Global){
            return variable.name;
        }
        else if(variable instanceof ArgumentVariable){
            ArgumentVariable av = (ArgumentVariable) variable;
            int position = StackHelper.getPositionOnStack(Integer.parseInt(av.location));
            return position + "(%rbp)";

        }
        throw new BadSyntaxException("Unknown identifier: " + name);
    }
}
