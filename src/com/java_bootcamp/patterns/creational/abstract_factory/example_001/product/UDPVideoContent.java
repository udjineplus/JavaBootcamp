package com.java_bootcamp.patterns.creational.abstract_factory.example_001.product;

public class UDPVideoContent extends UDPMediaContent {
    @Override
    void play() {
        System.out.println("UDPVideoContent");
    }

    @Override
    void transform() {
        System.out.println("UDPVideoContent");
    }
}
