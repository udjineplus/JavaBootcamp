package com.java_bootcamp.patterns.creational.abstract_factory.example_001;

import com.java_bootcamp.patterns.creational.abstract_factory.example_001.factory.AbstractMediaFactory;
import com.java_bootcamp.patterns.creational.abstract_factory.example_001.product.TCPMediaContent;
import com.java_bootcamp.patterns.creational.abstract_factory.example_001.product.UDPMediaContent;

public class Client {
    private UDPMediaContent udpMediaContent;
    private TCPMediaContent tcpMediaContent;

    public void makeMediaFactoryWork(AbstractMediaFactory abstractMediaFactory) {
        udpMediaContent = abstractMediaFactory.createUDPObject();
        tcpMediaContent = abstractMediaFactory.createTCPObject();
    }
}
