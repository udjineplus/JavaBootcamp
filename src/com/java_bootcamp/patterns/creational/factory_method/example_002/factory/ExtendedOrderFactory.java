package com.java_bootcamp.patterns.creational.factory_method.example_002.factory;

import com.java_bootcamp.patterns.creational.factory_method.example_002.product.ExtendedOrder;

public class ExtendedOrderFactory extends AbstractOrderFactory<ExtendedOrder> {
    @Override
    public ExtendedOrder createInstance() {
        return new ExtendedOrder();
    }
}
