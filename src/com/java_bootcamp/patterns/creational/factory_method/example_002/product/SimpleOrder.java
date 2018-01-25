package com.java_bootcamp.patterns.creational.factory_method.example_002.product;

public class SimpleOrder extends AbstractOrder {
    @Override
    public void exec() {
        System.out.println("Simple order");
    }
}
