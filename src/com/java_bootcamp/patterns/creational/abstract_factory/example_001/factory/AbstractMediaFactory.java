package com.java_bootcamp.patterns.creational.abstract_factory.example_001.factory;

import com.java_bootcamp.patterns.creational.abstract_factory.example_001.product.TCPMediaContent;
import com.java_bootcamp.patterns.creational.abstract_factory.example_001.product.UDPMediaContent;

public abstract class AbstractMediaFactory {
    public abstract TCPMediaContent createTCPObject();
    public abstract UDPMediaContent createUDPObject();
}
