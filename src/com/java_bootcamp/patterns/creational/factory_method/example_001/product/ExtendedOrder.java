package com.java_bootcamp.patterns.creational.factory_method.example_001.product;

public class ExtendedOrder extends AbstractOrder {
    @Override
    public void perform() {
        System.out.println("Extended order");
    }
}
