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
