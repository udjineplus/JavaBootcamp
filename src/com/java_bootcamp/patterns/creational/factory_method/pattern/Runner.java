package com.java_bootcamp.patterns.creational.factory_method.pattern;

public class Runner {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factoryMethod();
        product.check();
    }
}
