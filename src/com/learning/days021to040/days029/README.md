Number Of Days In Month Challenge
--

#### Problem statement:

- Write a method **isLeapYear** with a parameter if type **int** named **year**.
- The param need to be **greater that or equal to 1** and **less than or equal to 9999**
- If the param is not in that range return **false**
- Otherwise, if it is in the range, calculate if the year is a **leap year** and return **true** it it is, otherwise return **false**
- 	A year is **leap year** if it is divisible by **4** but not by **100**, or it is divisible by **400**

- Write another method **getDaysInMonth** with **2** parameters **month** and **year**. Both of type **int**
- If param month is **< 1** or **> 12** return **-1**
- If param year is **< 1** or **> 9999** return **-1**
- This method need to return number of days in the month. Be careful about leap years they have 29 days in month **2(February)**
- You should check if the year is a **leap year** using the method **isLeapYear** describe above

```
- Example
	- isLeapYear(-1600);    => false
	- isLeapYear(1600);     => true
	- isLeapYear(2017);     => false
	- isLeapYear(2000);     => true
	
	- getDaysInMonth(1, 2020)	=> 31
	- getDaysInMonth(2, 2020)	=> 29
	- getDaysInMonth(2, 2018)	=> 28
	- getDaysInMonth(-1, 2020)	=> -1
	- getDaysInMonth(1, -2020)	=> -1
```

#### Solution:
**NumberOfDaysInMonth.java**
```java
package com.learning.days021to040.days029;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(
        final int year
    ) {
        boolean isYearValid = (year >= 1 && year <= 9999);
        boolean isItLeapYear = false;

        if (!isYearValid) {
            return isItLeapYear;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isItLeapYear = true;
                }
            } else {
                isItLeapYear = true;
            }
        }
        return isItLeapYear;
    }

    public static int getDaysInMonth(
        final int month,
        final int year
    ) {
        boolean isMonthValid = (month >= 1 && month <= 12);
        boolean isYearValid = (year >= 1 && year <= 9999);

        if (!isMonthValid || !isYearValid) {
            return -1;
        }

        boolean isItLeapYear = isLeapYear(year);

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            case 2:
                return (isItLeapYear) ? 29 : 28;

            default:
                return -1;
        }
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
31
29
28
-1
-1
```