/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w5s3_41425035;

/*
Nama:John Reguel Pakpahan 
NIM:41425035


*/
import java.util.ArrayList;
import java.util.List;

// Abstract class untuk semua mantra perlindungan
abstract class MantraPerlindungan {

    protected String nama;

    // Constructor
    public MantraPerlindungan(String nama) {
        this.nama = nama;
    }

    // Method untuk mendapatkan nama mantra
    public String getNama() {
        return nama;
    }

    // Method abstract untuk mengaktifkan mantra
    public abstract void aktifkan();

    // Method abstract untuk menonaktifkan mantra
    public abstract void nonaktifkan();
}

// Class Protego
class Protego extends MantraPerlindungan {

    public Protego() {
        super("Protego");
    }

    @Override
    public void aktifkan() {
        System.out.println("Perisai Protego terbentuk!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Perisai Protego dinonaktifkan.");
    }
}

// Class Fidelius
class Fidelius extends MantraPerlindungan {

    private String secretKeeper;

    public Fidelius(String secretKeeper) {
        super("Fidelius");
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {
        System.out.println(
            "Fidelius diaktifkan oleh secret keeper: "
            + secretKeeper
        );
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Mantra Fidelius dinonaktifkan.");
    }
}

// Class MantraAntiApparition
class MantraAntiApparition extends MantraPerlindungan {

    private String area;

    public MantraAntiApparition(String area) {
        super("Mantra Anti-Apparition");
        this.area = area;
    }

    @Override
    public void aktifkan() {
        System.out.println(
            "Anti-Apparition aktif di area: " + area
        );
    }

    @Override
    public void nonaktifkan() {
        System.out.println(
            "Anti-Apparition dinonaktifkan di area: " + area
        );
    }
}

// Class SistemPertahanan
class SistemPertahanan {

    // List untuk menyimpan berbagai mantra perlindungan
    private List<MantraPerlindungan> daftarMantra;

    // Constructor
    public SistemPertahanan() {
        daftarMantra = new ArrayList<>();
    }

    // Menambahkan mantra ke sistem pertahanan
    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);

        System.out.println(
            mantra.getNama() + " ditambahkan ke sistem pertahanan."
        );
    }

    // Mengaktifkan semua mantra
    public void aktifkanSemuaMantra() {

        System.out.println("\n=== Mengaktifkan Semua Mantra ===");

        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.aktifkan();
        }
    }

    // Menonaktifkan semua mantra
    public void nonaktifkanSemuaMantra() {

        System.out.println("\n=== Menonaktifkan Semua Mantra ===");

        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.nonaktifkan();
        }
    }
}

// Main class
public class SistemPertahananHogwarts {

    public static void main(String[] args) {

        // Membuat sistem pertahanan Hogwarts
        SistemPertahanan sistem = new SistemPertahanan();

        // Membuat beberapa mantra perlindungan
        MantraPerlindungan protego = new Protego();

        MantraPerlindungan fidelius =
                new Fidelius("Albus Dumbledore");

        MantraPerlindungan antiApparition =
                new MantraAntiApparition("Hogwarts");

        // Menambahkan mantra ke sistem
        sistem.tambahMantra(protego);
        sistem.tambahMantra(fidelius);
        sistem.tambahMantra(antiApparition);

        // Mengaktifkan semua mantra
        sistem.aktifkanSemuaMantra();

        // Menonaktifkan semua mantra
        sistem.nonaktifkanSemuaMantra();
    }
}
