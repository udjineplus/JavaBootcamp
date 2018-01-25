package com.java_bootcamp.patterns.creational.abstract_factory.example_001.factory;

import com.java_bootcamp.patterns.creational.abstract_factory.example_001.product.*;

public class VideoFactory extends AbstractMediaFactory {
    @Override
    public TCPMediaContent createTCPObject() {
        return new TCPVideoContent();
    }

    @Override
    public UDPMediaContent createUDPObject() {
        return new UDPVideoContent();
    }
}
