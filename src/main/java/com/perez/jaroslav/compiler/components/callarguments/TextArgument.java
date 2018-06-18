package com.perez.jaroslav.compiler.components.callarguments;

import com.perez.jaroslav.compiler.util.RandomString;

import java.util.concurrent.ThreadLocalRandom;

public class TextArgument extends MethodArgument {
    public String label;

    public TextArgument(){
        RandomString gen = new RandomString(6, ThreadLocalRandom.current());
        label = gen.nextString().toLowerCase();
    }
}
