package com.java_bootcamp.patterns.creational.abstract_factory.example_001;

import com.java_bootcamp.patterns.creational.abstract_factory.example_001.factory.AudioFactory;

public class Runner {
    public static void main(String[] args) {
        Client client = new Client();
        client.makeMediaFactoryWork(new AudioFactory());
    }
}
