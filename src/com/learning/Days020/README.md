Feet And Inches To Centimeter Challenge
--

#### Problem statement:

- Creat a method called **calcFeetAndInchesToCentimeters**
- It needs to have **2 parameters feet** is the **first parameter**, **inches** is the **2nd parameter**
- You should validate that 1st param feet is **>= 0**
- You should validate that 2nd param inches is **>= 0** and **<= 12**
- **return -1** from method if either of the above is not **true**
- If params are **valid**, then calculate how many centimeters comprise the feet and inches passed to this method and return that value
- create a **second method** of the **same name** but with **only one parameter**, **inches** is the param validate it is **>= 0 return -1** if **not true**
- But if it is **valid**, then calculate, how many feet are in the inches call the other overloaded method passing the correct feet and inches calculated so that it can calculate correctly.

- _**Hints**_: 
	- Use `double` for your data-types
	- **1 inch = 2.54 cm**
	- **1 foot = 12 inches**

```
- Example
    - calcFeetAndInchesToCentimeters(6, 0);     => 6.0 feet, 0.0 inches = 182.88 centimeters
    - calcFeetAndInchesToCentimeters(102);      => 8.0 feet, 6.0 inches = 259.08 centimeters
    - calcFeetAndInchesToCentimeters(200);      => 16.0 feet, 8.0 inches = 508.0 centimeters
```

#### Solution:
**FeetAndInchesToCentimeter.java**
```java
package com.learning.Days020;

public class FeetAndInchesToCentimeter {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(102);
        calcFeetAndInchesToCentimeters(200);
    }

    private static double calcFeetAndInchesToCentimeters(
        final double feet,
        final double inches
    ) {
        boolean isFeetValid = (feet > 0);
        boolean isInchesValid = (inches >= 0 && inches <= 12);

        if (isFeetValid && isInchesValid) {
            double cm = (feet * 12) * 2.54;
            cm += (inches * 2.54);

            System.out.println(
                feet + " feet, " +
                inches + " inches = " +
                cm + " centimeters"
            );
            return cm;
        } else {
            System.out.println("Invalid feet or inches parameter.");
        }

        return -1;
    }

    private static double calcFeetAndInchesToCentimeters(
        final double inches
    ) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) (inches / 12);
        double remainingInches = (int) (inches % 12);

        return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }
}
```

#### Explanation:

- Code is self explanatory.
 
 #### Output
 ```
6.0 feet, 0.0 inches = 182.88 centimeters
8.0 feet, 6.0 inches = 259.08 centimeters
16.0 feet, 8.0 inches = 508.0 centimeters
```