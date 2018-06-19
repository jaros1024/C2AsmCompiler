package com.perez.jaroslav.compiler.components.loops;

import com.perez.jaroslav.compiler.util.RandomString;

public abstract class AbstractLoop {
    public String label = new RandomString(8).nextString();
}
