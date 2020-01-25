package com.learning.days061to080.days063;

public class Printer {

    private int tonerLevel;
    private int pagePrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel > -1 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;

        this.pagePrinted = 0;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if ((tonerAmount + this.tonerLevel) > 100) {
                return -1;
            }

            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }

        return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;

        if (this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode.");
        }

        this.pagePrinted += pagesToPrint;
        return pagesToPrint;
    }
}
