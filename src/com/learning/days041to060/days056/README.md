Point Challenge
--

#### Problem statement:

You have to represent a point in 2D space. Write a class with the name **Point**. The class needs **two fields** (instance variable) with name **x** and **y** of type **int**.

The class needs to have **two constructors**. The first constructor does not have any parameters (**no-args constructor**). The second constructor has parameters **x** and **y** of **int** and it needs to **initialize the fields**.

Write the following methods (instance methods):
- **Getter** and **Setters** for **x** and **y** fields.
- Method named **distance** without any parameters, It needs to **return distance** between this **Point** and **Point (0, 0)** as **double**.
- Method named **distance** with **2** parameters **x** and **y** both of type **int**, it needs to **return the distance** between this **Point** and **Point(x, y)**.
- Method named **distance** with parameter another of type **Point**, It needs to return the distance between this **Point** and another **Point** as **double**.

**How to find the distance between two points?**

To find a **distance** between points **A(xA, yA)** and **B(xB, yB)**, we use the formula:

```
d(A, B) = √(xb - xA) * (xb - xA) + (yb - yA) * (yb - yA)

Where √ represnts square root.
```

```
Example:

Point first = new Point(6, 5);
Point second = new Point(3, 1);

System.out.println("distance(0, 0) = " + first.distance());
System.out.println("distance(second) = " + first.distance(second));
System.out.println("distance(2, 2) = " + first.distance(2, 2));

Point point = new Point();
System.out.println("distance() = " + point.distance());

Output:

distance(0, 0) = 7.810249675906654
distance(second) = 5.0
distance(2, 2) = 5.0
distance() = 0.0
```

#### Solution:
**Point.java**
```java
package com.learning.days041to060.days056;

public class Point {
    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return this.distance(new Point(0, 0));
    }

    public double distance(int x, int y) {
        return this.distance(new Point(x, y));
    }

    public double distance(Point p) {
        return Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
    }
}
```

**PointDriver.java**
```java
package com.learning.days041to060.days056;

public class PointDriver {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0, 0) = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2, 2) = " + first.distance(2, 2));

        Point point = new Point();
        System.out.println("distance() = " + point.distance());
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
distance(0, 0) = 7.810249675906654
distance(second) = 5.0
distance(2, 2) = 5.0
distance() = 0.0
```