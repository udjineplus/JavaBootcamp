package com.java_bootcamp.patterns.creational.abstract_factory.example_001.factory;

import com.java_bootcamp.patterns.creational.abstract_factory.example_001.product.TCPAudioContent;
import com.java_bootcamp.patterns.creational.abstract_factory.example_001.product.TCPMediaContent;
import com.java_bootcamp.patterns.creational.abstract_factory.example_001.product.UDPAudioContent;
import com.java_bootcamp.patterns.creational.abstract_factory.example_001.product.UDPMediaContent;

public class AudioFactory extends AbstractMediaFactory {
    @Override
    public TCPMediaContent createTCPObject() {
        return new TCPAudioContent();
    }

    @Override
    public UDPMediaContent createUDPObject() {
        return new UDPAudioContent();
    }
}
