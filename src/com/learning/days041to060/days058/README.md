Complex Operations Challenge
--

#### Problem statement:

A **complex number** is a number that can be expressed in the form `a + bi`, where **a** and **b** are **real numbers**, and **i** is a solution of the equation `x2 = -1`. Because no real number satisfies this equation, **i** is called an **imaginary number**. 

For the complex number `a + bi`, **a** is called the **real part**, and **b** is called the **imaginary part**. 

To **add** or **subtract** two **complex numbers**, just **add** or **subtract** the corresponding **real** and **imaginary** parts. For instance, the **sum** of `5 = 3i` and `4 + 2i` is `9 + 5i`. For another, the **sum** of `3 + i` and `-1 + 2i` is `2 + 3i`.

Write a class with the name **ComplexNumber**. The class needs **two fields** (instance variables) with name **real** and **imaginary** of type **double**. It represents the Complex Number.

The class needs to have **one constructor**. The constructor has parameters **real** and **imaginary** of type **double** and it needs to initialize the fields.

Write the following methods (instance methods):
- **Getters** for **real** and **imaginary** fields.
- Method named **add** with **two** parameters **real** and **imaginary** of type **double**, it needs to add parameters to fields. In other words, it needs to do a complex number add operation as described above.
- Method named **add** with **one** parameter of type **ComplexNumber**. It needs to **add** the ComplexNumber parameter to the corresponding instance variable.
- Method named **subtract** with **two** parameters **real** and **imaginary** of type **double**, it needs to **subtract** parameters from fields, in other words, it needs to do a complex number subtract operation as described above.
- Method named **subtract** with **one** parameter **other** of type **ComplexNumber**. It needs to **subtract** the other parameter from this complex number.

```
Example:

ComplexNumber one = new ComplexNumber(1.0, 1.0);
ComplexNumber two = new ComplexNumber(2.5, -1.5);

one.add(1, 1);

System.out.println("one.real = " + one.getReal());
System.out.println("one.imaginary = " + one.getImaginary());

one.subtract(two);

System.out.println("one.real = " + one.getReal());
System.out.println("one.imaginary = " + one.getImaginary());

two.subtract(one);

System.out.println("two.real = " + two.getReal());
System.out.println("two.imaginary = " + two.getImaginary());

Output:

one.real = 2.0
one.imaginary = 2.0
one.real = -0.5
one.imaginary = 3.5
two.real = 3.0
two.imaginary = -5.0
```

#### Solution:
**ComplexNumber.java**
```java
package com.learning.days041to060.days058;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber number) {
        this.add(number.getReal(), number.getImaginary());
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber number) {
        this.subtract(number.getReal(), number.getImaginary());
    }
}
```

**ComplexNumberDriver.java**
```java
package com.learning.days041to060.days058;

public class ComplexNumberDriver {
    public static void main(String[] args) {

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber two = new ComplexNumber(2.5, -1.5);

        one.add(1, 1);

        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());

        one.subtract(two);

        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());

        two.subtract(one);

        System.out.println("two.real = " + two.getReal());
        System.out.println("two.imaginary = " + two.getImaginary());

    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
one.real = 2.0
one.imaginary = 2.0
one.real = -0.5
one.imaginary = 3.5
two.real = 3.0
two.imaginary = -5.0
```