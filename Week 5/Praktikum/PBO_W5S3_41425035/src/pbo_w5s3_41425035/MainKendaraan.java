/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pbo_w5s3_41425035;

/**
 *
 * @author User
 */
// 1. Interface Kendaraan (Kontrak)
interface Kendaraan {
    void bergerak();
}

// 2. Class Mobil yang mengimplementasikan interface
class Mobil implements Kendaraan {
    @Override
   public void bergerak() {
        System.out.println("Mobil bergerak menggunakan roda 4.");
    }
}

// 3. Class Motor yang mengimplementasikan interface
class Motor implements Kendaraan {
    @Override
    public void bergerak() {
        System.out.println("Motor bergerak menggunakan roda 2.");
    }
}

// 4. Main Class
public class MainKendaraan {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan motor = new Motor();

        mobil.bergerak();
        motor.bergerak();
    }
}