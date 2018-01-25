package com.java_bootcamp.patterns.creational.factory_method.example_001;

import com.java_bootcamp.patterns.creational.factory_method.example_001.product.AbstractOrder;
import com.java_bootcamp.patterns.creational.factory_method.example_001.product.ExtendedOrder;
import com.java_bootcamp.patterns.creational.factory_method.example_001.product.SimpleOrder;

public class OrderFactory {
    public static AbstractOrder createOrderFromFactory(String type) {
        TypeOrder typeOrder = TypeOrder.valueOf(type.toUpperCase());
        switch (typeOrder) {
            case SIMPLE:
                return new SimpleOrder();
            case EXTENDED:
                return new ExtendedOrder();
            default:
                throw new EnumConstantNotPresentException(TypeOrder.class, typeOrder.name());
        }
    }
    public void anOperation() {
        System.out.println("operation");
    }
}
