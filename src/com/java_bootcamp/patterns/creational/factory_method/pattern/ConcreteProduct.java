package com.java_bootcamp.patterns.creational.factory_method.pattern;

public class ConcreteProduct implements Product {
    @Override
    public void check() {
        System.out.println("concrete product");
    }
}
