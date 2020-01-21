Reading User Input Challenge
--

#### Problem statement:

- Read **10** numbers from the console entered by the user and print the **sum** of those numbers.
- Create a **Scanner** object.
- Use **hasNextInt()** method to from the scanner to check if the user has entered an in value.
- If **hasNextInt()** return **false**, print the message **Invalid Number**. Continue reading until you have read **10** numbers.
- Use the **nextInt()** method to get the number and add it to the **sum**.
- Before the user enters each number. print the message **Enter number #x**, where **x** represent the **count**, i.e **1, 2, 3, 4, ... etc**

#### Solution:
**ReadingUserInputs.java**
```java
package com.learning.days041to060.days048;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter number #" + (count + 1) + " : ");
            if (scanner.hasNextInt()) {
                count++;
                sum += scanner.nextInt();
            } else {
                System.out.println("Invalid Number");
            }

            if (count == 10) {
                break;
            }
        }

        System.out.println("Sum = " + sum);
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
Enter number #1 : 1
Enter number #2 : 2
Enter number #3 : 3
Enter number #4 : 4
Enter number #5 : 5
Enter number #6 : 6
Enter number #7 : 7
Enter number #8 : 8
Enter number #9 : 9
Enter number #10 : 10
Sum = 55
```