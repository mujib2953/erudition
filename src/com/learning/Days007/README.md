Char and Boolean
--

#### Problem statement:
Explore on `char` and `boolean` data type.

#### Solution:
```java
package com.learning.Days007;

public class CharAndBoolean {
    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        char copyRightSymbol = '\u00A9';

        System.out.println("My Char is " + myChar);
        System.out.println("My Unicode Char is " + myUnicodeChar);
        System.out.println("Copyright symbol using unicode is " + copyRightSymbol);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        System.out.println("My True Boolean value is " + myTrueBooleanValue);
        System.out.println("My False Boolean value is " + myFalseBooleanValue);
    }
}

```

#### Explanation:

###### `char` 
- `char` is reserve keyword in Java to denote character data type.
- It store only one character at a time.
- Normally we use `'` i.e. single quote to declare any character value.
- If we use `"` i.e. double quote to store char values the compiler will throw error.
- `char` occupies `2 bytes` or `16 bits` of memory to store unicode characters.
- `unicode` is an international encoding standard for use of different language and scripts. unicode character denotes any characters/symbols/letters/digits etc. using unique numeric value.
- [unicode-table](https://unicode-table.com/en/) is the good site which lists almost all unicode.

###### `boolean`
- `boolean` value allows for two choices `True` or `False`, `Yes` or `No`, `1` or `0`.


  
 #### Output
 ```    
My Char is D
My Unicode Char is D
Copyright symbol using unicode is ©
My True Boolean value is true
My False Boolean value is false
```