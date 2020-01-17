Expression
--

#### Problem statement:
We have to perform basic arithmetic expressions using `+`, `-`, `*`, `/` and `%` operators. 

1. We have to find the value of `(10 + 5) + (2 * 10)` expression in java code and store the output in variable `myFirstNumber`.
2. Declare second variable named it `mySecondNumber` and assign value of 12 to it.
3. Declare third variable named it `myThirdNumber` and assign value twice of the `myFirstNumber`.
4. Find the addition of `myFirstNumber`, `mySecondNumber` and `myThirdNumber` and store in new variable `myTotal`.
5. Print the value of `myTotal` on the console. 
6. And create a new variable `myLastNumber` and it should be **1000 less** the current value of `myTotal`.
7. print the value of `myLastNumber` on the console.

#### Solution:
```java
package com.learning.days001to020.days002;

public class Expression {
    public static void main(String[] args) {

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println("My Total is  = " + myTotal);

        int myLastNumber = 1000 - myTotal;
        System.out.println("My Last Number is = " + myLastNumber);

    }
}
```

#### Explanation:

- `int` is reserve keyword in Java, denoting the one of the primitive data-type defined in java
- Following are the **Primitive Data Type** defined in Java.
    - Boolean Type
        - `boolean`
    - Numeric Type
        - Character Value
            - `char`
        - Integral Type
            - Integers
                - `byte`
                - `short`
                - `int`
                - `long`
            - Floating Points
                - `float`
                - `double`
- **Primitive Data Types** holds only one value and they don't have special capabilities.
- Java follows **BODMAS** approach to solve any mathematical expression.
- **BODMAS** means
    - **B**rackets, examples `{}, ()`
    - **O**f,  `%`
    - **D**ivision `/`
    - **M**ultiplication `*`
    - **A**ddition `+`
    - **S**ubtraction `-`
  
 #### Output
 ```    
My Total is  = 117
My Last Number is = 883
```