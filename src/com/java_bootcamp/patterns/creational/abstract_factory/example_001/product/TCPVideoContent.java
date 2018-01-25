package com.java_bootcamp.patterns.creational.abstract_factory.example_001.product;

public class TCPVideoContent extends TCPMediaContent {
    @Override
    void play() {
        System.out.println("TCPVideoContent");
    }
}
