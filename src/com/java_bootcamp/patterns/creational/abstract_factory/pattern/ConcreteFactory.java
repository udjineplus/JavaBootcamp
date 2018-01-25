package com.java_bootcamp.patterns.creational.abstract_factory.pattern;

public class ConcreteFactory implements AbstractFactory {
    @Override
    public AbstractProduct createProduct() {
        System.out.println("Creating concrete product");
        AbstractProduct product = new ConcreteProduct();
        return product;
    }
}
