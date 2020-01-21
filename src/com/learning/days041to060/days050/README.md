Input Calculator Challenge
--

#### Problem statement:

- Write a method called **inputThenPrintSumAndAverage** that does not have any parameters.
- The method should **not return** anything (**void**) and it needs to keep reading int numbers from keyboard.
- When the user enters something that is not an int then it needs to print a message in the format **SUM = XX AVG = YY**
- Where **XX** represents the **sum** of all entered numbers of type **int**.
- And **YY** represents the calculated **average** of all numbers of type **long**.

#### Solution:
**InputCalculator.java**
```java
package com.learning.days041to060.days050;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long avg;
        int count = 0;

        while (true) {

            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                count++;

                sum += input;
            } else {
                break;
            }
        }
        avg = Math.round((double) sum /(double) count);

        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) avg));
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
-1
5
7
a
SUM = 11 AVG = 4
```