package com.java_bootcamp.patterns.creational.builder.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "USA";
    }

    public GPSNavigator(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }
}
