Challenge For Loop
--

#### Problem statement:

- Using the **for** statement, call **calculateInterest** method with the **amount of 10000** with an **interest rate** of **2, 3, 4, 5, 6, 7 and 8** and print the result to the console.

#### Solution:
**ChallengeForLoop.java**
```java
package com.learning.days021to040.days030;

public class ChallengeForLoop {

    private static final double AMOUNT = 10000d;

    public static void main(String[] args) {
        for (int i = 2; i <= 8; i++) {
            System.out.println(
                "10, 000 at " +
                i + "% interest = " +
                String.format("%.2f", calculateInterest(AMOUNT, (double) i))
            );
        }
    }

    public static double calculateInterest(
        final double amount,
        final double interestRate
    ) {
        return amount * (interestRate / 100);
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
10, 000 at 2% interest = 200.00
10, 000 at 3% interest = 300.00
10, 000 at 4% interest = 400.00
10, 000 at 5% interest = 500.00
10, 000 at 6% interest = 600.00
10, 000 at 7% interest = 700.00
10, 000 at 8% interest = 800.00
```