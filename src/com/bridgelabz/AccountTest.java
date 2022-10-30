package com.bridgelabz;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(10000);
        System.out.println("account Balance:- " + " Rs " + account.getBalance());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdraw amount for account:- ");
        double amount = sc.nextDouble();
        System.out.println("Amount to Debit form Account:- " + " Rs " + amount);
        account.debit(amount);
        System.out.println("Remaining Balance of Account:- " + " Rs " + account.getBalance());
        System.out.println("--------Thank you--------");
    }
}
