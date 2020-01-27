package com.learning.days061to080.days069;

import java.util.ArrayList;

public class Groceries {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void add(String item) {
        groceryList.add(item);
    }

    public void print() {

        System.out.println("You have " + groceryList.size() + " items in your list.");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println("\t" + (i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modify(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position != -1) {
            modify(position, newItem);
        }
    }

    private void modify(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item has been modified.");
    }

    public void remove(String item) {
        int position = findItem(item);

        if (position != -1) {
            remove(position, item);
        }
    }

    private void remove(int position, String theItem) {
        groceryList.remove((position));
        System.out.println("Grocery item " + theItem + " has been removed.");
    }

    private int findItem(String item) {
        return  groceryList.indexOf(item);
    }

    public boolean hasItem(String item) {
        int position = findItem(item);
        return position != -1;
    }
}
