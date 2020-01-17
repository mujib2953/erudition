Pounds to Kilograms Challenge
--

#### Problem statement:
Please follow the below steps for challenge:
1. Create a variable with appropriate type to store a number of **pounds** to be converted to **kilogram**.
2. calculate the result i.e. the number of **kilograms** based on the contents of the variable above and store the result in a 2nd appropriate variable.
3. Print out the result on the console.

_**HINT :**_ **1** pound is equals to **0.45359237** of a kilogram.

#### Solution:
```java
package com.learning.days001to020.days006;

public class Pounds2Kgs {
    static final double onePoundToKgs = 0.45359237d;

    public static void main(String[] args) {
        double numberOfPounds = 200d;

        double convertedToKgs = numberOfPounds * Pounds2Kgs.onePoundToKgs;

        System.out.println( numberOfPounds + " pounds are equals to " + convertedToKgs);
    }
}
```

#### Explanation:

- In the above code we declared class level property `onePoundToKgs`, which is static. This means that we can access this property any time without creating an object of the class.
- To read any static property or methods we always used its class name. Like in the above code we read `onePoundToKgs` as `Pounds2Kgs.onePoundToKgs` with its class name.

  
 #### Output
 ```    
200.0 pounds are equals to 90.718474
```