package PBO_W02S02_41425035.TugasD;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//nama:John Reguel Pakpahan
//Nim:41425035
//Prodi:DIV Teknologi Rekayasa Perangkat Lunak
import java.util.Scanner;

public class PalindromeVokal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

      
        String kataKecil = kata.toLowerCase();

        
        String balik = "";

        for (int i = kataKecil.length() - 1; i >= 0; i--) {
            balik += kataKecil.charAt(i);
        }

     
        if (kataKecil.equals(balik)) {
            System.out.println("Kata tersebut adalah palindrome.");
        } else {
            System.out.println("Kata tersebut bukan palindrome.");
        }

       
        int jumlahVokal = 0;

        for (int i = 0; i < kataKecil.length(); i++) {
            char huruf = kataKecil.charAt(i);

            if (huruf == 'a' || huruf == 'i' || huruf == 'u'
                    || huruf == 'e' || huruf == 'o') {
                jumlahVokal++;
            }
        }

        System.out.println("Jumlah huruf vokal: " + jumlahVokal);

        input.close();
    }
}