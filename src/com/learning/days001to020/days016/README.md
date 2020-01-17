Leap Year Calculator Challenge
--

#### Problem statement:

- Write a method **isLeapYear** with a parameter of type in named **year**.
- The parameter need to be **greater than or equal to 1** and **less than or equal to 9999**.
- If the parameter is not in the range return **false**.
- Otherwise, If it is in the valid range, calculate if the year is leap year and return **true**, otherwise return **false**,
- To determine whether a year is leap year, follow these steps:
	1. If the year is **evenly divisible by 4**, goto step 2 otherwise goto step 5.
	2. If the year is **evenly divisible by 100**, goto step 3 otherwise goto step 5.
	3. If the year is **evenly divisible by 400**, goto step 4 otherwise goto step 5.
	4. The year is leap year, return **true**
	5. The year is NOT leap year, return **false**
```
- Example
    - isLeapYear(-1600) 	=> false;
    - isLeapYear(1600) 		=> true;
    - isLeapYear(2017) 		=> false;
    - isLeapYear(2000)	 	=> true;
```

#### Solution:
**LeapYearCalculator.java**
```java
package com.learning.days001to020.days016;

public class LeapYearCalculator {

    public static boolean isLeapYear(int year) {

        boolean isYearWithinRange = year > 0 && year <= 9999;
        boolean isLeapYearBoolean = false;

        if (
            isYearWithinRange &&
            year % 4 == 0
        ) {

            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYearBoolean = true;
                }
            } else {
                isLeapYearBoolean = true;
            }
        }
        return isLeapYearBoolean;
    }
}
```
**Main.java**
```java
package com.learning.days001to020.days016;

public class Main {
    public static void main(String[] args) {
        System.out.println(LeapYearCalculator.isLeapYear(-1600));
        System.out.println(LeapYearCalculator.isLeapYear(1600));
        System.out.println(LeapYearCalculator.isLeapYear(2017));
        System.out.println(LeapYearCalculator.isLeapYear(2000));
    }
}
```

#### Explanation:

- Code is self explanatory.
 
 #### Output
 ```    
false
true
false
true
```