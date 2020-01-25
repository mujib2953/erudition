package com.learning.days061to080.days064;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;

        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println( getClass().getSimpleName() + ".startEngine() :: starting engine.");
    }

    public void accelerate() {
        System.out.println(getClass().getSimpleName() + ".accelerate() :: car is accelerating.");
    }

    public void brake() {
        System.out.println(getClass().getSimpleName() + ".brake() :: brake is applied, car is stopping.");
    }
}
