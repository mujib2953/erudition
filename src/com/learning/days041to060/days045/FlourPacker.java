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
