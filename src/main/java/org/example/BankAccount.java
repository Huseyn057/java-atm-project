package org.example;

import java.util.Scanner;

public class BankAccount {
    private static final Scanner sc = new Scanner(System.in);
    private final String accountNumber;
    private final String ownerName;
    private double balance;
    private int pinCode;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.pinCode = 0;
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

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode() {
        while (true) {
            System.out.println("Please enter a new 4-digit PIN code:");
            int pinCode = sc.nextInt();
            if (1000 < pinCode && pinCode < 9999) {
                this.pinCode = pinCode;
                System.out.println("PIN code set successfully.");
                break;
            } else {
                System.out.println("Invalid PIN code. Please try again.");
            }
        }
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
        } else if (amount > this.balance) return 0;
        else return -1;
    }
}
