package PBO_W02S02_41425035.TugasB;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//nama:John Reguel Pakpahan
//Nim:41425035
//Prodi:DIV Teknologi Rekayasa Perangkat Lunak
import java.util.Scanner;

public class LoginSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String username = input.nextLine();

        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        
        boolean usernameValid = username.equals("admin");

       
        boolean panjangValid = password.length() >= 6;

       
        boolean adaAngka = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                adaAngka = true;
                break;
            }
        }

       
        if (usernameValid && panjangValid && adaAngka) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal! Password tidak valid.");
        }

        input.close();
    }
}