Method Challenge
--

#### Problem statement:
Follow the below steps for challenge:

1. Create a method **calculateScore** which will calculate the the `finalScore` of the user.
2. It will have `gameOver` as `boolean`, `score` as `int`, `levelCompleted` as `int` and `bonus` as `int` parameters.
3. If `gameOver` is false then return **-1** indicating that final score is **-1** since game is not completed. Otherwise calculate the final score and return the value.
4. Create a method called **displayHighScorePosition**. It should a players **name** as parameter, and a 2nd parameters **position** in a highScore table
5. You should display players name along with a message like **" managed to get into position "** and the position they got and the further message **" on the high score table."**.
6. create a one more method called **calculateHighScorePosition**. It should be sent on argument only, the player score
7. It should return an int, the return data should be
	- 1 if the score is > 1000
	- 2 if the score is > 500 & < 1000
	- 3 if the score is > 100 & < 500
	- 4 in all other cases
8. call both methods and display the result of the following 
    - a score of 1500, 900, 400, and 50


#### Solution:
```java
package com.learning.days001to020.days012;

public class MethodChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is = " + highScore);

        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is = " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);

    }

    private static int calculateScore(
        boolean gameOver,
        int score,
        int levelCompleted,
        int bonus
    ) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return  finalScore;
        }

        return -1;
    }

    private static void displayHighScorePosition(
        String name,
        int position
    ) {
        System.out.println(
            name +
            " managed to get into position " +
            position +
            " on the high score table."
        );
    }

    private static int calculateHighScorePosition(
        int score
    ) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}
```

#### Explanation:

- Code is self explanatory.
 
 #### Output
 ```    
Your final score is = 1300
Your final score is = 2600
Tim managed to get into position 1 on the high score table.
Bob managed to get into position 2 on the high score table.
Percy managed to get into position 3 on the high score table.
Gilbert managed to get into position 4 on the high score table.
```