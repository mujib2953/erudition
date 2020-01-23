Person Challenge
--

#### Problem statement:

Write a class with the name **Person**. The class needs **three fields** (instance variable) with the names **firstName**, **lastName** of type **String** and **age** of type **int**.

Write the following methods (instance method):
- Method named **getFirstName** without any parameters, it needs to return the value of **firstName** field.
- Method named **getLastName** without any parameters, it needs to return the value of **lastName** field.
- Method named **getAge** without any parameters, it needs to return the value of **age** field.
- Method named **setFirstName** with **one parameter** of type **String**, It needs to set the value of the **firstName** field.
- Method named **setLastName** with **one parameter** of type **String**, It needs to set the value of the **lastName** field.
- Method named **setAge** with **one parameter** of type **int**, It needs to set the value of the **age** field.
- Method named **isTeen** without any parameters, it needs to return **true** if the value of the **age** field is **greater that 12 and less than 20**, otherwise **return false**.
- Method named **getFullName** without any parameters, it needs to return the full name of the person.
    - In case both **firsName** and **lastName** fields are empty, String **return an empty String**.
    - In case **lastName** is empty String, **return firstName**.
    - In case **firstName** is empty String, **return lastName**.
    
To check if **string is empty**, use the method **isEmpty** from the **String class**.

```
Example:
Person person = new Person();

person.setFirstName("");
person.setLastName("");
person.setAge(10);

System.out.println("fullName = " + person.getFullName());
System.out.println("teen = " + person.isTeen());

person.setFirstName("John");
person.setAge(18);

System.out.println("fullName = " + person.getFullName());
System.out.println("teen = " + person.isTeen());

person.setLastName("Smith");

System.out.println("fullName = " + person.getFullName());

Output:
fullName = 
teen = false
fullName = John
teen = true
fullName = John Smith
```

#### Solution:
**Person.java**
```java
package com.learning.days041to060.days053;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "";
        } else if (this.firstName.isEmpty()) {
            return this.lastName;
        } else if (this.lastName.isEmpty()) {
            return this.firstName;
        }

        return this.firstName + " " + this.lastName;
    }

    public boolean isTeen() {
        return (this.age > 12 && this.age < 20);
    }
}
```
**PersonDriver.java**
```java
package com.learning.days041to060.days053;

public class PersonDriver {
    public static void main(String[] args) {
        Person person = new Person();

        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);

        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());

        person.setFirstName("John");
        person.setAge(18);

        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());

        person.setLastName("Smith");

        System.out.println("fullName = " + person.getFullName());
    }
}
```


#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
fullName = 
teen = false
fullName = John
teen = true
fullName = John Smith
```