Speed Converter Challenge
--

#### Problem statement:
Follow the below steps for challenge:

- Write a method called **toMilesPerHour** that has 1 parameter of type **double** with the name **kilometersPerHours**. This methods needs to return the **rounded** value of the calculation of type **long**.
- If the parameter **kilometersPerHours** is **less than 0**, the method **toMilesPerHour** needs to **return -1** to indicate an **invalid value**.
- Otherwise, if it is positive, **calculate the value of miles per hour, round it and return it**.
- Write another method called **printConversion** with 1 parameter of type **double** with the name **kilometersPerHours**.
- This method should **not return anything** and it need to calculate **milesPerHours** from the **kilometersPerHours** parameter.
- Then it need to print a message in the format "**XX km/h = YY mi/h**"
- **XX** represent the original value **kilometersPerHours**
- **YY** represent the rounded **milesPerHours** from the **kilometersPerHours** parameter.
- If the parameter **kilometersPerHours** is **< 0** then print the text "**Invalid Value**".
```
- Example
	- toMilesPerHour(1.5) 		=> 1;
	- toMilesPerHour(10.25) 	=> 6;
	- toMilesPerHour(-5.6) 	        => -1;
	- toMilesPerHour(25.42) 	=> 16;
	- toMilesPerHour(75.114) 	=> 47;
	
	- printConversion(1.5)		=> 1.5 km/h = 1 mi/h
	- printConversion(10.25)	=> 10.25 km/h = 6 mi/h
	- printConversion(-5.6)		=> Invalid Value
	- printConversion(25.42)	=> 25.42 km/h = 16 mi/h
	- printConversion(75.114)	=> 75.114 km/h = 47 mi/h
```
_**Tip**_: In the method **printConversion**, call the method **toMilesPerHour** instead of duplicating the code.

_**Note**_: **1 mile per hour is 1.609 km per hour**


#### Solution:
**SpeedConverter.java**
```java
package com.learning.Days013;

public class SpeedConverter {
    public static long toMilesPerHour(
        double kilometersPerHours
    ) {
        if (kilometersPerHours > 0) {
            return Math.round(kilometersPerHours / 1.609);
        }

        return -1;
    }

    public static void printConversion(
        double kilometersPerHours
    ) {
        if (kilometersPerHours < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(
                kilometersPerHours +
                " km/h = " +
                toMilesPerHour(kilometersPerHours) +
                " mi/h"
            );
        }
    }
}
```
**Main.java**
```java
package com.learning.Days013;

public class Main {
    public static void main(String[] args) {
        SpeedConverter.printConversion(1.5);
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-5.6);
        SpeedConverter.printConversion(25.42);
        SpeedConverter.printConversion(75.114);
    }
}

```

#### Explanation:

- Code is self explanatory.
 
 #### Output
 ```    
1.5 km/h = 1 mi/h
10.25 km/h = 6 mi/h
Invalid Value
25.42 km/h = 16 mi/h
75.114 km/h = 47 mi/h
```