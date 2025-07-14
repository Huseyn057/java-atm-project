package org.example;

import java.util.Scanner;

public class Database {
    private static final Scanner sc = new Scanner(System.in);

    static BankAccount[] accountList;

    private Database() {
    }

    public static void loadAccounts(BankAccount[] accounts) {
        accountList = accounts;
    }

    public static BankAccount checkUser(String accountNumber) {
        for (BankAccount account : accountList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}
