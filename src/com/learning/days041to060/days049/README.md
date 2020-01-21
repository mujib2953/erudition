Min Max Problem
--

#### Problem statement:

- Read the numbers from console entered by the user and print the **minimum** and **maximum** number the user has entered.
- Before the user enters the number, print the message **Enter Number :**
- If the user enters an **invalid number**, **break out of the loop** and print the **minimum** and **maximum** number.

#### Solution:
**MinMax.java**
```java
package com.learning.days041to060.days049;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter Number : ");
            
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();

                min = Math.min(input, min);
                max = Math.max(input, max);
            } else {
                System.out.println("MIN = " + min);
                System.out.println("MAX = " + max);
                break;
            }

        }
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
Enter Number : 452
Enter Number : 15
Enter Number : 154
Enter Number : 26456
Enter Number : g
MIN = 15
MAX = 26456
```