package PBO_W02S02_41425035.TugasB;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//nama:John Reguel Pakpahan
//Nim:41425035
//Prodi:DIV Teknologi Rekayasa Perangkat Lunak
import java.util.Scanner;

public class KasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama barang: ");
        String namaBarang = input.nextLine();

        System.out.print("Masukkan harga barang: ");
        double harga = input.nextDouble();

        System.out.print("Masukkan jumlah beli: ");
        int jumlah = input.nextInt();

        
        double total = harga * jumlah;
        double diskon = 0;

        
        if (total >= 100000) {
            diskon = total * 0.10;
        }

        double totalBayar = total - diskon;

        System.out.println("\n=== STRUK BELANJA ===");
        System.out.println("Nama barang: " + namaBarang);
        System.out.println("Total sebelum diskon: " + total);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total bayar: " + totalBayar);

        input.close();
    }
}
