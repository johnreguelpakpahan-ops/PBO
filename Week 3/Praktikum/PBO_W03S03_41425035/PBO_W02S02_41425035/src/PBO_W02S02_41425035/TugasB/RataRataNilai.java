/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_W02S02_41425035.TugasB;
//nama:John Reguel Pakpahan
//Nim:41425035
//Prodi:DIV Teknologi Rekayasa Perangkat Lunak
import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai 1: ");
        double nilai1 = input.nextDouble();

        System.out.print("Masukkan nilai 2: ");
        double nilai2 = input.nextDouble();

        System.out.print("Masukkan nilai 3: ");
        double nilai3 = input.nextDouble();

        double rataRata = (nilai1 + nilai2 + nilai3) / 3;

        System.out.printf("Rata-rata: %.2f%n", rataRata);
    }
}