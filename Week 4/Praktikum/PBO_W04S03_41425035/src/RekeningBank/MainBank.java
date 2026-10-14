/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RekeningBank;

/**
 *
 * @author User
 */
public class MainBank {
    public static void main(String[] args) {

        BankAccount account =
                new BankAccount("123456789", 1000000);

        System.out.println("Nomor Rekening : "
                + account.getAccountNumber());

        System.out.println("Saldo Awal : Rp"
                + account.getBalance());

        account.deposit(500000);

        System.out.println("Saldo Setelah Deposit : Rp"
                + account.getBalance());

        account.withdraw(300000);

        System.out.println("Saldo Setelah Withdraw : Rp"
                + account.getBalance());

        account.withdraw(2000000);
    }
}
