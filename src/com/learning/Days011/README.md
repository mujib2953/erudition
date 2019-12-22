Operator Challenge
--

#### Problem statement:
Follow the below steps for challenge:
1. Create a **double** variable with value **20.00**.
2. Create a second variable of type **double** with value **80.00**.
3. Add both numbers together and multiply by **100.00**.
4. Use **reminder** operator to figure out what the **reminder** from the result of the operation in **step 3** and **40.00**.
5. Create a **boolean** variable that assign the value **true** if the reminder in **step 4** is **0**, or **false** if it is **not zero**.
6. Output the **boolean** variable.
7. Write an **if-else** statement that display a message **"Got Some Reminder"** if the **boolean** in **step 5** is **not true**.


#### Solution:
```java
package com.learning.Days011;

public class OperatorChallenge {
    public static void main(String[] args) {
        double firstDouble = 20.00d;
        double secondDouble = 40.00d;

        double result = (firstDouble + secondDouble) * 100.00d;

        double reminder = result % 40.00d;
        boolean isZeroReminder = (reminder == 0);

        if (!isZeroReminder) {
            System.out.println("Got Some Reminder");
        } else {
            System.out.println("Yippee, We Got NO Reminder");
        }
    }
}
```

#### Explanation:

- Code is self explanatory.
 
 #### Output
 ```    
Yippee, We Got NO Reminderui
```