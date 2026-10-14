/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Praktikum1;

/**
 *
 * @author User
 */
public class BankAccount {
 private String accountNumber;
 private double balance;
 
 public BankAccount(String accountNumber,double initialBalance){
     this.accountNumber = accountNumber;
     if(initialBalance >= 0){
         this.balance = initialBalance;
         
     }
     else{System.out.println("Saldo awal tidak boleh negatif! Diatur ke 0.");
     this.balance=0;
     }
     
 }
 public String getAccountNumber(){
     return accountNumber;
 }
 
 public double getBalance(){
 return balance;
 }
 public void deposit(double amount){
     if (amount > 0){
         this.balance += amount;
         System.out.println
     }
 }
         
 
 
 
    public static void main(String[] args) {
        
    }
}
