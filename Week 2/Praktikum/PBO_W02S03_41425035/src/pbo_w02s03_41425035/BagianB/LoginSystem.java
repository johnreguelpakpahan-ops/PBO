/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w02s03_41425035.BagianB;

//Nama:john Reguel Pakpahan
//Nim:41425035
//Prodi:DIV TRPL
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String usernameBenar = "admin";
        String passwordBenar = "password123";

        System.out.println("=== Sistem Login ===");

        boolean berhasil = false;

        for (int percobaan = 1; percobaan <= 3; percobaan++) {
            System.out.println("\nPercobaan " + percobaan + ":");

            System.out.print("Username: ");
            String username = input.nextLine();

            System.out.print("Password: ");
            String password = input.nextLine();

            if (username.length() < 5 || username.length() > 10) {
                System.out.println("Login gagal! Username harus antara 5-10 karakter.");
                continue;
            }

            boolean mengandungAngka = false;

            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    mengandungAngka = true;
                    break;
                }
            }

            if (password.length() < 8 || !mengandungAngka) {
                System.out.println("Login gagal! Password harus minimal 8 karakter dan mengandung angka.");
                continue;
            }

            if (username.equals(usernameBenar) && password.equals(passwordBenar)) {
                System.out.println("Login berhasil!");
                berhasil = true;
                break;
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }

            if (percobaan == 3) {
                System.out.println("Akun terkunci! Terlalu banyak percobaan gagal.");
            }
        }

        if (!berhasil) {
            System.out.println("Silakan coba lagi nanti.");
        }

        input.close();
    }
}