Wall Area Challenge
--

#### Problem statement:

Write a class with the name **Wall**. The class needs **two fields** (instance variable) with name **width** and **height** of type **double**.

The class needs to have **two constructors**. The first constructor does not have any parameters (**no-args constructor**). The second constructor has parameters **width** and **height** of type **double** and it needs to **initialize the fields**. In case the **width** is **less than 0** it needs to set the **width** field value to **0**, in case **height** parameter is **less than 0** it needs to set the **height** field value to **0**.

Write the following methods (instance methods):
- **Getter** and **Setter** for **width** and **height** fields, while setting value, if the value is **less than 0**, it needs to set the value as **0**.
- Methods named **getArea** without any parameter, it needs to **return area** of the wall.


```
Example:

Wall wall = new Wall(5, 4);
System.out.println("area = " + wall.getArea());

wall.setHeight(-1.5);
System.out.println("width = " + wall.getWidth());
System.out.println("height = " + wall.getHeight());
System.out.println("area = " + wall.getArea());

Output:

area = 20.0
width = 5.0
height = 0.0
area = 0.0
```

#### Solution:
**Wall.java**
```java
package com.learning.days041to060.days055;

public class Wall {
    private double width;
    private double height;

    public Wall() {}

    public Wall(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = (height < 0) ? 0 : height;
    }

    public double getArea() {
        return this.height * this.width;
    }
}
```

**WallDriver.java**
```java
package com.learning.days041to060.days055;

public class WallDriver {
    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
area = 20.0
width = 5.0
height = 0.0
area = 0.0
```