package com.learning.days001to020.days010;

public class IfElseStatement {
    public static void main(String[] args) {
        boolean isAlien = false;

        if (!isAlien) {
            System.out.println("It is not an alien!!...");
            System.out.println("And I am scared of aliens..");
        } else {
            System.out.println("Ohh... it is an alien.. run...");
        }

        System.out.println("--- After updating expression ---");

        if (isAlien) {
            System.out.println("It is not an alien!!...");
            System.out.println("And I am scared of aliens..");
        } else {
            System.out.println("Ohh... it is an alien.. run...");
        }
    }
}
