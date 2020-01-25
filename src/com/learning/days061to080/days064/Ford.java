package com.learning.days061to080.days064;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + ".startEngine() :: starting engine.");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName() + ".accelerate() :: car is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName() + ".brake() :: brake is applied, car is stopping.");
    }
}
