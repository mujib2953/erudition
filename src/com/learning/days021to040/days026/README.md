Switch Case Challenge
--

#### Problem statement:

- Creat a **switch** statement using **char**
- create a **char** variable
- create a **switch** statement testing for **A**, **B**, **C**, **D** or **E**
- display a message if any of these are **found** and the **break** the switch case.
- Add a **default case** which display a message saying **Not Found.**

#### Solution:
**SwitchChallenge.java**
```java
package com.learning.days021to040.days026;

public class SwitchChallenge {

    private static String NOT_FOUND = "Not Found.";

    public static void main(String[] args) {
        char inputChar = 'A';

        switch (inputChar) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println(inputChar + " is Found.");
            break;
            default:
                System.out.println(NOT_FOUND);
        }
    }
}
```

#### Explanation:

- Code is self explanatory.
 
 #### Output
 ```
A is Found.
```