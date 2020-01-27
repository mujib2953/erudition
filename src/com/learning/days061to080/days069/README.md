Groceries List with ArrayList Challenge
--

#### Problem statement:

Create a **Grocery List** application with the help of **ArrayList**.

Add following feature:
- **Add** new item to list
- **View** the list
- **Search** the item in the list
- **Update** the item in the list
- **Delete** the item from the list



#### Solution:
**Groceries.java**
```java
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
```

**GroceriesDriver.java**
```java
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

        // --- minus 1 since array starts from 0
        groceries.modify(currentItem, newItem);
    }

    private static void removeItem() {
        System.out.print("Enter item name to remove from Groceries List : ");
        String item = scanner.nextLine();

        // --- minus 1 since array starts from 0
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
```

#### Explanation:

- Code is self explanatory.

#### Output
```
 Press
	 0. To print choice option.
	 1. To print the Groceries List.
	 2. To add items to the Groceries List.
	 3. To modify/update item in Groceries List.
	 4. To remove item from Groceries List.
	 5. To search item in Groceries List.
	 5. To Exit.
Enter you choice : 2
Please enter the Grocery item : bread
Enter you choice : 2
Please enter the Grocery item : eff
Enter you choice : 2
Please enter the Grocery item : cream roll
Enter you choice : 3
Enter current item : eff
Enter updated item : egg
Grocery item 2 has been modified.
Enter you choice : 1
You have 3 items in your list.
	1. bread
	2. egg
	3. cream roll
Enter you choice : 0

 Press
	 0. To print choice option.
	 1. To print the Groceries List.
	 2. To add items to the Groceries List.
	 3. To modify/update item in Groceries List.
	 4. To remove item from Groceries List.
	 5. To search item in Groceries List.
	 5. To Exit.
Enter you choice : 5
Enter item name to search in Groceries List : egg
Found egg in Groceries List.
Enter you choice : 0

 Press
	 0. To print choice option.
	 1. To print the Groceries List.
	 2. To add items to the Groceries List.
	 3. To modify/update item in Groceries List.
	 4. To remove item from Groceries List.
	 5. To search item in Groceries List.
	 5. To Exit.
Enter you choice : 4
Enter item name to remove from Groceries List : bread
Grocery item bread has been removed.
Enter you choice : 1
You have 2 items in your list.
	1. egg
	2. cream roll
Enter you choice : 0

 Press
	 0. To print choice option.
	 1. To print the Groceries List.
	 2. To add items to the Groceries List.
	 3. To modify/update item in Groceries List.
	 4. To remove item from Groceries List.
	 5. To search item in Groceries List.
	 5. To Exit.
Enter you choice : 6
```