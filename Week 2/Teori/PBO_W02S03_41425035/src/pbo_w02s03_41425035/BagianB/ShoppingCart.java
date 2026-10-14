/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w02s03_41425035.BagianB;

//Nama:john Reguel Pakpahan
//Nim:41425035
//Prodi:DIV TRPL
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] daftarBelanja = new String[100];
        int jumlahItem = 0;
        int pilihan;

        do {
            System.out.println("\n=== Daftar Belanja ===");
            System.out.println("1. Tambah item");
            System.out.println("2. Hapus item");
            System.out.println("3. Tampilkan semua item");
            System.out.println("4. Cari item");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                if (jumlahItem < daftarBelanja.length) {
                    System.out.print("Masukkan item: ");
                    String item = input.nextLine();

                    daftarBelanja[jumlahItem] = item;
                    jumlahItem++;

                    System.out.println(item + " berhasil ditambahkan!");
                } else {
                    System.out.println("Daftar belanja penuh!");
                }

            } else if (pilihan == 2) {
                if (jumlahItem == 0) {
                    System.out.println("Daftar belanja kosong!");
                } else {
                    System.out.print("Hapus item pada posisi: ");
                    int posisi = input.nextInt();

                    if (posisi >= 1 && posisi <= jumlahItem) {
                        String itemDihapus = daftarBelanja[posisi - 1];

                        for (int i = posisi - 1; i < jumlahItem - 1; i++) {
                            daftarBelanja[i] = daftarBelanja[i + 1];
                        }

                        daftarBelanja[jumlahItem - 1] = null;
                        jumlahItem--;

                        System.out.println(itemDihapus + " berhasil dihapus!");
                    } else {
                        System.out.println("Posisi tidak valid!");
                    }
                }

            } else if (pilihan == 3) {
                if (jumlahItem == 0) {
                    System.out.println("Daftar belanja kosong!");
                } else {
                    System.out.println("Daftar belanja:");

                    for (int i = 0; i < jumlahItem; i++) {
                        System.out.println((i + 1) + ". " + daftarBelanja[i]);
                    }
                }

            } else if (pilihan == 4) {
                if (jumlahItem == 0) {
                    System.out.println("Daftar belanja kosong!");
                } else {
                    System.out.print("Cari item: ");
                    String cari = input.nextLine();

                    boolean ditemukan = false;

                    for (int i = 0; i < jumlahItem; i++) {
                        if (daftarBelanja[i].equalsIgnoreCase(cari)) {
                            System.out.println(cari + " ditemukan pada posisi " + (i + 1));
                            ditemukan = true;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println(cari + " tidak ditemukan.");
                    }
                }

            } else if (pilihan == 5) {
                System.out.println("Terima kasih!");

            } else {
                System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        input.close();
    }
}
