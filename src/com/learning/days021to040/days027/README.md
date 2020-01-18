Day Of The Week Challenge
--

#### Problem statement:

- Write a method with name **printDayOfTheWeek** that has **one parameter** of type **int** and name it **day**.
- The method should **not return anything**
- Using **switch** statement print **Sunday**, **Monday** ... etc. if the **int** param **day** is **0**, **1**, ... **6**, otherwise print **Invalid day**

#### Solution:
**DayOfTheWeek.java**
```java
package com.learning.days021to040.days027;

public class DayOfTheWeek {
    public static void main(String[] args) {
        printDayOfTheWeek(3);
    }

    public static void printDayOfTheWeek(
        final int day
    ) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day.");
        }
    }
}
```

#### Explanation:

- Code is self explanatory.
 
 #### Output
 ```
Wednesday
```