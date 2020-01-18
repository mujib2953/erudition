Number in Words Challenge
--

#### Problem statement:

- Write a method called **printNumberInWord**. The method has **one parameter number** which is the whole number. The method need to print **ZERO**, **ONE**, **...**, **NINE** and **OTHER** for the parameter to be **0**, **1**, **...**, **9** or **other**.

#### Solution:
**NumberInWords.java**
```java
package com.learning.days021to040.days028;

public class NumberInWords {
    public static void main(String[] args) {
        printNumberInWord(7);
    }

    public static void printNumberInWord(
        final int number
    ) {
        switch (number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Other");
        }
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
Seven
```