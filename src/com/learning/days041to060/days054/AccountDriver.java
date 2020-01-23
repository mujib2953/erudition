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
