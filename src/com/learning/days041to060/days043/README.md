Perfect Number Challenge
--

#### Problem statement:

What is the **perfect number**?

**Ans:** A **perfect number** is a positive **integer** which is **equal** to the **sum of its proper positive divisors**.

- Proper positive divisor are positive integers that fully divide the perfect number without leaving a reminder and exclude the perfect number itself.
- For example, take the number **6**.
- Its **proper divisors** are **1, 2, and 3**. and the **sum** of its proper divisor is **1 + 2 + 3 = 6**.
- Therefore, **6** is a **perfect number**.
- write a method named **isPerfectNumber** with **one parameter** of type **int** named **number**.
- if **number < 1**, the method should **return false**.
- The method must calculate, if the number is perfect, if the number is perfect, the method should **return true** otherwise, it should **return false**.

```
- Example
	- isPerfectNumber(6)	=> true
	- isPerfectNumber(28)	=> true
	- isPerfectNumber(5)	=> false
	- isPerfectNumber(-1)	=> false
```

#### Solution:
**PerfectNumber.java**
```java
package com.learning.days041to060.days043;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(
        final int number
    ) {
        if (number < 1) {
            return false;
        }
        int sum = 0;

        for(int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return (sum == number);
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
true
true
false
false
```