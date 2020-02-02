package com.learning.days061to080.days073;

public class MyLinkedList implements NodeList {

    private ListItem root;
    private int capacity = 0;

    protected MyLinkedList(ListItem root) {
        this.root = root;
    }

    public int size() {
        return this.capacity;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {

        if (this.root == null) {
            // --- List is empty
            this.root = newItem;
            this.capacity++;
            return true;
        }

        ListItem currentItem = this.root;

        while (currentItem != null) {

            int comparision = currentItem.compareTo(newItem);

            if (comparision < 0) {
                // --- newItem is greater than the currentItem, so move to right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);

                    this.capacity++;
                    return true;
                }
            } else if (comparision > 0) {
                // --- newItem is less than the currentItem, so move to right if possible.
                if (currentItem.previous() != null) {
                    // currentItem = currentItem.previous();
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                } else {
                    // --- we have reached root
                    newItem.setNext(currentItem);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }

                this.capacity++;
                return true;
            } else {
                // --- equal/same data
                System.out.println(newItem.getValue() + " is already present.");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {

        if (item == null) {
            System.out.println("No null values found in the list..");
            return false;
        }

        if (size() == 0) {
            System.out.println("remove() :: List is empty.");
            return false;
        }

        ListItem currentItem = this.root;

        while (currentItem != null) {
            int comparision = currentItem.compareTo(item);
            // --- exact matched
            if (comparision == 0) {

                // --- checking item is root?
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());

                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }

                System.out.println(currentItem.getValue() + " has been removed.");
                capacity--;
                return true;
            } else if (comparision < 0) {
                // --- moving forward
                currentItem = currentItem.next();
            } else {
                // --- not found in the list
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        ListItem currentItem = root;

        if (root == null) {
            System.out.println("traverse() :: List is empty.");
            return;
        }

        while (currentItem != null) {
            System.out.println(currentItem.getValue());
            currentItem = currentItem.next();
        }
    }
}
