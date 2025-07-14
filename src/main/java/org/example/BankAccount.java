package org.example;

public class BankAccount {
    private final String accountNumber;
    private final String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double balance) {
        if (balance >= 0) {
            this.balance += balance;
            return true;
        } else return false;
    }

    public int withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            return 1;
        }
        else if(amount > this.balance) return 0;
        else return -1;
    }
}
