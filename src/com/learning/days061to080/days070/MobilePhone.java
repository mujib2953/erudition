package com.learning.days061to080.days070;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> contacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<>();
    }

    public boolean add(Contact contact) {
        if (findContact(contact.getName()) == -1) {
            this.contacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean update(Contact oldContact, Contact newContact) {
        int oldContactPosition = findContact(oldContact);
        int newContactPosition = findContact(newContact.getName());
        if (newContactPosition != -1) {
            System.out.println("New contact " + newContact.getName() + " is already exist in Contact List.");
            return false;
        }

        if (oldContactPosition == -1) {
            System.out.println("Old contact " + oldContact.getName() + " is not exist in Contact List.");
            return false;
        }

        contacts.set(oldContactPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public String query(Contact contact) {
        if (findContact(contact) != -1) {
            return contact.getName();
        }
        return null;
    }

    public boolean remove(Contact contact) {
        if (findContact(contact) != -1) {
            contacts.remove(contact);
            return true;
        }
        return false;
    }

    public void printAllContacts() {
        System.out.println("Your Mobile Phone has " + contacts.size() + " contacts.");

        for (Contact contact : contacts) {
            System.out.println(contact.getName() + "\t--->\t" + contact.getPhoneNumber());
        }
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position != -1) {
            return contacts.get(position);
        }
        return null;
    }

    private int findContact(Contact contact) {
        return this.contacts.indexOf(contact);
    }

    private int findContact(String name) {

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                return i;
            }
        }

        return -1;
    }
}
