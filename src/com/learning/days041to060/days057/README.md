Carpet Cost Calculator Challenge
--

#### Problem statement:

The carpet company has asked you to write an application that calculates the price of carpeting for rectangular rooms. To calculate the price, you multiply the **area** of the floor (**width** and **length**) by **price** per square meter of carpet.

For example, the **area** of the floor that is **12 meters long** and **10 meters wide** is **120** square meters. To cover the floor with a **carpet** that **costs 8$** per square meter would **cost $960**.

---

Write a class with name **Floor**. The class needs **two fields** (instance variables) with name **width** and **length** of type **double**.

The class needs to have **one constructor** with parameters **width** and **length** of type **double** and it needs to initialize the fields.

In case the **width** parameter is **less than 0** It needs to set the **width** fields value to **0**, In case the **length** parameter is **less than 0** it needs to set the **length** field value to **0**.

Write the following methods (instance methods):
- Method name **getArea** without any parameters, it needs to return the calculate **area** (**width * length**) 

---

Write a class with the name **Carpet**. The class needs one fields (instance variable) with name **cost** of type **double**.

The class needs to have **one constructor** with parameter **cost** of type **double** and it needs to initialize the field.

In case the **cost** parameter is **less than 0** it needs to set the cost field value to **0**.

Write the following method (instance method):
- Method named **getCost** without any parameters, It needs to return the value of the **cost** field.

---

Write a class with the name **Calculator**. The class needs **two fields** (instance variable) with name **floor of type Floor** and **carpet of type Carpet**.

The class need to have **one constructor** with parameters **floor of type Floor** and **carpet of type Carpet** and it needs to initialize the fields.

Write the following methods (instance methods):
- Method named **getTotalCost** without any parameters, it needs to **return** the calculated **total cost** to cover te **floor** with a **carpet**.


```
Example:

Carpet carpet = new Carpet(3.5);
Floor floor = new Floor(2.75, 4.0);

Calculator calculator = new Calculator(floor, carpet);

System.out.println("Total = " + calculator.getTotalCost());

carpet = new Carpet(1.5);
floor = new Floor(5.4, 4.5);

calculator = new Calculator(floor, carpet);

System.out.println("Total = " + calculator.getTotalCost());

Output:

Total = 38.5
Total = 36.45
```

#### Solution:
**Floor.java**
```java
package com.learning.days041to060.days057;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    public double getArea() {
        return this.width * this.length;
    }
}
```

**Carpet.java**
```java
package com.learning.days041to060.days057;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = (cost < 0) ? 0 : cost;
    }

    public double getCost() {
        return cost;
    }
}
```

**Calculator.java**
```java
package com.learning.days041to060.days057;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return this.floor.getArea() * this.carpet.getCost();
    }
}
```

**CalculatorDriver.java**
```java
package com.learning.days041to060.days057;

public class CalculatorDriver {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);

        Calculator calculator = new Calculator(floor, carpet);

        System.out.println("Total = " + calculator.getTotalCost());

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);

        calculator = new Calculator(floor, carpet);

        System.out.println("Total = " + calculator.getTotalCost());
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
Total = 38.5
Total = 36.45
```