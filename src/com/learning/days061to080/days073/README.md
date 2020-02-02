Custom LinkedList Challenge
--

#### Problem statement:

For this challenge, **create** an **abstract class** to define items that can be stored in a list.

The **class** should contain **2 references** to items which will represent the **next** and **previous** items (in the case of a linked list). i.e., if you call your **abstract class ListItem**, then it would have **2 member variables** of type **ListItem** that will hold references to the **next**/**right** and **previous**/**left** **ListItems**.

The **abstract class** will also need to hold a **value**.

The **class** will also need **methods** to **move** to the **next** item and **back** to the **previous** item, and methods to **set** the **next** and **previous** items.

You should also specify a `compareTo()` **method** that takes **a parameter** of the same type as the class and **returns 0** if the **values are equal**, **greater than zero** if the value sorts **greater than the parameter** and **less than zero** if it sorts **less than the parameter**.

Create a **concrete class** from your **abstract list** item class and use this in a **LinkedList** class to implement a linked list that will **add items** in order (so that they are **sorted alphabetically**). **Duplicate values are not added**.

The **rules** for **adding** an item to the linked list are:
- If the **head** of the list is `null`, make the **head** refer to the **item** to be added.
- If the **item** to be added is **less than the current** item in the list, add the item **before** the current item (i.e., make the previous item's **next** refer to the new item, and the new item's **next** refer to the current item).
- If the item to be added is **greater than the current** item, move onto the **next** item and compare again (if there is **no next** item then that is where the new item belongs).

Care will be needed when inserting **before the first**item in the list (as it will not have a **previous** item).

You will also need a **method** to **remove** an item from the list.

Optional: create a **class** to use your **concrete class** to implement a **Binary Search Tree**:
- When **adding** items to a **Binary Search Tree**, if the item to be added is **less than the current item** then move to the **left**, if it is **greater than the current item** then move to the **right**.

The new item is **added** when an attempt to move in the required direction would involve following a `null` reference. **Once again, duplicates are not allowed**.

Create a string data array to avoid typing loads of addItem instructions:
```
String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

String[] data = stringData.split(" ");
for (String s : data) {
    // create new item with value set to the string s
}
```


#### Solution:
**ListItem.java** (abstract class)
```java
package com.learning.days061to080.days073;

public abstract class ListItem {

    protected ListItem rightLink;
    protected ListItem leftLink;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);

    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
```

**Node.java**
```java
package com.learning.days061to080.days073;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;

        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }

        return -1;
    }
}
```

**NodeList.java** (Interface)
```java
package com.learning.days061to080.days073;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
```

**MyLinkedList.java**
```java
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
```

**SearchTree.java**
```java
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
```

**MyLinkedListDriver.java**
```java
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
```

#### Explanation:

- Code is self explanatory.
- Search tree

```
                        Darwin
                /                        \
        Brisbane                          Perth
        /       \                       /       \
Adelaide        Canberra        Melbourne       Sydney
```

- After deleting **Brisbane** from **SearchTree**
```
                        Darwin
                /                        \
        Canberra                          Perth
        /                               /       \
Adelaide                       Melbourne       Sydney
```

#### Output
```
Traversing list :
traverse() :: List is empty.

Size = 0
===================

Traversing list :
0
1
2
3
4
5
6
7
8
9

Size = 10

===================
3 has been removed.

Traversing list :
0
1
2
4
5
6
7
8
9

Size = 9

===================
5 has been removed.
0 has been removed.
4 has been removed.
2 has been removed.

Traversing list :
1
6
7
8
9

Size = 5

===================
9 has been removed.
1 has been removed.
7 has been removed.
6 has been removed.

Traversing list :
8

Size = 1
===================
8 has been removed.

Size = 0

Traversing list :
traverse() :: List is empty.
===================
remove() :: List is empty.

Traversing list :
traverse() :: List is empty.
===================

====== Search Tree ======

Canberra already present in the tree.
Adelaide
Brisbane
Canberra
Darwin
Melbourne
Perth
Sydney

Root is :: Darwin
Deleting Brisbane
Adelaide
Canberra
Darwin
Melbourne
Perth
Sydney
```