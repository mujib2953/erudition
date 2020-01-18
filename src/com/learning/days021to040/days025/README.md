Playing Cat Challenge
--

#### Problem statement:

The cat spend most of the day playing. In particular, they play if the **temperature** is **between 25 and 35 (inclusive)**. Unless it is **summer**, the the **upper limit** is **45** instead of **35**.
- Write a method **isCatPlaying** that has **2 param**. method needs to return **true** if cat is playing, otherwise return **false**
- **1st param** should be of type **boolean** and be named **summer**, it represents if it is summer.
- **2nd param** represent the **temperature** and is of type **int** with the name temperature
    
```
- Example
	- isCatPlaying(true, 10)	=> false (range 25 - 45)
	- isCatPlaying(false, 36)	=> false (range 25 - 35)
	- isCatPlaying(true, 35)	=> true
```

#### Solution:
**PlayingCat.java**
```java
package com.learning.days021to040.days025;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(true, 35));
    }

    public static boolean isCatPlaying(
        final boolean summer,
        final int temperature
    ) {
        return (temperature >= 25 && (summer ? (temperature <= 45) : (temperature <= 35)));
    }
}
```

#### Explanation:

- Code is self explanatory.
 
 #### Output
 ```
false
false
true
```