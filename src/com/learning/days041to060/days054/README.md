Bank Account Problem
--

#### Problem statement:

- Create a new class for Bank Account
- Create a fields for account number, balance, customer name, email, and phone number.
- Create getter and setter for each of the fields.
- Create 2 additional methods:
    - To allow the customer to deposits funds (this should increment the balance field).
    - To allow customer to withdraw funds. This should deduct from the balance field, but not allow the withdraw to complete if their are insufficient funds.

Other Challenge:

- Create a new class VipCustomer
- It should have 3 fields name, credit limit, and email address
- Create 3 constructors for this class
- 1st empty constructor should call the other constructor with defaults value.
- 2nd constructor should pass on 2 values it receives and add the 3rd default value.
- 3rd constructor should receive all the 3 values and this constructor should set those value to corresponding 3 fields values. 
```
Example:
Account bobsAccount = new Account();

bobsAccount.setAccountNumber(12345);
bobsAccount.setBalance(0.0);
bobsAccount.setCustomerName("Bob Brown");
bobsAccount.setCustomerEmailAddress("myemail@bob.com");
bobsAccount.setCustomerPhoneNumber("(98) 786-54321");

bobsAccount.withdraw(100.0);

bobsAccount.deposit(50);
bobsAccount.withdraw(100);

bobsAccount.deposit(51);
bobsAccount.withdraw(100);

Account jerryAccount = new Account(123456, 0.0, "Jerry Tom", "mytom@jerry.com", "(98) 786-54321");
System.out.println(jerryAccount.getAccountNumber());
System.out.println(jerryAccount.getBalance());

Account defaultAccount = new Account();
System.out.println(defaultAccount.getAccountNumber());
System.out.println(defaultAccount.getCustomerName());
System.out.println(defaultAccount.getCustomerEmailAddress());

VipCustomer customer1 = new VipCustomer("Travis", 50, "travis@mail.com");
System.out.println(customer1.getName());
System.out.println(customer1.getEmail());

VipCustomer customer2 = new VipCustomer("Andrew", 100);
System.out.println(customer2.getName());
System.out.println(customer2.getEmail());

VipCustomer customer3 = new VipCustomer();
System.out.println(customer3.getName());
System.out.println(customer3.getEmail());

Output:
Account's parameterized constructor called.
Empty constructor is invoked.
Only 0.0 available. Withdrawal NOT processed.
Deposit of 50.0 made. New balance = 50.0
Only 50.0 available. Withdrawal NOT processed.
Deposit of 51.0 made. New balance = 101.0
Withdrawal of 100.0 processed. Remaining balance = 1.0

Account's parameterized constructor called.
123456.0
0.0

Account's parameterized constructor called.
Empty constructor is invoked.
1234567.0
default name
default@email.com

Travis
travis@mail.com

Andrew
unknown@email.com

Default Name
default@email.com
```

#### Solution:
**Account.java**
```java
package com.learning.days041to060.days054;

public class Account {
    private double accountNumber;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account() {
        this(1234567, 0.0, "default name", "default@email.com", "9876543210");
        System.out.println("Empty constructor is invoked.");
    }

    public Account(double accountNumber, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        System.out.println("Account's parameterized constructor called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance = " + this.balance);
    }

    public void withdraw(double withdrawAmount) {
        if (this.balance - withdrawAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal NOT processed.");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " processed. Remaining balance = " + this.balance);
        }
    }
}
```

**VipCustomer.java**
```java
package com.learning.days041to060.days054;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Default Name", 0.0, "default@email.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
```

**AccountDriver.java**
```java
package com.learning.days041to060.days054;

public class AccountDriver {
    public static void main(String[] args) {

        System.out.println("======= Bobs Account =======");
        Account bobsAccount = new Account();

        bobsAccount.setAccountNumber(12345);
        bobsAccount.setBalance(0.0);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmailAddress("myemail@bob.com");
        bobsAccount.setCustomerPhoneNumber("(98) 786-54321");

        bobsAccount.withdraw(100.0);

        bobsAccount.deposit(50);
        bobsAccount.withdraw(100);

        bobsAccount.deposit(51);
        bobsAccount.withdraw(100);

        System.out.println("\n======= Jerry Account =======");

        Account jerryAccount = new Account(123456, 0.0, "Jerry Tom", "mytom@jerry.com", "(98) 786-54321");
        System.out.println(jerryAccount.getAccountNumber());
        System.out.println(jerryAccount.getBalance());

        System.out.println("\n======= Default Account =======");

        Account defaultAccount = new Account();
        System.out.println(defaultAccount.getAccountNumber());
        System.out.println(defaultAccount.getCustomerName());
        System.out.println(defaultAccount.getCustomerEmailAddress());

        System.out.println("\n======= VIP Customer : All values constructor =======");
        VipCustomer customer1 = new VipCustomer("Travis", 50, "travis@mail.com");
        System.out.println(customer1.getName());
        System.out.println(customer1.getEmail());

        System.out.println("\n======= VIP Customer :  With 2 values constructor =======");
        VipCustomer customer2 = new VipCustomer("Andrew", 100);
        System.out.println(customer2.getName());
        System.out.println(customer2.getEmail());

        System.out.println("\n======= VIP Customer : Empty constructor =======");
        VipCustomer customer3 = new VipCustomer();
        System.out.println(customer3.getName());
        System.out.println(customer3.getEmail());

    }
}
```


#### Explanation:

- Code is self explanatory.
 
#### Output
 ```
======= Bobs Account =======
Account's parameterized constructor called.
Empty constructor is invoked.
Only 0.0 available. Withdrawal NOT processed.
Deposit of 50.0 made. New balance = 50.0
Only 50.0 available. Withdrawal NOT processed.
Deposit of 51.0 made. New balance = 101.0
Withdrawal of 100.0 processed. Remaining balance = 1.0

======= Jerry Account =======
Account's parameterized constructor called.
123456.0
0.0

======= Default Account =======
Account's parameterized constructor called.
Empty constructor is invoked.
1234567.0
default name
default@email.com

======= VIP Customer : All values constructor =======
Travis
travis@mail.com

======= VIP Customer :  With 2 values constructor =======
Andrew
unknown@email.com

======= VIP Customer : Empty constructor =======
Default Name
default@email.com
```