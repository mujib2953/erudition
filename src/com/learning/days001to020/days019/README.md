Teen Number Checker Challenge
--

#### Problem statement:

- We all say that a number is "**teen**" if it is in the range of **13-19 (inclusive)**
- Write a method named **hasTeen** with **3 parameters** of type **int**.
- The method **should return boolean** and it needs to **return true** if one of the parameters is in the **range 13-19**. Otherwise, **return false**.
- Write another method **isTeen** with **1 parameter** of type **int**.
- The method **should return boolean** and it needs to **return true** if the parameter is in the **range 13-19**, otherwise **return false**.

```
- Example
    - hasTeen(9, 99, 19) 	=> true;
    - hasTeen(23, 15, 42) 	=> true;
    - hasTeen(22, 23, 34) 	=> false;
    	
    - isTeen(9)			=> false;
    - isTeen(15)		=> true;
```

#### Solution:
**TeenNumberChecker.java**
```java
package com.learning.days001to020.days019;

public class TeenNumberChecker {

    private static boolean isTeen(int age) {
        return (age >= 13 && age <= 19);
    }

    public static boolean hasTeen(
        int age1,
        int age2,
        int age3
    ) {
        return (isTeen(age1) || isTeen(age2) || isTeen(age3));
    }
}
```
**Main.java**
```java
package com.learning.days001to020.days019;

public class Main {
    public static void main(String[] args) {

        System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));
        System.out.println(TeenNumberChecker.hasTeen(23, 15, 42));
        System.out.println(TeenNumberChecker.hasTeen(22, 23, 34));

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