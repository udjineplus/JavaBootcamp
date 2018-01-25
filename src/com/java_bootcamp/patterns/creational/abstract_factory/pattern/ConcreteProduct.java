package com.java_bootcamp.patterns.creational.abstract_factory.pattern;

public class ConcreteProduct implements AbstractProduct {
    @Override
    public void info() {
        System.out.println("Concrete product");
    }
}
