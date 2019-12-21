String Data Type
--

#### Problem statement:
Explore `String` data type.

#### Solution:
```java
package com.learning.Days008;

public class StringDataType {
    public static void main(String[] args) {

        String myString = "This is a String..";
        System.out.println("My string is = " + myString);

        myString += ", this is more string.";

        myString += " \u00A9 2019";
        System.out.println("My string is = " + myString);

        // --- numbers in the string formats
        String myNumberString = "250.55";
        myNumberString += "49.45";
        System.out.println("My Number string is = " + myNumberString);

        int myInt = 10;
        String lastString = "50";

        lastString += myInt;
        System.out.println("My last string is = " + lastString);

    }
}
```

#### Explanation:

- `String` is also one of the data-types used in Java.
- But it is **NOT primitive**
- It is a **class**
- Any string data can be initialized with the help of `"` double quotes.
- A string can save sequence of characters.
- Maximum value of character a String can hold is **2.14 billion** that is a lot.
- **Strings** in Java are **immutable**, this means that whenever we change any string value **new string** is generated instead of modifying the original string string.
- This in simple words **"We can not change any string once it is created by Java."**
- So if in your code String manipulation is very common then avoid **String** and use **StringBuffer**.

- `+` operator is used to concat the two strings.
- If one of the data type is not string (primitive data type only) and we are performing concatenation then Java convert that data type to `String`. 

  
 #### Output
 ```    
My string is = This is a String..
My string is = This is a String.., this is more string. © 2019
My Number string is = 250.5549.45
My last string is = 5010
```