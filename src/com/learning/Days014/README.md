MegaBytes Converter Challenge
--

#### Problem statement:
Follow the below steps for challenge:

- Write a method called **printMegaBytesAndKiloBytes** that has **1 parameter of type int** with the name **kiloBytes**.
- The method should not return anything and it needs to calculate the megabytes and remaining kilobytes from the **kilobytes** parameter.
- Then it needs to print a message in the format "**XX KB = YY MB and ZZ KB**"
    - **XX** represent the original value **kiloBytes**.
    - **YY** represent the calculated **megabytes**.
    - **ZZ** represent the calculated remaining **kilobytes**.
- **Example**, When the parameter **kilobytes** is **2500**, It needs to to print "**2500 KB = 2 MB 452 KB**"
- If the parameter **kiloBytes** is **less than 0** then print the text "**Invalid Value**".
```
- Example
    - printMegaBytesAndKiloBytes(2500) 	=> 2500 KB = 2 MB 452 KB;
    - printMegaBytesAndKiloBytes(-1024)	=> Invalid Value;
    - printMegaBytesAndKiloBytes(5000) 	=> 5000 KB = 4 MB 904 KB;
```

_**Note**_: **1 MB = 1024 KB**


#### Solution:
**MegaBytesConverter.java**
```java
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
```
**Main.java**
```java
package com.learning.Days014;

public class Main {
    public static void main(String[] args) {
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
    }
}
```

#### Explanation:

- Code is self explanatory.
 
 #### Output
 ```    
2500 KB = 2 MB and 452 KB
Invalid Value
5000 KB = 4 MB and 904 KB
```