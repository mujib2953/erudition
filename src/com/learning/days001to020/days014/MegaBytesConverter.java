package com.learning.days001to020.days014;

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
