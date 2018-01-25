package com.java_bootcamp.patterns.creational.builder.components;

import com.java_bootcamp.patterns.creational.builder.cars.Car;

public class TripComputer {


    public void condition() {
        if (Engine.isStarted()) {
            System.out.println("Car is started.");
        } else {
            System.out.println("Car isn't started.");
        }
    }

    public void fuelLevel() {
        System.out.println(Car.getFuel());
    }

}
