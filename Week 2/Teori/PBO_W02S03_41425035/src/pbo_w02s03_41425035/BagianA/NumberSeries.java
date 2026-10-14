package pbo_w02s03_41425035.BagianA;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Nama:john Reguel Pakpahan
//Nim:41425035
//Prodi:DIV TRPL
import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah deret Fibonacci: ");
        int n = scanner.nextInt();

        // Generate Fibonacci series
        System.out.println("Deret Fibonacci:");
        int a = 0, b = 1;
        for(int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();

        // Check prime number
        System.out.print("Masukkan bilangan untuk dicek prima: ");
        int num = scanner.nextInt();
        boolean isPrime = true;

        if(num <= 1) {
            isPrime = false;
        } else {
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(num + (isPrime ? " adalah bilangan prima" : " bukan bilangan prima"));
    }
///hanya menyimpan dua nilai sebelumnya , dan awalnya mengunakna tipe nilai int mengjadi bigint
}