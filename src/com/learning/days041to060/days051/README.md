Paint Job Challenge
--

#### Problem statement:

Bob is a wall painter and he needs your help. You have to write a program that helps Bob calculate **how many buckets of paint** he needs to buy before going to work. Bob might also have some extra buckets at home. He also knows the **area** that he can cover with one bucket of paint.

Write a method named **getBucketCount** with **4 parameters**. The first parameter should be named **width** of type **double**. This parameter represents **width of the wall**.

The second parameter should be named **height** of type **double**. This parameter represents the **height of the wall**

The third parameter should be named **areaPerBucket**. This parameter represents the **area that can be covered with one bucket of paint**.

The fourth parameter should be named **extraBuckets**. This parameter represents **buckets count** that Bob has at **home**.

The method needs to return a value of type **int** that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to notes below.

If one of the parameters **width**, **height** or **areaPerBucket** is **less or equal to 0** or if **extraBuckets** is **less than 0**, the method needs to **return -1** to indicate an **invalid value**.

If all parameters are valid, the method needs to calculate the number of buckets and return it.

```
Examples:
    - getBucketCount(-3.4, 2.1, 1.5, 2)     => -1
    - getBucketCount(3.4, 2.1, 1.5, 2)      => 3
    - getBucketCount(2.75, 3.25, 2.5, 1)    => 3
```

Bob does not like to **enter 0** for the **extraBuckets** parameter so he needs another method.

Write another **overloaded method** named **getBucketCount** with **3 parameters** namely **width**, **height**, and **areaPerBucket** (all of type double)

This method needs to return a value of type **int** that represents the numbers of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to notes below.

If one of the parameters **width**, **height** or **areaPerBucket** is **less or equal to 0** the method needs to **return -1** to indicate an **invalid value**.

If all parameters are valid, the methods needs to calculate the number of buckets and return it.

```
Example:
    - getBucketCount(-3.4, 2.1, 1.5)    => -1
    - getBucketCount(3.4, 2.1, 1.5)     => 5
    - getBucketCount(7.25, 4.3, 2.35)   => 14
```

In some cases, Bob does not know the **width** and **height** of the wall, but he knows the are of wall. Hee needs you to write another method.

Write another **overloaded method** named **getBucketCount** with **2 parameters** namely, **area** and **arePerBucket** (both of type double).

The method needs to return a value of type **int** that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.

If one of the parameters area or **areaPerBucket** is **less or equal to 0**, the method needs to **return -1** to indicate **invalid value**.

If all parameters are valid, the method needs to calculate the number of buckets and return it.

```
Example
    - getBucketCount(3.4, 1.5)      => 3
    - getBucketCount(6.26, 2.2)      => 3
    - getBucketCount(3.26, 0.75)      => 5
```

_**Note :**_
- Use the method **Math.ceil** to round the number of calculated buckets (**double**) then convert it into an **int** before returning value from the methods.

#### Solution:
**PaintJob.java**
```java
package com.learning.days041to060.days051;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));

        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));

        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
    }

    public static int getBucketCount(
        final double width,
        final double height,
        final double areaPerBucket,
        final int extraBuckets
    ) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;
        double requiredBuckets = Math.ceil(area / areaPerBucket);
        return (int) (requiredBuckets) - extraBuckets;
    }

    public static int getBucketCount(
        final double width,
        final double height,
        final double areaPerBucket
    ) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(
        final double area,
        final double areaPerBucket
    ) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
-1
3
3
-1
5
14
3
3
5
```