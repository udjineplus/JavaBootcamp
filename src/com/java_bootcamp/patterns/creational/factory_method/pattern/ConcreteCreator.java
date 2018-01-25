package com.java_bootcamp.patterns.creational.factory_method.pattern;

public class ConcreteCreator extends Creator {
    @Override
    public Product factoryMethod() {
        this.anOperation();
        return new ConcreteProduct();
    }
}
