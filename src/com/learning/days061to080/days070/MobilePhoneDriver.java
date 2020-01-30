package com.learning.days061to080.days070;

import java.util.Scanner;

public class MobilePhoneDriver {
    private static final Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("12345");

    public static void main(String[] args) {

        boolean quite = false;
        int option;
        startPhone();
        printOption();
        while (!quite) {
            System.out.print("\nchoose you action (6 to show available actions): ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    shutdown();
                    quite = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    checkContactExist();
                    break;
                case 6:
                    printOption();
                    break;
                default:
                    System.out.println("Invalid option inserted. below are the options.");
                    printOption();
            }
        }
    }

    private static void startPhone() {
        System.out.println("Starting Phone...");
    }

    private static void printOption() {
        System.out.println("\nAvailable Options. \n press");
        System.out.println("\t0 - to shutdown.");
        System.out.println("\t1 - to print the contacts.");
        System.out.println("\t2 - to add new contacts.");
        System.out.println("\t3 - to update existing contact.");
        System.out.println("\t4 - to remove contacts.");
        System.out.println("\t5 - to check if contact exits.");
        System.out.println("\t6 - to print available options.");
    }

    private static void shutdown() {
        System.out.println("Shutting down Phone...");
    }

    private static void printContacts() {
        mobilePhone.printAllContacts();
    }

    private static void addNewContact() {
        System.out.print("Enter name : ");
        String name = scanner.nextLine();

        System.out.print("Enter phone number : ");
        String phoneNumber = scanner.nextLine();

        Contact newContact = Contact.createContact(name, phoneNumber);

        if (mobilePhone.add(newContact)) {
            System.out.println("New contact, name: " + newContact.getName() + ", phone number: " + newContact.getPhoneNumber() + " has been added.");
        } else {
            System.out.println("Can't add " + newContact.getName() + ", since it is already exist.");
        }
    }

    private static void updateContact() {
        System.out.print("Enter name to update: ");
        String oldName = scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(oldName);

        if (oldContact == null) {
            System.out.println(oldName + ", contact name not found in Contact List.");
            return;
        }

        System.out.print("Enter updated name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter updated number: ");
        String newNumber = scanner.nextLine();

        Contact newContact = Contact.createContact(newName, newNumber);

        if (mobilePhone.query(newContact) != null) {
            System.out.println(newName + ", is already exist in Contact List.");
            return;
        }

        mobilePhone.update(oldContact, newContact);
    }

    private static void removeContact() {
        System.out.print("Enter name to remove: ");
        String contactName = scanner.nextLine();
        Contact contactToRemove = mobilePhone.queryContact(contactName);

        if (contactToRemove == null) {
            System.out.println(contactName + ", is not found in Contact List.");
            return;
        }

        mobilePhone.remove(contactToRemove);
        System.out.println(contactToRemove.getName() + ", has been removed from Contact List.");
    }

    private static void checkContactExist() {
        System.out.print("Enter name to check: ");
        String name = scanner.nextLine();

        if (mobilePhone.queryContact(name) != null) {
            System.out.println(name + ", exist in the Contact List.");
        } else {
            System.out.println(name + ", does not exist in the Contact List.");
        }
    }
}
