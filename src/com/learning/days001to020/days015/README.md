Barking Dog Challenge
--

#### Problem statement:

- We have a dog that like to bark. We need to wake up if the dog is barking at night!
- Write a method **shouldWakeUp** that has **2 parameters**.
- **1st parameter** should be of the type **boolean** and be named barking it represent if our dog is currently barking.
- **2nd parameter** represent the **hour of the day** and is of type **int** with the name **hourOfDay** and has a valid range of **0-23**.
- We have to wake up if the dog is barking **before 8 or after 22 hours** so in that case **return true**.
- In all other case **return false**.
- If the **hourOfDay** parameter is **less that 0** OR **greater than 23** return **false**.

```
- Example
    - shouldWakeUp(true, 1) 	=> true;
    - shouldWakeUp(false, 2) 	=> false // --- since dog is not barking;
    - shouldWakeUp(true, 8) 	=> false; // --- not before 8
    - shouldWakeUp(true, -1) 	=> false;
```

#### Solution:
**BarkingDog.java**
```java
package com.learning.days001to020.days015;

public class BarkingDog {

    public static boolean shouldWakeUp(
        boolean isDogBarking,
        int hourOfDay
    ) {
        if (isDogBarking && hourOfDay <= 23 && hourOfDay >= 0) {
            return (hourOfDay < 8 || hourOfDay > 22);
        }
        return false;
    }
}
```
**Main.java**
```java
package com.learning.days001to020.days015;

public class Main {
    public static void main(String[] args) {

        System.out.println(BarkingDog.shouldWakeUp(true, 1));
        System.out.println(BarkingDog.shouldWakeUp(false, 2));
        System.out.println(BarkingDog.shouldWakeUp(true, 8));
        System.out.println(BarkingDog.shouldWakeUp(true, -1));
    }
}
```

#### Explanation:

- Code is self explanatory.
 
 #### Output
 ```    
true
false
false
false
```