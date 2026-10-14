package PBO_W02S02_41425035.TugasC;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//nama:John Reguel Pakpahan
//Nim:41425035
//Prodi:DIV Teknologi Rekayasa Perangkat Lunak
import java.util.Scanner;

public class DataDiri {
    public static void main(String[] args) {

 
        Scanner input = new Scanner(System.in);

     
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

      
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

    
        System.out.print("Masukkan tinggi badan: ");
        double tinggi = input.nextDouble();

       
        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        boolean status = input.nextBoolean();

        
        int tinggiCasting = (int) tinggi;

        
        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi badan: " + tinggi + " cm");
        System.out.println("Tinggi setelah casting: " + tinggiCasting + " cm");
        System.out.println("Mahasiswa aktif: " + status);

        input.close();
    }
}