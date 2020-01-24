package com.learning.days041to060.days059;

public class Outlander extends Car {

    private int roadService;

    public Outlander(int roadService) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadService = roadService;
    }

    public void accelerate(int rate) {
        int newVelocity = super.getCurrentVelocity() + rate;

        if (newVelocity == 0) {
            super.stop();
            super.changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            super.changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            super.changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            super.changeGear(3);
        } else {
            super.changeGear(4);
        }

        if (newVelocity > 0) {
            super.changeVelocity(newVelocity, super.getCurrentDirection());
        }

    }
}
