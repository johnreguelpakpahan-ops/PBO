/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PembayaranDigital;

/**
 *
 * @author User
 */
public class MainPayment {
    public static void main(String[] args) {

        PaymentMethod payment;

        payment = new EWalletPayment();
        payment.pay(100000);

        System.out.println();

        payment = new CreditCardPayment();
        payment.pay(200000);
    }
}