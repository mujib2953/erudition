Operators And Operands
--

#### Problem statement:
- Explore on what is **Operators**.
- What is **Operands**.
- What is **Expressions**.

#### Solution:
```java
package com.learning.days001to020.days009;

public class OperatorsAndOperands {
    public static void main(String[] args) {

        int result = 1 + 2; // --- 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("Previous result is = " + previousResult);

        result -= 1; // --- 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        System.out.println("Previous result is = " + previousResult);

        result *= 10; // --- 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result /= 5; // --- 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result %= 3; // --- 4 % 3 = 1
        System.out.println("4 % 3 = " + result);
    }
}
```

#### Explanation:

- **Operators**, in Java are special symbols which perform specific operations on one, two or three operands and return a result.
- Following are some mostly used operators
    - `+` Addition/Concatenation
    - `-` Subtraction
    - `*` Multiplication
    - `/` Division
    - `%` Modulus
    - `=` Assignment
- **Operands** is term which is manipulated by **Operators**.
- For example `int myInt = 15 + 20` in this expression `+` & `=` are **operators** and `15`, `20` & `myInt` are **operands**.
- **Expressions** is formed by combining **operators** and **operands**. So `int myInt = 15 + 20;` is an **expression**. 

  
 #### Output
 ```    
1 + 2 = 3
Previous result is = 3
3 - 1 = 2
Previous result is = 3
2 * 10 = 20
20 / 5 = 4
4 % 3 = 1
```