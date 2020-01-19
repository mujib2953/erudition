Shared Digit Challenge
--

#### Problem statement:

- Write a method named **hasSharedDigit** with **two parameter** of type **int**.
- Each number should be within the range of **10-99 (inclusive)**
- If any of the number is not within the range, the method should return **false**.
- The method should return **true** if there is a digit that appears in both numbers, such as **2** in 12 and 23
- Otherwise method should return **false**

```
- Example
	- hasSharedDigit(12, 23)	=> true
	- hasSharedDigit(9, 99)		=> false
	- hasSharedDigit(15, 55)	=> true
```

#### Solution:
**SharedDigit.java**
```java
package com.learning.days021to040.days039;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(
        int number1,
        int number2
    ) {
        if (number1 < 10 || number2 < 10) {
            return false;
        }

        int number1FirstDigit = number1 % 10;
        int number1SecondDigit = number1 / 10;

        int number2FirstDigit = number2 % 10;
        int number2SecondDigit = number2 / 10;

        return (
            number1FirstDigit == number2FirstDigit ||
            number1FirstDigit == number2SecondDigit ||
            number1SecondDigit == number2FirstDigit ||
            number1SecondDigit == number2SecondDigit
        );
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
true
false
true
```