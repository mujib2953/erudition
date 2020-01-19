Last Digit Checker Challenge
--

#### Problem statement:

- Write a method named **hasSameLastDigit** with **three parameters** of type **int**.
- Each number should be within the range of **10 - 1000 (inclusive)**.
- If any of the number is **not** within range , the method should **return false**.
- The method should **return true** if at least **2 of the numbers** shares the same rightmost digit otherwise, it should **return false**.
- write another method name **isValid** with one parameter of type **int**
- The method needs to **return true** if the number param is in the **range of 10-1000 (inclusive)** otherwise **return false**

```
- Example
	- hasSameLastDigit(41, 22, 71)	=> true
	- hasSameLastDigit(23, 32, 42)	=> true
	- hasSameLastDigit(9, 99, 999)	=> false // --- out of range
	- hasSameLastDigit(1, 1, 2)	=> false // --- out of range
	
	- isValid(10)			=> true
	- isValid(468)			=> true
	- isValid(1051)			=> false
```

#### Solution:
**LastDigitChecker.java**
```java
package com.learning.days021to040.days040;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(hasSameLastDigit(1, 1, 2));
    }

    public static boolean isValid(
        final int number
    ) {
        return (number >= 10 && number <= 1000);
    }

    public static boolean hasSameLastDigit(
        final int number1,
        final int number2,
        final int number3
    ) {

        if (!isValid(number1) || !isValid(number2) || !isValid(number3)) {
            return false;
        }

        int number1LastDigit = number1 % 10;
        int number2LastDigit = number2 % 10;
        int number3LastDigit = number3 % 10;

        return (
            number1LastDigit == number2LastDigit ||
            number2LastDigit == number3LastDigit ||
            number3LastDigit == number1LastDigit
        );
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