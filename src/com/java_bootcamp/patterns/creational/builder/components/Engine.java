package com.java_bootcamp.patterns.creational.builder.components;

public class Engine {
    private final double volume;
    private double mileage;
    private static boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }


    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Start engine!");
        }
    }

    public static boolean isStarted() {
        return started;
    }

    public static void on() {
        Engine.started = true;
    }

    public static void of() {
        Engine.started = false;
    }
}
