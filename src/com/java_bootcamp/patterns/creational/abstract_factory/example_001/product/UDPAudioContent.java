package com.java_bootcamp.patterns.creational.abstract_factory.example_001.product;

public class UDPAudioContent extends UDPMediaContent {
    @Override
    void play() {
        System.out.println("UDPAudioContent");
    }

    @Override
    void transform() {
        System.out.println("UDPAudioContent");
    }
}
