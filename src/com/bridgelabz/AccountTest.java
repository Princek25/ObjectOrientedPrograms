package com.bridgelabz;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(10000);
        System.out.println("account1 Balance:- " + " Rs " + account1.getBalance());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdraw amount for account1:- ");
        double a1 = sc.nextDouble();
        System.out.println("Amount to Debit form Account1:- " + " Rs " + a1);
        account1.debit(a1);
        System.out.println("Remaining Balance of Account1:- " + " Rs " + account1.getBalance());
        System.out.println("--------Thank you--------");
    }
}
