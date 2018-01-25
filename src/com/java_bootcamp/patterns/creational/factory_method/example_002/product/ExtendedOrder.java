package com.java_bootcamp.patterns.creational.factory_method.example_002.product;

public class ExtendedOrder extends AbstractOrder {
    @Override
    public void exec() {
        System.out.println("Extended order");
    }
}
