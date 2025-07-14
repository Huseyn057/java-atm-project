package org.example;

import java.util.Scanner;

public class ATM {
    private static final Scanner sc = new Scanner(System.in);

    private ATM() {}

    public static void powerOn() {
        System.out.println("Please enter your user number: ");
        String userNumber = sc.nextLine();
        BankAccount user = Database.checkUser(userNumber);
        if (user != null) {
            System.out.println("--- Welcome " + user.getOwnerName() + "! ---");
            startSession(user);
        } else System.out.println("Invalid user number");
    }

    public static void startSession(BankAccount account) {
        showMenu();
        while (true) {
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your balance is: " + account.getBalance());
                    break;

                case 2: {
                    System.out.println("Enter amount to deposit:");
                    double amount = sc.nextDouble();
                    if (account.deposit(amount))
                        System.out.println("Deposited to account. New balance is: " + account.getBalance());
                    else System.out.println("Error: Deposit amount cannot be negative or zero.");
                    break;
                }

                case 3: {
                    System.out.println("Enter amount to withdraw:");
                    double amount = sc.nextDouble();
                    int check = account.withdraw(amount);
                    if (check == 1) System.out.println("Withdrawn from account. New balance is: " + account.getBalance());
                    else if(check == 0)System.out.println("Error: Withdraw amount cannot be bigger than your balance.");
                    else  System.out.println("Error: Withdrawal amount cannot be negative or zero.");
                    break;
                }

                case 4: {
                    System.out.println("Thank you for using our Bank");
                    return;
                }

                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }


    public static void showMenu() {
        System.out.println(
                """
                        1. Check balance
                        2. Deposit money into account
                        3. Withdraw money from account
                        4. Logout
                        -----------------------------
                        """
        );
    }
}
