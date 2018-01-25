package com.java_bootcamp.patterns.creational.abstract_factory.pattern;

public class Runner {
    public static void main(String[] args) {
        Client client = new Client();
        client.setAbstractFactory(new ConcreteFactory());
        client.action();
    }
}
