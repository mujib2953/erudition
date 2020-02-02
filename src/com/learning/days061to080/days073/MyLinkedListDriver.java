package com.learning.days061to080.days073;

public class MyLinkedListDriver {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList(null);
        System.out.println("\nTraversing list :");
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("\nSize = " + myLinkedList.size());
        System.out.println("===================");

        String stringData = "5 7 3 9 8 2 1 0 4 6";
        String[] data = stringData.split(" ");

        for(String s: data) {
            myLinkedList.addItem(new Node(s));
        }

        System.out.println("\nTraversing list :");
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("\nSize = " + myLinkedList.size() + "\n");
        System.out.println("===================");

        myLinkedList.removeItem(new Node("3"));
        System.out.println("\nTraversing list :");
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("\nSize = " + myLinkedList.size() + "\n");
        System.out.println("===================");

        myLinkedList.removeItem(new Node("5"));
        myLinkedList.removeItem(new Node("0"));
        myLinkedList.removeItem(new Node("4"));
        myLinkedList.removeItem(new Node("2"));
        System.out.println("\nTraversing list :");
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("\nSize = " + myLinkedList.size() + "\n");
        System.out.println("===================");

        myLinkedList.removeItem(new Node("9"));
        myLinkedList.removeItem(new Node("1"));
        myLinkedList.removeItem(new Node("7"));
        myLinkedList.removeItem(new Node("6"));
        System.out.println("\nTraversing list :");
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("\nSize = " + myLinkedList.size());
        System.out.println("===================");

        myLinkedList.removeItem(new Node("8"));
        System.out.println("\nSize = " + myLinkedList.size() + "\n");
        System.out.println("Traversing list :");
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("===================");

        myLinkedList.removeItem(new Node("8"));
        System.out.println("\nTraversing list :");
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("===================");

        System.out.println("\n====== Search Tree ======\n");
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        // stringData = "Melbourne Brisbane Adelaide Sydney Darwin Perth Canberra";
        stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        data = stringData.split(" ");

        for (String s: data) {
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());
        System.out.println("\nRoot is :: " + tree.getRoot().getValue());

        tree.removeItem(new Node("Brisbane"));

        tree.traverse(tree.getRoot());
    }
}
