package com.learning.days061to080.days073;

public class SearchTree implements NodeList {

    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {

        if (this.root == null) {
            // --- tree is empty
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;

        while (currentItem != null) {
            int comparision = currentItem.compareTo(newItem);

            if (comparision < 0) {
                // --- we should move to right side of the tree
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparision > 0) {
                // --- we should move to left side of the tree
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                // --- exact match found.
                System.out.println(newItem.getValue() + " already present in the tree.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {

        if (item != null) {
            System.out.println("Deleting " + item.getValue());
        }

        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparision = currentItem.compareTo(item);

            if (comparision < 0) {
                // --- we should move to right side of tree
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparision > 0) {
                // --- we should move to left side of the tree
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                // --- we found the item;
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {

        if (root != null) {
            // --- traversing to left side of the tree
            traverse(root.previous());
            // --- visit the node and print the value
            System.out.println(root.getValue());
            // --- no traverse to right side of the tree
            traverse(root.next());
        }
    }

    private void performRemoval(ListItem currentItem, ListItem parentItem) {

        if (currentItem.next() == null) {
            // --- there is no right child

            if (parentItem.next() == currentItem) {
                // --- currentItem is right child of its parent
                parentItem.setNext(currentItem.previous());
            } else if (parentItem.previous() == currentItem) {
                // --- currentItem is left child of its parent
                parentItem.setPrevious(currentItem.previous());
            } else {
                // --- currentItem must be the root of the tree
                this.root = currentItem.previous();
            }

        } else if (currentItem.previous() == null) {
            // --- there is no left child

            if (parentItem.next() == currentItem) {
                // --- currentItem is right child of its parent
                parentItem.setNext(currentItem.next());
            } else if (parentItem.previous() == currentItem) {
                // --- currentItem is left child of its parent
                parentItem.setPrevious(currentItem.next());
            } else {
                // --- currentItem must be the root of the tree
                this.root = currentItem.next();
            }

        } else {
            // --- neither left nor right child are null,
            // --- so it is hardest to delete

            /*
            * Algorithm to delete is, just find smallest value in right-most
            * subtree and,
            * replace the smallest node with the currentItem
            * */

            ListItem current = currentItem.next();
            ListItem leftMostParent = currentItem;

            while (current.previous() != null) {
                leftMostParent = current;
                current = current.previous();
            }

            // --- replacing the smallest value from the node which would be deleted soon.
            currentItem.setValue(current.getValue());

            // --- now we will delete the smallest node.

            if (leftMostParent == currentItem) {
                // --- there was no leftmost node so 'current' points to the smallest
                currentItem.setNext(current.next());
            } else {
                // --- set the smallest node's parent to point to the smallest node's right child
                leftMostParent.setPrevious(current.next());
            }
        }
    }
}
