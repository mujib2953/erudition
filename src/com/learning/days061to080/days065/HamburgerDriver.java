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
