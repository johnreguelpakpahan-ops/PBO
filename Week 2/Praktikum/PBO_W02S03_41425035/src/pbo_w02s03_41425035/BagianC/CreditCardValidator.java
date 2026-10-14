/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w02s03_41425035.BagianC;

//Nama:john Reguel Pakpahan
//Nim:41425035
//Prodi:DIV TRPL
import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nomor kartu: ");
        String kartu = input.nextLine();

        String nomor = kartu.replace("-", "");

        boolean jumlahDigit = nomor.length() == 16;
        boolean hanyaDigit = true;

        for (int i = 0; i < nomor.length(); i++) {
            if (!Character.isDigit(nomor.charAt(i))) {
                hanyaDigit = false;
                break;
            }
        }

        boolean awalan = nomor.startsWith("4")
                || nomor.startsWith("5")
                || nomor.startsWith("6");

        boolean formatHubung = true;

        if (kartu.contains("-")) {
            String[] bagian = kartu.split("-");

            if (bagian.length != 4) {
                formatHubung = false;
            } else {
                for (String bagianNomor : bagian) {
                    if (bagianNomor.length() != 4) {
                        formatHubung = false;
                        break;
                    }
                }
            }
        }

        if (jumlahDigit && hanyaDigit && awalan && formatHubung) {
            System.out.println("Nomor kartu valid.");
        } else {
            System.out.println("Nomor kartu tidak valid!");

            if (!jumlahDigit) {
                System.out.println("Harus terdiri dari 16 digit.");
            } else if (!awalan) {
                System.out.println("Harus dimulai dengan 4, 5, atau 6.");
            } else if (!hanyaDigit) {
                System.out.println("Nomor kartu hanya boleh mengandung digit dan tanda hubung.");
            } else if (!formatHubung) {
                System.out.println("Tanda hubung harus digunakan setiap 4 digit.");
            }
        }

        input.close();
    }
}
