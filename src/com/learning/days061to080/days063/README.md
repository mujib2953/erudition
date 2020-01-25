Printer Problem (Encapsulation)
--

#### Problem statement:

- Create a class and demonstrate proper **encapsulation** technique.
- The class will be called **Printer**.
- It will simulate a real Computer Printer.
- It should have fields for the **toner level**, **number of pages printed** and
- also whether it is a **duplex printer** (capable of printing both side of the paper).
- And method to **fill up the toner** (upto maximum of **100%**), another method to
- simulate printing pages (which should increase the number of pages printed.)
 

#### Solution:
**Printer.java**
```java
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
```

**PrinterDriver.java**
```java
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
```

#### Explanation:

- Code is self explanatory.
- **Encapsulation** is hiding/protecting some data in class.
- So that it should no be updated by someone else.
- In the above example we are protecting `pagePrinted` field.
#### Output
 ```
Initial Page Count = 0
Printing in duplex mode.
Pages printed was 2, new new total print count for printer is 2
Printing in duplex mode.
Pages printed was 1, new new total print count for printer is 3

=== For Non Duplex Printer ===
Initial Page Count = 0
Pages printed was 4, new new total print count for printer is 4
Pages printed was 2, new new total print count for printer is 6

```