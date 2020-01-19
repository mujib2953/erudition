All Factors Challenge
--

#### Problem statement:

- Write a method named **printFactors** with **one parameter** of type **int** named **number**.
- If number is **< 1**, the method should print **Invalid Value**
- The method should print all factors of the number. A factor of a number is an integer which divides that number wholly(i.e. without leaving a reminder)
- For example, **3** is a factor of **6** because fully divides **6** without leaving a reminder. In other words **6 / 3 = 2**.

```
- Example
	- printFactors(6)	=> 1 2 3 6
	- printFactors(32)	=> 1 2 4 8 16 32
	- printFactors(10)	=> 1 2 5 10
	- printFactors(-1)	=> Invalid Value
```

#### Solution:
**AllFactors.java**
```java
package com.learning.days041to060.days042;

public class AllFactors {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(
        final int number
    ) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println(" ");
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
1
2
3
6
 
1
2
4
8
16
32
 
1
2
5
10
 
Invalid Value
```