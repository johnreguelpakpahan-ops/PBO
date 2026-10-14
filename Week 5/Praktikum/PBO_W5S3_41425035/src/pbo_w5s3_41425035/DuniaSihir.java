/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w5s3_41425035;

/**
 *
 * @author User
 */
import java.util.*;
import java.util.ArrayList;
import java.util.List;

// Abstract class Mantra
abstract class Mantra {

    private String nama;

    // Constructor
    public Mantra(String nama) {
        this.nama = nama;
    }

    // Mengembalikan nama mantra
    public String getNama() {
        return nama;
    }

    // Abstract method untuk efek mantra
    public abstract void efek();
}

// Class Expelliarmus
class Expelliarmus extends Mantra {

    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Melucuti senjata lawan!");
    }
}

// Class ExpectoPatronum
class ExpectoPatronum extends Mantra {

    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Memanggil Patronus!");
    }
}

// Class Lumos
class Lumos extends Mantra {

    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Menerangi ujung tongkat!");
    }
}

// Class Penyihir
class Penyihir {

    private String nama;

    // List untuk menyimpan mantra yang dipelajari
    private List<Mantra> mantraList;

    // Constructor
    public Penyihir(String nama) {
        this.nama = nama;
        this.mantraList = new ArrayList<>();
    }

    // Menambahkan mantra ke daftar mantra
    public void belajarMantra(Mantra mantra) {
        mantraList.add(mantra);

        System.out.println(
            nama + " belajar mantra: " + mantra.getNama()
        );
    }

    // Mengucapkan satu mantra berdasarkan nama
    public void ucapkanMantra(String namaMantra) {

        for (Mantra mantra : mantraList) {

            if (mantra.getNama().equals(namaMantra)) {

                System.out.println(
                    nama + " mengucapkan: " + mantra.getNama()
                );

                // Polymorphism
                mantra.efek();

                return;
            }
        }

        System.out.println(
            nama + " belum belajar mantra " + namaMantra
        );
    }

    // Mengucapkan semua mantra yang sudah dipelajari
    public void ucapkanSemuaMantra() {

        System.out.println(
            "\n" + nama + " mengucapkan semua mantra:"
        );

        for (Mantra mantra : mantraList) {

            System.out.println(
                nama + " mengucapkan: " + mantra.getNama()
            );

            // Memanggil efek sesuai objek mantra
            mantra.efek();
        }
    }
}

// Main class
public class DuniaSihir {

    public static void main(String[] args) {

        Penyihir harry = new Penyihir("Harry Potter");

        Mantra expelliarmus = new Expelliarmus();
        Mantra expectoPatronum = new ExpectoPatronum();

        // Harry mempelajari dua mantra
        harry.belajarMantra(expelliarmus);
        harry.belajarMantra(expectoPatronum);

        // Mengucapkan mantra tertentu
        harry.ucapkanMantra("Expelliarmus");
        harry.ucapkanMantra("Expecto Patronum");

        // Mencoba mantra yang belum dipelajari
        harry.ucapkanMantra("Lumos");

        // Menambahkan mantra Lumos
        Mantra lumos = new Lumos();

        harry.belajarMantra(lumos);

        // Mengucapkan Lumos
        harry.ucapkanMantra("Lumos");

        // Mengucapkan semua mantra yang sudah dipelajari
        harry.ucapkanSemuaMantra();
    }
}
/*
1. Modifikasi program agar seorang penyihir dapat
   mengucapkan semua mantra yang telah dipelajari
   dalam satu perintah, misalnya:
   ucapkanSemuaMantra().

2. Bagaimana polymorphism dan abstract class bekerja
   bersama dalam program ini?

3. Jika ditambahkan mantra baru tanpa mengubah class
   Penyihir, apakah hal tersebut mudah dilakukan?
   Jelaskan alasannya.


JAWABAN


1. Program dimodifikasi dengan menambahkan method
   ucapkanSemuaMantra() pada class Penyihir. Method ini
   melakukan perulangan terhadap semua mantra yang ada
   di daftarMantra, kemudian memanggil method efek()
   masing-masing mantra.

2. Abstract class Mantra menjadi class dasar yang
   memiliki method abstrak efek(). Setiap class mantra
   seperti Expelliarmus, ExpectoPatronum, dan Lumos
   mengimplementasikan efek() dengan cara yang berbeda.
   Polymorphism memungkinkan objek-objek tersebut
   disimpan dalam List<Mantra> dan method efek() yang
   dijalankan akan mengikuti class objek sebenarnya.

3. Ya, penambahan mantra baru cukup mudah dilakukan.
   Kita hanya perlu membuat class baru yang extends
   Mantra dan mengimplementasikan method efek().
   Setelah itu objek mantra dapat ditambahkan menggunakan
   belajarMantra(). Class Penyihir tidak perlu diubah.



*/
