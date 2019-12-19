Primitive Type Challenge
--

#### Problem statement:
Please follow the below steps for challenge:
1. Create a **byte** variable and set it to any valid byte number.
2. Create a **short** variable and set it to any valid short number.
3. Create a **int** variable and set it to any valid int number.
4. Lastly, create a variable of type **long** and make it equals to **50000 plus 10 times** the sum of the type **byte plus** the **short plus** the **integer** values.


#### Solution:
```java
package com.learning.Days005;

public class PrimitiveTypeChallenge {
    public static void main(String[] args) {

        byte myByte = 15;
        short myShort = 25;
        int myInt = 50;

        long myLong = 5000L + 10L * (myByte + myShort + myInt);

        System.out.println("Output is = " + myLong);

    }
}
```

#### Explanation:

- It is self explanatory.
  
 #### Output
 ```    
Output is = 5900
```