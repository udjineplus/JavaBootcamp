package com.java_bootcamp.patterns.creational.factory_method.example_001;

import com.java_bootcamp.patterns.creational.factory_method.example_001.product.AbstractOrder;

public class Runner {
    public static void main(String[] args) {
        AbstractOrder abstractOrder = OrderFactory.createOrderFromFactory(TypeOrder.EXTENDED.name());
        AbstractOrder abstractOrder2 = OrderFactory.createOrderFromFactory(TypeOrder.SIMPLE.name());
        abstractOrder.perform();
        abstractOrder2.perform();
    }
}
