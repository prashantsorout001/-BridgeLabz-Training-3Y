// Banking System - student style
import java.util.*;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String acc, String name, double bal) {
        this.accountNumber = acc; this.holderName = name; this.balance = bal;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    protected double getBalance() { return balance; }
    protected void setBalance(double b) { this.balance = b; }

    public void deposit(double amt) { balance += amt; }
    public boolean withdraw(double amt) {
        if(amt <= balance) { balance -= amt; return true; }
        return false;
    }

    public abstract double calculateInterest();
    public void display() {
        System.out.println("Acc:"+accountNumber+" Holder:"+holderName+" Bal:"+balance);
    }
}

interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04; // 4% yearly

    public SavingsAccount(String acc, String name, double bal) { super(acc,name,bal); }

    @Override public double calculateInterest() { return getBalance() * interestRate; }

    @Override public boolean applyForLoan(double amount) {
        // simple rule: balance must be >= 10000
        return getBalance() >= 10000;
    }

    @Override public double calculateLoanEligibility() { return getBalance() * 0.5; }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate = 0.01;
    public CurrentAccount(String acc, String name, double bal) { super(acc,name,bal); }

    @Override public double calculateInterest() { return getBalance() * interestRate; }

    @Override public boolean applyForLoan(double amount) {
        // simple rule: current account allowed for business - allow smaller loans
        return getBalance() >= 5000;
    }

    @Override public double calculateLoanEligibility() { return getBalance() * 0.3; }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount b1 = new SavingsAccount("SB1001", "Aditya", 20000);
        BankAccount b2 = new CurrentAccount("CA2001", "Nitin", 8000);

        BankAccount[] arr = {b1, b2};
        for(BankAccount b: arr) {
            b.display();
            System.out.println("Interest:" + b.calculateInterest());
            if(b instanceof Loanable) {
                Loanable loan = (Loanable)b;
                System.out.println("Loan Eligible:" + loan.calculateLoanEligibility());
                System.out.println("Apply for 5000:" + loan.applyForLoan(5000));
            }
            System.out.println("----");
        }
    }
}
