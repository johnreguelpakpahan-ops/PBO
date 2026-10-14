/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RekeningBank;

/**
 *
 * @author User
 */
public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Setoran berhasil.");
        } else {
            System.out.println("Jumlah setoran harus positif.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Jumlah penarikan harus positif.");
        } else if (amount > balance) {
            System.out.println("Saldo tidak mencukupi.");
        } else {
            balance -= amount;
            System.out.println("Penarikan berhasil.");
        }
    }
}