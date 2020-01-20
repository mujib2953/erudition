Flour Pack Problem Challenge
--

#### Problem statement:

- Write a method name **canPack** with **three parameters** of type **int** named **bigCount**, **smallCount** and **goal**.
- The parameter **bigCount** represents the count of big flour bags (5 kilo each).
- The parameter **smallCount** represents the count of small flour bags (1 kilo each).
- The parameter **goal** represents the goal amount of kilos of flour needed to assemble a package.

- Therefore, the **sum** of the kilos of **bigCount** and **smallCount** must be at **least equal** to value of **goal**. The method should **return true** if it is possible to make a package with **goal** kilos of flour.
- If the **sum** is greater than **goal**, ensure that only full bags are used towards the goal amount. For example, if **goal = 9**, **bigCount = 2** and **smallCount = 0**, the method should **return false**. Since each big bag is 5 kilos and cannot be divided.
- However, if **goal = 9**, **bigCount = 1** and **smallCount = 5**, the method should **return true** because of 1 full **bigCount** bag and 4 full **smallCount** bags equal **goal**, and it's okay if there are additional bags left over.
- If any of the parameters are **negative**, **return false**.

```
- Example
    - canPack(1, 0, 4);     => should return false since bigCount is 1 (nig bag of 5 kilos) and goal is 4 kilos.
    - canPack(1, 0, 5);     => should return true since bigCount is 1 (nig bag of 5 kilos) and goal is 4 kilos.
    - canPack(0, 5, 4);     => should return true since smallCount is 5(small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above
    - canPack(2, 2, 11);    => should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.
    - canPack(-3, 2, 12);   => should return false since bigCount is negative 
```

#### Solution:
**FlourPacker.java**
```java
package com.learning.days041to060.days045;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(2, 0, 9));
        System.out.println(canPack(1, 5, 9));
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }

    public static boolean canPack(
        final int bigCount,
        final int smallCount,
        final int goal
    ) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        for (int i = smallCount; i >= 0; i--) {
            for (int j = bigCount; j >= 0; j--) {
                if ((i + (5 * j)) == goal) {
                    return true;
                }
            }
        }
        return false;
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
false
true
false
true
true
true
false
```