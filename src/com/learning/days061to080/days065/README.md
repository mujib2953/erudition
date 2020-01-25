Bills Burgers (OOP Challenge)
--

#### Problem statement:

The purpose of the application is to help fictitious company called **Bills Burgers** to manage their process of selling hamburgers.

Our application wil help Bills to select types of burgers, some of the additional items (additions) to be added to the burgers and pricing.

We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.

The **basic hamburger** should have following items:
- **Bread roll type**
- **meat**
- and **upto 4 additional** additions (things like **lettuce**, **tomato**, **carrot**, etc) that the **customer can select** to be added to the burger.

Each one of these items gets **charged an additional price** so you needs some way to track how many items got added and to calculate the final price (base burger with all the additions).

This burger has a base price and the additions are all separately priced (up to 4 additions, see above).

Creat a **Hamburger** class to deal with all the above

The constructor should only include the **roll type**, **meat** and **price**, can also include name of burger or you can use a setter.

Also create two extra varieties of Hamburgers (sub-classes) to cater for:
a) **Healthy Burger** (on a **brown rye bread roll**), **plus two addition** items that can be added.

The healthy burger can have **6 items (Additions) in total**.

_**hint:**_ you probably want to process the two additional items in this mew class (subclass of Hamburger), not the base class (Hamburger), since the two additions are only appropriate for this new class (in other words new burger type).

b) **Deluxe Burger**: comes with **chips** and **drinks** as additions, **but no extra additions** are allowed.

_**hint:**_ You have to find a way to automatically add these new additions at the time the deluxe burger object is created, and then prevent other additions being made.

All 3 class should have methods that can be called anytime to show the base price of the hamburger plus all additional, each showing the addition name, and addition price, and a grand/final total for the burger (base price + all additions) 

For the two additional class this may require you to be looking at the base class for pricing and then adding totals to final price.

#### Solution:
**Hamburger.java**
```java
package com.learning.days061to080.days065;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String additional1Name;
    private double additional1Price;

    private String additional2Name;
    private double additional2Price;

    private String additional3Name;
    private double additional3Price;

    private String additional4Name;
    private double additional4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addAddition1(String name, double price) {
        this.additional1Name = name;
        this.additional1Price = price;
    }

    public void addAddition2(String name, double price) {
        this.additional2Name = name;
        this.additional2Price = price;
    }

    public void addAddition3(String name, double price) {
        this.additional3Name = name;
        this.additional3Price = price;
    }

    public void addAddition4(String name, double price) {
        this.additional4Name = name;
        this.additional4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;

        System.out.println(
            this.name + " hamburger on a " +
            this.breadRollType + " roll with " +
            this.meat + " price is $" +
            this.price
        );

        if (this.additional1Name != null) {
            hamburgerPrice += this.additional1Price;
            System.out.println(" Added " + this.additional1Name + " for an extra $" + this.additional1Price);
        }

        if (this.additional2Name != null) {
            hamburgerPrice += this.additional2Price;
            System.out.println(" Added " + this.additional2Name + " for an extra $" + this.additional2Price);
        }

        if (this.additional3Name != null) {
            hamburgerPrice += this.additional3Price;
            System.out.println(" Added " + this.additional3Name + " for an extra $" + this.additional3Price);
        }

        if (this.additional4Name != null) {
            hamburgerPrice += this.additional4Price;
            System.out.println(" Added " + this.additional4Name + " for an extra $" + this.additional4Price);
        }

        return hamburgerPrice;
    }
}
```

**HealthyBurger.java**
```java
package com.learning.days061to080.days065;

public class HealthyBurger extends Hamburger {
    
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();

        if (this.healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println(" Added " + this.healthyExtra1Name+ " for an extra $" + this.healthyExtra1Price);
        }

        if (this.healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println(" Added " + this.healthyExtra2Name+ " for an extra $" + this.healthyExtra2Price);
        }
        
        return hamburgerPrice;
    }
}
```

**DeluxeBurger.java**
```java
package com.learning.days061to080.days065;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addAddition1("Chips", 2.75);
        super.addAddition2("Drinks", 1.80);
    }

    @Override
    public void addAddition1(String name, double price) {
        System.out.println("Can not add additional items to deluxe burger");
    }

    @Override
    public void addAddition2(String name, double price) {
        System.out.println("Can not add additional items to deluxe burger");
    }

    @Override
    public void addAddition3(String name, double price) {
        System.out.println("Can not add additional items to deluxe burger");
    }

    @Override
    public void addAddition4(String name, double price) {
        System.out.println("Can not add additional items to deluxe burger");
    }
}
```

**HamburgerDriver.java**
```java
package com.learning.days061to080.days065;

public class HamburgerDriver {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price;

        hamburger.addAddition1("Tomato", 0.27);
        hamburger.addAddition2("Lettuce", 0.75);
        hamburger.addAddition3("Cheese", 1.13);

        price = hamburger.itemizeHamburger();

        System.out.println("Total Price - $" + price);
        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);

        healthyBurger.addAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);

        price = healthyBurger.itemizeHamburger();

        System.out.println("Healthy Total Price - $" + price);
        System.out.println();

        DeluxeBurger deluxeBurger = new DeluxeBurger();

        deluxeBurger.addAddition1("Eggs", 5.43);

        price = deluxeBurger.itemizeHamburger();

        System.out.println("Deluxe Total Price - $" + price);
        System.out.println();

    }
}
```

#### Explanation:

- Code is self explanatory.

#### Output
 ```
Basic hamburger on a White roll with Sausage price is $3.56
    Added Tomato for an extra $0.27
    Added Lettuce for an extra $0.75
    Added Cheese for an extra $1.13
Total Price - $5.71

Healthy hamburger on a Brown Rye roll with Bacon price is $5.67
    Added Egg for an extra $5.43
    Added Lentils for an extra $3.41
Healthy Total Price - $14.51

Can not add additional items to deluxe burger
Deluxe hamburger on a White roll with Sausage & Bacon price is $14.54
    Added Chips for an extra $2.75
    Added Drinks for an extra $1.8
Deluxe Total Price - $19.09
```