Area Calculator Challenge
--

#### Problem statement:

- Write a method named **area** with one **double** param named **radius**
- The method needs to return **double** value that represent **area of circle**.
- If param **radius** is **negative** values, then **return -1.0** to represent ans invalid value.
- write another **overloaded method** with **2 params**, **x** and **y** both are **double**, where x & y represent the sides of the rectangle.
- The methods needs to return area of **rectangle**

- _**Hints**_: 
	- formula for calculating **area of rectangle** is **x * y**
    - formula for calculating **area of circle** is **radius * radius * PI**
    - **PI** is coming from **Math.PI**
    
```
- Example
    - area(5.0)         => 78.53975
    - area(-1.0)        => -1.0
    - area(5.0, 4.0)    => 20.0
    - area(-1.0, 4.0)   => -1.0
```

#### Solution:
**AreaCalculator.java**
```java
package com.learning.days021to040.days022;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    public static double area(
        final double radius
    ) {
        if (radius < 0) {
            return -1;
        }

        return Math.PI * area(radius, radius);
    }

    public static double area(
        final double x,
        final double y
    ) {
        if (x < 0 || y < 0) {
            return -1;
        }

        return x * y;
    }
}
```

#### Explanation:

- Code is self explanatory.
 
 #### Output
 ```
78.53981633974483
-1.0
20.0
-1.0
```