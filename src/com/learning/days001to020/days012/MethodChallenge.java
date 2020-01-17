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
