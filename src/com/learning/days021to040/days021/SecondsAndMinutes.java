package com.learning.days021to040.days021;

public class SecondsAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(80, 26));
        System.out.println(getDurationString(65, 45));
    }

    public static String getDurationString(
        final int minutes,
        final int seconds
    ) {
        boolean isMinutesValid = (minutes >= 0);
        boolean isSecondsValid = (seconds >=0 && seconds <= 59);

        if (!(isMinutesValid || isSecondsValid)) {
            return "Invalid Value";
        }

        int hrs = minutes / 60;
        int min = minutes % 60;

        return appendZeroIfRequired(hrs) + "h " + appendZeroIfRequired(min) + "m " + appendZeroIfRequired(seconds) + "s";
    }

    public static String getDurationString(
        final int seconds
    ) {
        boolean isSeocndsValid = (seconds >= 0);

        if (!isSeocndsValid) {
            return "Invalid Value";
        }
        int min = seconds / 60;
        int remainingSec = seconds % 60;

        return getDurationString(min, remainingSec);
    }

    public static String appendZeroIfRequired(final int number) {
        String tobeAppend = "";

        if (number < 10) {
            tobeAppend = "0";
        }

        return tobeAppend + number;
    }
}
