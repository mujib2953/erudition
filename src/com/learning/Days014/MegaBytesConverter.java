package com.learning.Days014;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(
        int kiloBytes
    ) {

        if (kiloBytes >= 0) {
            int MB = kiloBytes / 1024;
            int KB = kiloBytes % 1024;

            System.out.println(
                kiloBytes +
                " KB = " +
                MB +
                " MB and " +
                KB +
                " KB"
            );

        } else {
            System.out.println("Invalid Value");
        }
    }
}
