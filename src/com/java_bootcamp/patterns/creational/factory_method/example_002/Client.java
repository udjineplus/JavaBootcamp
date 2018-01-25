package com.java_bootcamp.patterns.creational.factory_method.example_002;

import com.java_bootcamp.patterns.creational.factory_method.example_002.factory.AbstractOrderFactory;
import com.java_bootcamp.patterns.creational.factory_method.example_002.product.AbstractOrder;

public class Client {
    public void someOperation(AbstractOrderFactory factory) {
        AbstractOrder order = factory.createInstance();
        order.exec();
    }
}
