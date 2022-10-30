package com.bridgelabz;

public class Account {
    private double balance;

    Account(double initialBalance) {
        if (initialBalance > 0.0)
            balance = initialBalance;
    }

    void debit(double debitAmount) {
        if (debitAmount > balance) {
            debitAmount = 0.0;
            System.out.println("Debit amount exceeded account balance.");
        }
        balance = balance - debitAmount;
    }

    public double getBalance() {
        return balance;
    }
}
