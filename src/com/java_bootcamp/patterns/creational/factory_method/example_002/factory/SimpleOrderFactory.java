package com.java_bootcamp.patterns.creational.factory_method.example_002.factory;

import com.java_bootcamp.patterns.creational.factory_method.example_002.product.SimpleOrder;

public class SimpleOrderFactory extends AbstractOrderFactory<SimpleOrder> {
    @Override
    public SimpleOrder createInstance() {
        return new SimpleOrder();
    }
}
