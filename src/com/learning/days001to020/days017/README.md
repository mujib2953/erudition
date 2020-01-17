Decimal Comparator Challenge
--

#### Problem statement:

- Write a method **areEqualByThreeDecimalPlaces** with **two parameters** of type **double**.
- The method **should return boolean** and it need to return true if two double numbers are the same upto three decimal places. Otherwise **return false**.

```
- Example
    - areEqualByThreeDecimalPlaces(-3.1756, -3.175)     => true;
    - areEqualByThreeDecimalPlaces(3.175, 3.176) 	=> false;
    - areEqualByThreeDecimalPlaces(3.0, 3.0) 		=> true;
    - areEqualByThreeDecimalPlaces(-3.123, 3.123) 	=> false;
```

#### Solution:
**DecimalComparator.java**
```java
package com.learning.days001to020.days017;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(
        double number_1,
        double number_2
    ) {
        int number1 = (int) (number_1 * 1000);
        int number2 = (int) (number_2 * 1000);

        return (number1 == number2);
    }
}
```
**Main.java**
```java
package com.learning.days001to020.days017;

public class Main {
    public static void main(String[] args) {

        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));

    }
}
```

#### Explanation:

- Code is self explanatory.
 
 #### Output
 ```
true
false
true
false
```