/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_W02S02_41425035.TugasB;

//nama:John Reguel Pakpahan
//Nim:41425035
//Prodi:DIV Teknologi Rekayasa Perangkat Lunak
import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Konversi Suhu ===");
        System.out.println("1. Celsius ke Fahrenheit");
        System.out.println("2. Fahrenheit ke Celsius");

        System.out.print("Pilih menu: ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan suhu dalam Celsius: ");
            double celsius = input.nextDouble();

            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.printf("%.1f C = %.1f F%n", celsius, fahrenheit);

        } else if (pilihan == 2) {
            System.out.print("Masukkan suhu dalam Fahrenheit: ");
            double fahrenheit = input.nextDouble();

            double celsius = (fahrenheit - 32) * 5 / 9;

            System.out.printf("%.1f F = %.2f C%n", fahrenheit, celsius);

        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}
