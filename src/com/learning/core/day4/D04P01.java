package com.learning.core.day04;

import java.util.Scanner;

public class D04P01 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number:");
        int accNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter customer name:");
        String custName = scanner.nextLine();
        System.out.println("Enter account type (Saving/Current):");
        String accType = scanner.nextLine();
        System.out.println("Enter initial balance:");
        float initialBalance = scanner.nextFloat();

        try {
            BankAccount account = new BankAccount(accNo, custName, accType, initialBalance);
            System.out.println("Account created successfully!");
            System.out.println("Current balance: " + account.getBalance());
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        } catch (NegativeAmount e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
