Number Palindrome Challenge
--

#### Problem statement:

- Write a method called **isPalindrome** with one **int** parameter called **number**.
- The method need to **return a boolean**.
- It should return **true** if the number is **palindrome number** otherwise it should return **false**.
- Find the **reverse** of the given number. Store it in **some variable** say **reverse**. Compare the number is with reverse.
- If both are the **same number** then the number is a **palindrome** otherwise it is not.
- Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
- Extract the last digit of the given number by performing the **modulo division** (reminder)
- Store the last digit to some variable say lastDigit = num % 10;
- Increase the place value multiply the reverse variable by 10 e.g. reverse = reverse * 10
- Add lastDigit to reverse
- Since the last digit of the number is processed, remove the last digit of num.
- To remove the last digit divide number by 10
- Repeat steps until number is not equal to or greater than zero.

```
- Example
 	- isPalindrome(-1221)   => true
 	- isPalindrome(707)     => true
 	- isPalindrome(11212)   => false
```

#### Solution:
**NumberPalindrome.java**
```java
package com.learning.days021to040.days036;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(
        final int number
    ) {
        return (reverseNumber(number) == number);
    }

    public static int reverseNumber(
        final int number
    ) {
        int givenNumber = number;
        int reversedNumber = 0;

        while (givenNumber != 0) {

            int leastSignificantDigit = givenNumber % 10;
            reversedNumber = (reversedNumber * 10) + leastSignificantDigit;

            givenNumber /= 10;
        }

        return reversedNumber;
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
```