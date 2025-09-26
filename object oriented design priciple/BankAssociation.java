
import java.util.*;

class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void viewBalance() {
        System.out.println(name + "'s Balance: " + balance);
    }
}

class Bank {
    String bankName;
    ArrayList<Customer> customers;

    Bank(String bankName) {
        this.bankName = bankName;
        customers = new ArrayList<>();
    }

    public void openAccount(Customer c) {
        customers.add(c);
        System.out.println(c.name + " opened account in " + bankName);
    }
}

public class BankAssociation {
    public static void main(String args[]) {
        Bank b1 = new Bank("State Bank");
        Customer c1 = new Customer("Alice", 5000);
        Customer c2 = new Customer("Bob", 3000);

        b1.openAccount(c1);
        b1.openAccount(c2);

        c1.viewBalance();
        c2.viewBalance();
    }
}
