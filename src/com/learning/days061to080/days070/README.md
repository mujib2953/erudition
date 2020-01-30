Mobile Contact App with ArrayList Challenge
--

#### Problem statement:

Create a program that implements a simple **mobile phone** with the following capabilities.

Implement following functionality:
- **Store** contact
- **Modify** contact
- **Remove** contact
- **Query** contact.

For **contact** create a separate **class Contacts** with **name** and **phone number** as fields value.

Create a another class with name **MobilePhone** that hold the **ArrayList of Contacts**. This class will responsible for doing **CURD activity of contacts**.

Add following menu of options to the class:.
- **Quit**
- **Print** list of contacts
- **Add** new contact
- **Update** existing contact
- **Remove** contact
- **Search/Find** contact.

When adding or updating be sure to check if the **contact already exists** (use name)

Be sure not to expose the inner workings of the ArrayList to MobilePhone
e.g. no **ints**, no **.get(i)** etc

**MobilePhone** should do everything with **Contact objects** only.

#### Solution:
**Contact.java**
```java
package com.learning.days061to080.days070;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}
```

**MobilePhone.java**
```java
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
        int newContactPosition = findContact(newContact);
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
```

**MobilePhoneDriver.java**
```java
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
            System.out.print("choose you action (6 to show available actions): ");
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
```

#### Explanation:

- Code is self explanatory.

#### Output
```
Starting Phone...

Available Options. 
 press
	0 - to shutdown.
	1 - to print the contacts.
	2 - to add new contacts.
	3 - to update existing contact.
	4 - to remove contacts.
	5 - to check if contact exits.
	6 - to print available options.
choose you action (6 to show available actions): 1
Your Mobile Phone has 0 contacts.

choose you action (6 to show available actions): 2
Enter name : Sam
Enter phone number : 123456
New contact, name: Sam, phone number: 123456 has been added.

choose you action (6 to show available actions): 2
Enter name : Tom
Enter phone number : 456789
New contact, name: Tom, phone number: 456789 has been added.

choose you action (6 to show available actions): 2
Enter name : Jerry
Enter phone number : 654321
New contact, name: Jerry, phone number: 654321 has been added.

choose you action (6 to show available actions): 1
Your Mobile Phone has 3 contacts.
Sam	--->	123456
Tom	--->	456789
Jerry	--->	654321

choose you action (6 to show available actions): 3
Enter name to update: Jerry
Enter updated name: Jerry
Enter updated number: 147258
Jerry, was replaced with Jerry

choose you action (6 to show available actions): 1
Your Mobile Phone has 3 contacts.
Sam	--->	123456
Tom	--->	456789
Jerry	--->	147258

choose you action (6 to show available actions): 4
Enter name to remove: Sam
Sam, has been removed from Contact List.

choose you action (6 to show available actions): 1
Your Mobile Phone has 2 contacts.
Tom	--->	456789
Jerry	--->	147258

choose you action (6 to show available actions): 5
Enter name to check: Tom
Tom, exist in the Contact List.

choose you action (6 to show available actions): 5
Enter name to check: Jerry
Jerry, exist in the Contact List.

choose you action (6 to show available actions): 0
Shutting down Phone...
```