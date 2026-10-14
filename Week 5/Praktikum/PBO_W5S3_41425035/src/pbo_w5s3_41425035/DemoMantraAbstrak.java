/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w5s3_41425035;
/*
Nama:John Reguel Pakpahan 
NIM:41425035


*/
import java.util.*;

abstract class MantraAbstrak {

    private String nama;

    // Constructor
    public MantraAbstrak(String nama) {
        this.nama = nama;
    }

    // Abstract method
    // Harus diimplementasikan oleh subclass
    public abstract void efek();

    // Method konkret
    public void ucapkan() {
        System.out.println("Mengucapkan mantra: " + nama);
    }
}

// Class Expelliarmus
class Expelliarmus extends MantraAbstrak {

    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Melucuti senjata lawan.");
    }
}

// Class ExpectoPatronum
class ExpectoPatronum extends MantraAbstrak {

    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println(
            "Efek: Memanggil Patronus untuk melawan Dementor."
        );
    }
}

// Tambahan class Lumos sesuai instruksi
class Lumos extends MantraAbstrak {

    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Menerangi ujung tongkat.");
    }
}

public class DemoMantraAbstrak {

    public static void main(String[] args) {

        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();
        MantraAbstrak mantra3 = new Lumos();

        mantra1.ucapkan();
        mantra1.efek();

        mantra2.ucapkan();
        mantra2.efek();

        mantra3.ucapkan();
        mantra3.efek();
    }
}
/*



1. Tambahkan mantra baru, misalnya Lumos yang mewarisi
   MantraAbstrak dan implementasikan method efek().

2. Apa yang terjadi jika kita mencoba membuat objek dari
   MantraAbstrak langsung? Coba dan jelaskan errornya.

3. Mengapa kita perlu membuat abstract class?
   Apa keuntungannya?



JAWABAN


1. Mantra Lumos telah ditambahkan dengan cara mewarisi
   MantraAbstrak dan mengimplementasikan method efek().

2. Kita tidak dapat membuat objek langsung dari
   MantraAbstrak karena MantraAbstrak merupakan abstract
   class. Jika dilakukan, akan terjadi compile error.

3. Abstract class digunakan sebagai dasar atau kerangka
   bagi class turunannya. Abstract class dapat menentukan
   method yang wajib dimiliki oleh class turunannya.
   Keuntungannya adalah struktur program menjadi lebih
   teratur dan mudah dikembangkan.
*/
