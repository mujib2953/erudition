Find Prime Numbers
--

#### Problem statement:

- Using the **for** statement, find all **prime number** from **1** to **100**. 

#### Solution:
**FindPrimeNumber.java**
```java
package com.learning.days021to040.days031;

public class FindPrimeNumber {
    public static void main(String[] args) {
        for (
            int i = 1;
            i <= 100;
            i++
        ) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(
        final int number
    ) {
        if (number == 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
2
3
5
7
11
13
17
19
23
29
31
37
41
43
47
53
59
61
67
71
73
79
83
89
97
```