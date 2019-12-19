Data Types
--

#### Problem statement:
We have to explore on `byte`, `short`, `int` and `long` data type.

- What is the maximum and minimum values that they can hold?
- What will happen if we tries to store value greater/smaller than their limit.

#### Solution:
```java
package com.learning.Days003;

public class DataTypes {
    public static void main(String[] args) {

        System.out.println(" ------------- Byte -------------- ");
        
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte MIN Value \t= " + myMinByteValue);
        System.out.println("Byte MAX Value \t= " + myMaxByteValue);

        System.out.println("Byte Busted MIN Value \t= " + (myMinByteValue - 1));
        System.out.println("Byte Busted MAX Value \t= " + (myMaxByteValue + 1));

        System.out.println(" ----------- Short ---------------- ");

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short MIN Value \t= " + myMinShortValue);
        System.out.println("Short MAX Value \t= " + myMaxShortValue);

        System.out.println("Short Busted MIN Value \t= " + (myMinShortValue - 1));
        System.out.println("Short Busted MAX Value \t= " + (myMaxShortValue + 1));

        System.out.println(" ------------ Integer --------------- ");

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer MIN Value \t= " + myMinIntValue);
        System.out.println("Integer MAX Value \t= " + myMaxIntValue);

        System.out.println("Integer Busted MIN Value \t= " + (myMinIntValue - 1));
        System.out.println("Integer Busted MAX Value \t= " + (myMaxIntValue + 1));

        int myMaxInt = 2_147_483_647; // --- if we just add one in the value to make it 2_147_483_648, we will get compiler error "Integer number too large."

        System.out.println(" -------------- Long ------------- ");

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long MIN Value \t= " + myMinLongValue);
        System.out.println("Long MAX Value \t= " + myMaxLongValue);

        System.out.println("Long Busted MIN Value \t= " + (myMinLongValue - 1));
        System.out.println("Long Busted MAX Value \t= " + (myMaxLongValue + 1));

        System.out.println(" -------------------------------- ");


    }
}

```

#### Explanation:

- `Byte` is the class for creating `byte` values.
- `Short` is the class for creating `short` values.
- `Integer` is the class for creating `int` values.
- `Long` is the class for creating `long` values.

- They all has `MIN_VALUE` and `MAX_VALUE` static properties, which shows it maximum and minimum value limit.
- If we add 1 to it's `MAX_VALUE` we will overflow the their capacity and we will get `MIN_VALUE`.
- If we subtract 1 from `MIN_VALUE` we will overflow the their capacity and we will get `MAX_VALUE`.
  
 #### Output
 ```    
 ------------- Byte -------------- 
Byte MIN Value 	= -128
Byte MAX Value 	= 127
Byte Busted MIN Value 	= -129
Byte Busted MAX Value 	= 128
 ----------- Short ---------------- 
Short MIN Value 	= -32768
Short MAX Value 	= 32767
Short Busted MIN Value 	= -32769
Short Busted MAX Value 	= 32768
 ------------ Integer --------------- 
Integer MIN Value 	= -2147483648
Integer MAX Value 	= 2147483647
Integer Busted MIN Value 	= 2147483647
Integer Busted MAX Value 	= -2147483648
 -------------- Long ------------- 
Long MIN Value 	= -9223372036854775808
Long MAX Value 	= 9223372036854775807
Long Busted MIN Value 	= 9223372036854775807
Long Busted MAX Value 	= -9223372036854775808
 -------------------------------- 
```