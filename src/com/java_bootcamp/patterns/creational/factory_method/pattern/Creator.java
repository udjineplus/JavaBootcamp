package com.java_bootcamp.patterns.creational.factory_method.pattern;

public abstract class Creator {
    public abstract Product factoryMethod();
    public void anOperation() {
        System.out.println("operation");
    }
}
