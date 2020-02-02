package com.learning.days061to080.days073;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
