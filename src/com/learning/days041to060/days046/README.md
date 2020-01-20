Largest Prime Challenge
--

#### Problem statement:

- Write a method named **getLargestPrime** with **one parameter** of type **int** named **number**.
- If the number is **negative** or **does not** have any prime number, the method should **return -1** to indicate an **invalid value**.
- The method should calculate the **largest prime** factor of a given number and return it.

```
- Example
    - getLargestPrime(21);     => 7
    - getLargestPrime(217);    => 31
    - getLargestPrime(0);      => -1
    - getLargestPrime(45);     => 5
    - getLargestPrime(-1);     => -1 
```

#### Solution:
**LargestPrime.java**
```java
package com.learning.days041to060.days046;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(
        final int number
    ) {
        if (number < 0) {
            return -1;
        }

        for (int i = number; i >= 2; i--) {
            if (isPrime(i) && (number % i == 0)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isPrime(
        final int number
    ) {
        for (int i = 2; i < number; i++) {
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
7
31
-1
5
-1
```