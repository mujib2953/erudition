Number To Words Challenge
--

#### Problem statement:

- Write a method called **numberToWords** with one **int** parameter named **number**.
- The method should print out the passed number using words for the digits.
- If the number is **negative**, print **Invalid Value**
- To print the number as words, follow these steps:
	- Extract **last digit** of the given number using **reminder** operator.
	- Convert the value of the digit found in above step into a word. There are 10 possible values for the digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8 , 9. Print the corresponding word for each digit, e.g. print "Zero", if digit is 0, "One" for digit 1, and so on
	- **Remove** the **last digit** from the **number**
	- **Repeat** the above steps until number is **0**.

- The logic above is correct, but in its current state, the words will be printed in reverse orde. For example, if the number is 234, the logic above will produce the output "Four Three Two" instead of "Two Three Four".
- To overcome this problem, write a second method called **reverse**.

- The method reverse should have **one parameter** and return the reversed number. For example, if the number passed is **234**, then the reversed number would be **432**.
- The method **reverse** should also reverse **negative numbers**.

- Use the method reverse within the method **numberToWords** in order to print the words in correct order.

- Another thing to keep in mind in any reverse with leading zeroes (e.g. the reversed number of **100** is **001**). The logic above fot the method **numberToWords** will print **One**, but that is incorrect.
- It should print **One Zero Zero**. To solve this problem, write a third method called **getDigitCount**
- The method getDigitCount should have **one int parameter** called **number** and return the **count** of the digits in that number.
- If the number is **negative**, **return -1** to indicate an **invalid value**
- For example, if the number has the value of 100, the method **getDigitCount** should return **3** since the number 100 has 3 digits (1, 0, 0)

```
- Example
    - numberToWords(123);   => One Two Three
    - numberToWords(1010);  => One Zero One Zero
    - numberToWords(1000);  => One Zero Zero Zero
    - numberToWords(-12);   => Invalid Value
    - numberToWords(0);     => Zero
```

#### Solution:
**PerfectNumber.java**
```java
package com.learning.days041to060.days044;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        numberToWords(0);
    }

    public static int reverse(
        final int number
    ) {
        int givenNumber = number;
        int reverseNumber = 0;

        while (givenNumber != 0) {
            int leastSignificantDigit = givenNumber % 10;

            reverseNumber = (reverseNumber * 10) + leastSignificantDigit;
            givenNumber /= 10;
        }

        return reverseNumber;
    }

    public static int getDigitCount(
        final int number
    ) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int digitCount = 0;
        int givenNumber = number;
        while (givenNumber != 0) {
            digitCount++;
            givenNumber /= 10;
        }

        return digitCount;
    }

    public static void numberToWords(
        final int number
    ) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println(getWords(number));
            return;
        }

        int reversedNumber = reverse(number);
        int numbersCount = getDigitCount(number);
        int reversedNumberCount = getDigitCount(reversedNumber);
        String valueInWords = "";

        while (reversedNumber != 0) {
            int leastSignificantDigit = reversedNumber % 10;
            valueInWords += (" " + getWords(leastSignificantDigit));

            reversedNumber /= 10;
        }

        if (numbersCount != reversedNumberCount) {
            while ((numbersCount - reversedNumberCount) != 0) {
                valueInWords += (" " + getWords(0));
                numbersCount--;
            }
        }

        System.out.println(valueInWords);

    }

    public static String getWords(
        final int number
    ) {
        switch (number) {
            case 0:
                return "Zero";
            case 1:
                return  "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "Invalid Value";
        }
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
 One Two Three
 One Zero One Zero
 One Zero Zero Zero
Invalid Value
Zero
```