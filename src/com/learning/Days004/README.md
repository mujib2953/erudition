Casting
--

#### Problem statement:
**Casting** is the process in which we change the output from one form to another one.

In similar way in which we change the mud/clay to some kind of bricks, we change our variable's type from one form to another one.

This is very common in Java, that after calculation the output variable is generated is of other type. So to change it into our required type we used casting

There is very common **ClassCastException** exception if we didn't handle casting properly

There are 2 types of casting
1. **Upcasting**
2. **Downcasting**

##### Upcasting
- It is casting to **super type** or **parent type**.
- It is always allowed
- There is no chances of any exceptions

##### Downcasting
- It is casting to **sub type** or **child type**.
- It requires type checking before assigning values
- It may throws an exception, if we didn't handle it properly
 

#### Solution:
```java
package com.learning.Days004;

public class Casting {
    public static void main(String[] args) {

        byte myMinByte = Byte.MIN_VALUE;
        short myMinShort = Short.MIN_VALUE;
        int myMinInt = Integer.MIN_VALUE;

        int myInt = (myMinInt / 2); // --- does not throw any error

        // byte myByte = (myMinByte / 2); // --- will throws an error, like require byte but getting int
        byte myByte = (byte) (myMinByte / 2); // -- this is casting the output

        // short myShort = (myMinShort / 2); // --- will throws an error, like require short but getting int
        short myShort = (short) (myMinShort / 2); // --this casting

    }
}
```

#### Explanation:

- In the above code, when we divide any non `int` by not same type.
- like `byte` number is divided bt non `byte` number will produce exception
- So handle such scenario we have to use `casting`
  
 #### Output
 ```    
// --- code will complie successfully
```