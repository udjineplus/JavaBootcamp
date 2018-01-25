package com.java_bootcamp.patterns.creational.abstract_factory.pattern;

public class Client {
    private AbstractFactory abstractFactory;
    private AbstractProduct abstractProduct;
    public void action() {
        abstractProduct = abstractFactory.createProduct();
        abstractProduct.info();
    }
    public void setAbstractFactory(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }
}
