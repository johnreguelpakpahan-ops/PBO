/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PembayaranDigital;

/**
 *
 * @author User
 */
public interface PaymentMethod {

    double ADMIN_FEE = 2500;

    void pay(double amount);
}
