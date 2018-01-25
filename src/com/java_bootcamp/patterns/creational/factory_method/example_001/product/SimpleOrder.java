package com.java_bootcamp.patterns.creational.factory_method.example_001.product;

public class SimpleOrder extends AbstractOrder {
    @Override
    public void perform() {
        System.out.println("Simple order");
    }
}
