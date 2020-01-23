Simple Calculator Challenge
--

#### Problem statement:

Write a class with the name **SimpleCalculator**. The class needs **two fields** (instance variable) with names **firstNumber** and **secondNumber** both of type **double**.

Write the following methods (instance methods):
- Method named **getFirstNumber** without any parameters, it needs to return the value of **firstNumber** field.
- Method named **getSecondNumber** without any parameters, it needs to return the value of **secondNumber** field.
- Method named **setFirstNumber** with one parameter of type **double**, it needs to set the value of the **firstNumber** field.
- Method named **setSecondNumber** with one parameter of type **double**, it needs to set the value of the **secondNumber** field.
- Method named **getAdditionResult** without any parameters, it needs to return the result of **adding** the field values of **firstNumber** and **secondNumber**.
- Method named **getSubtractionResult** without any parameters, it needs to return the result of **subtracting** the field values of **secondNumber** from the **firstNumber**.
- Method named **getMultiplicationResult** without any parameters, it needs to return the result of **multiplying** the field values of **firstNumber** and **secondNumber**.
- Method named **getDivisionResult** without any parameters it needs to return the result of  **dividing** the field values of **firstNumber** by the **secondNumber**. In case of the value of **secondNumber** is **0** then return **0**.

```
Example:

SimpleCalculator calculator = new SimpleCalculator();

calculator.setFirstNumber(5.0);
calculator.setSecondNumber(4);
System.out.println("add = " + calculator.getAdditionResult());
System.out.println("subtract = " + calculator.getSubtractionResult());

calculator.setFirstNumber(5.25);
calculator.setSecondNumber(0);
System.out.println("multiply = " + calculator.getMultiplicationResult());
System.out.println("division = " + calculator.getDivisionResult());

Output:
add = 9.0
subtract = 1.0
multiply = 0.0
divide = 0.0
```

#### Solution:
**SimpleCalculator.java**
```java
package com.learning.days041to060.days052;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult() {
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult() {
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult() {
        if (this.secondNumber == 0) {
            return 0;
        }

        return this.firstNumber / this.secondNumber;
    }
}
```
**SimpleCalculatorDriver.java**
```java
package com.learning.days041to060.days052;

public class SimpleCalculatorDriver {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("division = " + calculator.getDivisionResult());
    }
}
```


#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
add = 9.0
subtract = 1.0
multiply = 0.0
division = 0.0
```