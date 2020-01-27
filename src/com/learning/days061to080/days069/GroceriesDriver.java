package com.learning.days061to080.days069;

import java.util.Scanner;

public class GroceriesDriver {

    private static Scanner scanner = new Scanner(System.in);
    private static Groceries groceries = new Groceries();

    public static void main(String[] args) {

        boolean quite = false;
        int choice;
        printInstruction();
        while (!quite) {
            System.out.print("Enter you choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quite = true;
                    break;
            }
        }
    }

    private static void printInstruction() {
        System.out.println("\n Press");
        System.out.println("\t 0. To print choice option.");
        System.out.println("\t 1. To print the Groceries List.");
        System.out.println("\t 2. To add items to the Groceries List.");
        System.out.println("\t 3. To modify/update item in Groceries List.");
        System.out.println("\t 4. To remove item from Groceries List.");
        System.out.println("\t 5. To search item in Groceries List.");
        System.out.println("\t 5. To Exit.");
    }

    private static void printGroceryList() {
        groceries.print();
    }

    private static void addItem() {
        System.out.print("Please enter the Grocery item : ");
        groceries.add(scanner.nextLine());
    }

    private static void modifyItem() {
        System.out.print("Enter current item : ");
        String currentItem = scanner.nextLine();

        System.out.print("Enter updated item : ");
        String newItem = scanner.nextLine();
        
        groceries.modify(currentItem, newItem);
    }

    private static void removeItem() {
        System.out.print("Enter item name to remove from Groceries List : ");
        String item = scanner.nextLine();

        groceries.remove(item);
    }

    private static void searchItem() {
        System.out.print("Enter item name to search in Groceries List : ");
        String item = scanner.nextLine();

        if (groceries.hasItem(item)) {
            System.out.println("Found " + item + " in Groceries List.");
        } else {
            System.out.println(item + " not found in Groceries List.");
        }
    }
}
