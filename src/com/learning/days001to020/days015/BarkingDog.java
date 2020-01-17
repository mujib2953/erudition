package com.learning.days001to020.days015;

public class BarkingDog {

    public static boolean shouldWakeUp(
        boolean isDogBarking,
        int hourOfDay
    ) {
        if (isDogBarking && hourOfDay <= 23 && hourOfDay >= 0) {
            return (hourOfDay < 8 || hourOfDay > 22);
        }
        return false;
    }
}
