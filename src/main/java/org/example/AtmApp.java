package org.example;

public class AtmApp {
    public static void main(String[] args) {

        BankAccount user1 = new BankAccount("TR1234Z", "Elvin Mammadov", 2450.75);
        BankAccount user2 = new BankAccount("US9988Q", "Nigar Huseynli", 389.90);
        BankAccount user3 = new BankAccount("AZ4321L", "Kamran Aliyev", 15789.00);

        BankAccount[] arr = {user1, user2, user3};
        Database.loadAccounts(arr);
        ATM.powerOn();
    }
}