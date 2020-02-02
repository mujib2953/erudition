Saveable Interface Challenge
--

#### Problem statement:

Create a simple **interface** and name it **Saveable**/**ISaveable**. That interface allows an object to be saved to some sort of storage medium. (**ArrayList**)

The exact type of medium is not known to the interface (nor to the classes that implement it).

The interface will just specify following two methods:
- return an **ArrayList** of values to be saved
- populate the object's fields from an **ArrayList** as parameter.

Create a few sample **classes** that **implement** your **Saveable interface**.

Override the `toString()` method for each of your **classes** so that they can be easily printed to enable the program to be tested easier.

In **Main**, write a **method** that takes an **object** that **implements** the **interface** as a **parameter** and **saves** the values e.g. calls the method defined in the interface.
 
Your **method** should just **print** the values to the screen. Also in the **Main** class, write a method that restores the values to a Saveable object e.g. calls the method from the interface for populating fields.
 
we are not going to use **Java file I/O**; instead use the `readValues()` **method** below to simulate getting values from a file – this allows you to type as many values as your class requires, and returns an ArrayList.

```
public static ArrayList<String> readValues() {
    ArrayList<String> values = new ArrayList<String>();

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
```

#### Solution:
**Saveable.java**
```java
package com.learning.days061to080.days072;

import java.util.List;

public interface Saveable {
    List<String> write();
    void read(List<String> savedValues);
}
```

**Player.java**
```java
package com.learning.days061to080.days072;

import java.util.ArrayList;
import java.util.List;

public class Player implements Saveable {

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "swords";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, hitPoints + "");
        values.add(2, this.strength + "");
        values.add(3, this.weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        } else {}
    }
}
```

**Monster.java**
```java
package com.learning.days061to080.days072;

import java.util.ArrayList;
import java.util.List;

public class Monster implements Saveable {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, this.hitPoints + "");
        values.add(2, this.strength + ""    );

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
```

**Driver.java**
```java
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
```

#### Explanation:

- We have created a interface named Saveable, and 2 concrete classes are implementing the interface and its methods.

#### Output
```
Player{name='Bryant', hitPoints=100, strength=150, weapon='swords'}
Saving ... Bryant to storage device.
Saving ... 100 to storage device.
Saving ... 150 to storage device.
Saving ... swords to storage device.

Updated hit points and weapon.

Saving ... Bryant to storage device.
Saving ... 300 to storage device.
Saving ... 150 to storage device.
Saving ... Mighty Sword to storage device.
Player{name='Bryant', hitPoints=300, strength=150, weapon='Mighty Sword'}
Monster{name='werewolf', hitPoints=80, strength=70}
Saving ... werewolf to storage device.
Saving ... 80 to storage device.
Saving ... 70 to storage device.
70
```