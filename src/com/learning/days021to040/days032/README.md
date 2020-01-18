Sum 3 And 5 Challenge
--

#### Problem statement:

- Create a **for** statement using a range of numbers from **1** to **1000** inclusive.
- **Sum** all the numbers that can be **divided** with **both 3 and 5**.
- For those number that met the above condition, **print** out the number
- **break** out of the loop once you find **5 number** that met the above conditions.
- After breaking out of the loop print the **sum** of the numbers that met the above condition.

#### Solution:
**Sum3And5.java**
```java
package com.learning.days021to040.days032;

public class Sum3And5 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for(int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                sum += i;
                System.out.println("Found number = " + i);
            }

            if (count >= 5) {
                System.out.println("Sum = " + sum);
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
Found number = 30
Found number = 45
Found number = 60
Found number = 75
Sum = 225
```