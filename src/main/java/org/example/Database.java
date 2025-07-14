package org.example;

public class Database {
    static BankAccount[] accountList;

    private Database(){}

    public static void loadAccounts(BankAccount[] accounts) {
        accountList = accounts;
    }

    public static BankAccount checkUser(String accountNumber) {
        for (BankAccount bankAccount : accountList) {
            if (bankAccount.getAccountNumber().equals(accountNumber))
                return bankAccount;
        }
        return null;
    }
}
