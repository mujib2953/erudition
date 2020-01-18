Seconds And Minutes Challenge
--

#### Problem statement:

- Creat a method called **getDurationString** with two parameters, first parameter **minutes** and 2nd parameter **seconds**
- You should validate that the **first parameter minutes is >= 0**.
- You should validate that the **2nd parameter seconds is >= 0 and <= 59**.
- The methods should return **Invalid Value** in the method if either of the above are not true.
- If parameters are valid then calculate how many hours minutes and seconds equals the minutes and seconds passed to this method and return that value as string format **XXh YYm ZZs**, where XX represents a number of hours, YY the minutes and ZZ the seconds.

- Create a 2nd method of same name but with only one parameter seconds.
- Validate that it is **>= 0**, and return **Invalid Value** if it is not true.
- If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds so that it can calculate correctly.
- Call both method to print values on the console.

- _**Hints**_: 
	- Use `int` or `long` for your data-types
	- **1 minute = 60 seconds**
	- **1 hour = 60 minutes**

- _**Bonus**_:
    - For the input **61 minutes** output should be **01h 01m 00s** instead of **1h 1m 0s**

```
- Example
    - getDurationString(3945);        => 01h 05m 45s
    - getDurationString(80, 26);      => 01h 20m 26s
    - getDurationString(65, 45);      => 01h 05m 45s
    - getDurationString(-65, 45);     => Invalid Value
    - getDurationString(65, -45);     => Invalid Value
```

#### Solution:
**SecondsAndMinutes.java**
```java
package com.learning.days021to040.days021;

public class SecondsAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(80, 26));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, -45));
    }

    public static String getDurationString(
        final int minutes,
        final int seconds
    ) {
        boolean isMinutesValid = (minutes >= 0);
        boolean isSecondsValid = (seconds >=0 && seconds <= 59);

        if (!isMinutesValid || !isSecondsValid) {
            return "Invalid Value";
        }

        int hrs = minutes / 60;
        int min = minutes % 60;

        return appendZeroIfRequired(hrs) + "h " + appendZeroIfRequired(min) + "m " + appendZeroIfRequired(seconds) + "s";
    }

    public static String getDurationString(
        final int seconds
    ) {
        boolean isSeocndsValid = (seconds >= 0);

        if (!isSeocndsValid) {
            return "Invalid Value";
        }
        int min = seconds / 60;
        int remainingSec = seconds % 60;

        return getDurationString(min, remainingSec);
    }

    public static String appendZeroIfRequired(final int number) {
        String tobeAppend = "";

        if (number < 10) {
            tobeAppend = "0";
        }

        return tobeAppend + number;
    }
}
```

#### Explanation:

- Code is self explanatory.
 
 #### Output
 ```
01h 05m 45s
01h 20m 26s
01h 05m 45s
Invalid Value
Invalid Value
```