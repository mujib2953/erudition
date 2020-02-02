package com.learning.days061to080.days072;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Player bryant = new Player("Bryant", 100, 150);
        System.out.println(bryant);

        saveObject(bryant);

        bryant.setHitPoints(300);
        bryant.setWeapon("Mighty Sword");

        System.out.println("\nUpdated hit points and weapon.\n");

        saveObject(bryant);
        // loadObject(bryant);

        System.out.println(bryant);

        Saveable werewolf = new Monster("werewolf", 80, 70);
        System.out.println(werewolf);

        saveObject(werewolf);
        System.out.println(((Monster) werewolf).getStrength());
    }

    private static List<String> readValues() {
        List<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    private static void saveObject(Saveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving ... " + objectToSave.write().get(i) + " to storage device.");

        }
    }

    private static void loadObject(Saveable objectToLoad) {
        List<String> values = readValues();
        objectToLoad.read(values);
    }
}
