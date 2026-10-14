/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLIMORFISME;


/*
Nama:John Reguel Pakpahan 
NIM:41425035


*/
abstract class KendaraanEkspedisi {
    protected String noPolisi;
    protected int kapasitasKg;

    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }

    public void infoKendaraan() {
        System.out.println("Plat Nomor: " + noPolisi + " | Daya Angkut: " + kapasitasKg + " Kg");
    }

    public abstract void angkutBarang(String namaBarang);
}

class TrukBox extends KendaraanEkspedisi {
    public TrukBox(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Truk [" + noPolisi + "] memuat '" + namaBarang + "' ke dalam kontainer tertutup pendingin.");
    }
}

class MobilVan extends KendaraanEkspedisi {
    public MobilVan(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Mobil Van [" + noPolisi + "] memuat '" + namaBarang + "' di bagasi belakang untuk distribusi kota.");
    }
}

public class SimulasiAbstraksi {
    public static void main(String[] args) {
        System.out.println("=== INI ABSTRACT CLASS ===");

        // PERCOBAAN 1: Menguji larangan instansiasi langsung abstract class
        //KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);

        // PERCOBAAN 2: Instansiasi dari subclass konkret
        TrukBox fuso = new TrukBox("B 9081 TXT", 5000);
        fuso.infoKendaraan();
        fuso.angkutBarang("20 Unit Kulkas");

        System.out.println("----------------------------------------");

        MobilVan grandmax = new MobilVan("B 1122 KAA", 800);
        grandmax.infoKendaraan();
        grandmax.angkutBarang("50 Kotak Sepatu");
    }
}
/*
1.: Pada class SimulasiAbstraksi, buka komentar (uncomment) pada baris
PERCOBAAN 1: KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);
Pertanyaan: Salin pesan error yang dihasilkan oleh Java. Mengacu pada "Kotak Insight Konsep"
yang sudah Anda baca, mengapa Java menggagalkan baris kode ini?

Baris kode new KendaraanEkspedisi() menghasilkan error KendaraanEkspedisi is abstract; cannot be instantiated
karena class abstract merupakan cetak biru konseptual yang belum lengkap, sehingga tidak bisa diinstansiasi langsung menjadi objek.

2. Buatlah sebuah class baru dengan nama MotorKurir yang melakukan extends ke
KendaraanEkspedisi, tetapi jangan menuliskan isi method angkutBarang() di dalamnya.
Pertanyaan: Arahkan kursor (hover) ke garis merah error pada tulisan class MotorKurir.
Tuliskan dua opsi solusi/perbaikan yang ditawarkan oleh IDE Java (seperti
NetBeans/IntelliJ/Eclipse) untuk mengatasi error tersebut

Saat class MotorKurir dibuat tanpa mengimplementasikan method angkutBarang(), 
IDE Java memberikan dua opsi perbaikan: mengimplementasikan method abstrak secara otomatis (*Implement abstract methods*) atau mengubah deklarasi class MotorKurir menjadi class abstract (*Make class 'MotorKurir' abstract*).
*/
