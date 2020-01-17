Equal Sum Checker Challenge
--

#### Problem statement:

- Write a method **hasEqualSum** with **3 parameters** of type **int**.
- The method **should return boolean** and it need to **return true** if the sum of first & second parameters is equal to third parameter. Otherwise, return false.

```
- Example
    - hasEqualSum(1, 1, 1) 	=> false;
    - hasEqualSum(1, 1, 2) 	=> true;
    - hasEqualSum(1, -1, 0)     => true;
```

#### Solution:
**EqualSumChecker.java**
```java
package com.learning.days001to020.days018;

public class EqualSumChecker {

    public static boolean hasEqualSum(
        int num1,
        int num2,
        int num3
    ) {
        return ((num1 + num2) == num3);
    }

}
```
**Main.java**
```java
package com.learning.days001to020.days018;

public class Main {
    public static void main(String[] args) {

        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 1));
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2));
        System.out.println(EqualSumChecker.hasEqualSum(1, -1, 0));

    }
}
```

#### Explanation:

- Code is self explanatory.
 
 #### Output
 ```
false
true
true
```