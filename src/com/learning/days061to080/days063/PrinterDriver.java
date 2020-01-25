package com.learning.days061to080.days063;

public class PrinterDriver {
    public static void main(String[] args) {

        Printer printer = new Printer(50, true);
        System.out.println("Initial Page Count = " + printer.getPagePrinted());

        System.out.println("Pages printed was " + printer.printPages(4) + ", new new total print count for printer is " + printer.getPagePrinted());

        System.out.println("Pages printed was " + printer.printPages(2) + ", new new total print count for printer is " + printer.getPagePrinted());

        System.out.println("\n=== For Non Duplex Printer ===");
        Printer nonDuplexPrinter = new Printer(50, false);
        System.out.println("Initial Page Count = " + nonDuplexPrinter.getPagePrinted());

        System.out.println("Pages printed was " + nonDuplexPrinter.printPages(4) + ", new new total print count for printer is " + nonDuplexPrinter.getPagePrinted());

        System.out.println("Pages printed was " + nonDuplexPrinter.printPages(2) + ", new new total print count for printer is " + nonDuplexPrinter.getPagePrinted());

    }
}
