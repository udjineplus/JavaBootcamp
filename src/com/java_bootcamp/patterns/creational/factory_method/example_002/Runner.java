package com.java_bootcamp.patterns.creational.factory_method.example_002;

import com.java_bootcamp.patterns.creational.factory_method.example_002.factory.ExtendedOrderFactory;
import com.java_bootcamp.patterns.creational.factory_method.example_002.factory.SimpleOrderFactory;

public class Runner {
    public static void main(String[] args) {
        Client client = new Client();
        client.someOperation(new SimpleOrderFactory());
        client.someOperation(new ExtendedOrderFactory());
    }
}
