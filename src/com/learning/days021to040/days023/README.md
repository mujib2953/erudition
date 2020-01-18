Minutes To Years And Days Calculator Challenge
--

#### Problem statement:

- write a method **printYearsAndDays** with parameters of type **long** named **minutes**.
- The method should **not return anything (void)**, and it need to calculate the **years** and **days** from the **minutes** param.
- If param is **less than 0**, print text **Invalid Value**.
- Otherwise, if the param is **valid** them it need to print message in the format **XX min = YYy and ZZd**
- **XX** represents original value **minutes**
- **YY** represents the calculated **years**
- **ZZ** represents the calculated **days**.

- _**Hints**_: 
	- **1 day = 60 minutes**
    - **1 year = 365 days**
    
```
- Example
    - printYearsAndDays(525600)     => 525600 min = 1 y and 0 d
    - printYearsAndDays(1051200)    => 1051200 min = 2 y and 0 d
    - printYearsAndDays(561600)     => 561600 min = 1 y and 25 d
```

#### Solution:
**MinutesToYearsAndDaysCalculator.java**
```java
package com.learning.days021to040.days023;

public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(
        final long minutes
    ) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long year = minutes / (365 * 24 * 60);
            long remainingYears = minutes % (365 * 24 * 60);

            long remainingDays = remainingYears / (24 * 60);

            System.out.println(
                minutes + " min = " +
                year + " y and " +
                remainingDays + " d"
            );
        }
    }
}
```

#### Explanation:

- Code is self explanatory.
 
 #### Output
 ```
525600 min = 1 y and 0 d
1051200 min = 2 y and 0 d
561600 min = 1 y and 25 d
```