If Else Statement
--

#### Problem statement:
- Explore on what is **if-else** statement.

#### Solution:
```java
package com.learning.Days010;

public class IfElseStatement {
    public static void main(String[] args) {
        boolean isAlien = false;

        if (!isAlien) {
            System.out.println("It is not an alien!!...");
            System.out.println("And I am scared of aliens..");
        } else {
            System.out.println("Ohh... it is an alien.. run...");
        }
        
        System.out.println("--- After updating expression ---");

        if (isAlien) {
            System.out.println("It is not an alien!!...");
            System.out.println("And I am scared of aliens..");
        } else {
            System.out.println("Ohh... it is an alien.. run...");
        }
    }
}

```

#### Explanation:

- When we have to perform some steps on specific condition, then we go for **if-else** statement
- Following is the basic structure of **if-else** statement.
    ```
        if (expression) {
            // --- code block, which will execute when expression is truthy.
        } else {
            // --- else code block, when expression is falsy.
        }
    ```
- The curly braces in the above code are optional, if only one statement is required on specific condition.

  
 #### Output
 ```    
It is not an alien!!...
And I am scared of aliens..
--- After updating expression ---
Ohh... it is an alien.. run...
```