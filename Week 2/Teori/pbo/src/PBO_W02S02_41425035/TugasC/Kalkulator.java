/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_W02S02_41425035.TugasC;

//nama:John Reguel Pakpahan
//Nim:41425035
//Prodi:DIV Teknologi Rekayasa Perangkat Lunak
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

     
        int penjumlahan = angka1 + angka2;

       
        int pengurangan = angka1 - angka2;

     
        int perkalian = angka1 * angka2;

       
        System.out.println("\n=== HASIL KALKULATOR ===");
        System.out.println("Penjumlahan: " + penjumlahan);
        System.out.println("Pengurangan: " + pengurangan);
        System.out.println("Perkalian: " + perkalian);


        if (angka2 != 0) {

      
            double pembagian = (double) angka1 / angka2;

            
            int modulus = angka1 % angka2;

            System.out.println("Pembagian: " + pembagian);
            System.out.println("Modulus: " + modulus);

        } else {

            System.out.println("Pembagian: Tidak dapat dibagi dengan 0");
            System.out.println("Modulus: Tidak dapat menggunakan 0 sebagai pembagi");
        }

     
        double pangkat = Math.pow(angka1, angka2);

        System.out.println("Pangkat: " + pangkat);

      
        input.close();
    }
}
