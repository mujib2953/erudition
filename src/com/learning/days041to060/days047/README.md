Diagonal Star Challenge
--

#### Problem statement:

- Write a method named **printSquareStar** with **one parameter** of type **int** named **number**.
- If number is **< 5**, the method should print **Invalid Value**.
- The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops.

##### Example
printSquare(5); should print following
```
*****
** **
* * *
** **
*****
```
printSquare(8); should print following
```
********
**    **
* *  * *
*  **  *
*  **  *
* *  * *
**    **
********
```

- The pattern above consist of number of rows and columns (where number is the number of rows to print). For each row or column, stars are printed based on four conditions.
    - In the first and last row
    - In the first and last column
    - When row number equals the column number
    - When the column number equals rowCount - currentRow + 1

#### Solution:
**DiagonalStar.java**
```java
package com.learning.days041to060.days047;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
        System.out.println();
        printSquareStar(8);
    }

    public static void printSquareStar(
        final int number
    ) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 0; row < number; row++) {
            for (int col = 0; col < number; col++) {
                int limit = (number - 1);
                if (
                    (row == 0 || row == limit) ||
                    (col == 0 || col == limit) ||
                    (row == col) ||
                    (limit - row ) == col
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
```

#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
*****
** **
* * *
** **
*****

********
**    **
* *  * *
*  **  *
*  **  *
* *  * *
**    **
********
```