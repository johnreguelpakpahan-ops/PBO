/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w02s03_41425035.BagianB;

//Nama:john Reguel Pakpahan
//Nim:41425035
//Prodi:DIV TRPL
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Konverter Waktu ===");
        System.out.println("1. Detik ke HH:MM:SS");
        System.out.println("2. HH:MM:SS ke detik");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan jumlah detik: ");
            int totalDetik = input.nextInt();

            int jam = totalDetik / 3600;
            int menit = (totalDetik % 3600) / 60;
            int detik = totalDetik % 60;

            System.out.printf("Hasil: %02d:%02d:%02d%n", jam, menit, detik);

        } else if (pilihan == 2) {
            input.nextLine();

            System.out.print("Masukkan waktu (HH:MM:SS): ");
            String waktu = input.nextLine();

            String[] bagian = waktu.split(":");

            if (bagian.length == 3) {
                int jam = Integer.parseInt(bagian[0]);
                int menit = Integer.parseInt(bagian[1]);
                int detik = Integer.parseInt(bagian[2]);

                int totalDetik = (jam * 3600) + (menit * 60) + detik;

                System.out.println("Hasil: " + totalDetik + " detik");
            } else {
                System.out.println("Format waktu tidak valid!");
            }

        } else {
            System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}
