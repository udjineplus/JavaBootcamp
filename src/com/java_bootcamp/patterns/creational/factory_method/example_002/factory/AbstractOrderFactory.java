package com.java_bootcamp.patterns.creational.factory_method.example_002.factory;

import com.java_bootcamp.patterns.creational.factory_method.example_002.product.AbstractOrder;

public abstract class AbstractOrderFactory<T extends AbstractOrder> {
    public abstract T createInstance();
    public void anOperation() {
        System.out.println("operation");
    }
}
