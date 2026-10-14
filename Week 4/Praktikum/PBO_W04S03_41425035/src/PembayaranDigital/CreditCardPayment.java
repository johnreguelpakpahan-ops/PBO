/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PembayaranDigital;

/**
 *
 * @author User
 */
public class CreditCardPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        double total = amount + ADMIN_FEE;

        System.out.println("Pembayaran menggunakan Credit Card");
        System.out.println("Jumlah      : Rp" + amount);
        System.out.println("Biaya Admin : Rp" + ADMIN_FEE);
        System.out.println("Total       : Rp" + total);
    }
}
