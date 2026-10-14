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


public class Mantra {

    // Method ucapkan() dengan satu parameter
    public void ucapkan(String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra);
    }

    // Overload: method ucapkan() dengan dua parameter
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mengucapkan mantra: " + namaMantra
                + " dengan kekuatan " + kekuatan);

        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }

    // Overload: method ucapkan() dengan tiga parameter
    public void ucapkan(String namaMantra, int kekuatan, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra
                + " dengan kekuatan " + kekuatan
                + " pada " + target);

        if (kekuatan > 10) {
            System.out.println("Efek: " + target + " terlempar!");
        } else {
            System.out.println("Efek: Senjata " + target + " terlepas.");
        }
    }

    // Tambahan overload sesuai instruksi
    // Parameter: String namaMantra dan String target
    public void ucapkan(String namaMantra, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra
                + " pada " + target);
        System.out.println("Efek: " + target + " terkena mantra.");
    }

    // Overload dengan urutan parameter berbeda
    public void ucapkan(int kekuatan, String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra
                + " dengan kekuatan " + kekuatan);

        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }

    public static void main(String[] args) {

        Mantra mantra = new Mantra();

        mantra.ucapkan("Expelliarmus");
        mantra.ucapkan("Expelliarmus", 5);
        mantra.ucapkan("Expelliarmus", 15, "Voldemort");

        // Memanggil overload tambahan
        mantra.ucapkan("Expelliarmus", "Voldemort");

        // Memanggil overload dengan urutan parameter berbeda
        mantra.ucapkan(15, "Expelliarmus");
    }
}
/*


1. Apa yang terjadi jika kita menghapus salah satu method
   overloading? Misalnya method dengan dua parameter.

2. Bisakah kita membuat method overloading dengan urutan
   parameter yang berbeda? Coba buat method:
   ucapkan(int kekuatan, String namaMantra).

JAWABAN

1. Jika salah satu method overloading dihapus, program tetap
   dapat berjalan selama method tersebut tidak dipanggil.
   Tetapi jika method yang sudah dihapus masih dipanggil,
   program akan mengalami compile error karena Java tidak
   menemukan method dengan parameter yang sesuai.

2. Bisa. Method overloading dapat dibuat dengan urutan
   parameter yang berbeda. Contohnya:

   public void ucapkan(String namaMantra, int kekuatan)

   dan:

   public void ucapkan(int kekuatan, String namaMantra)

   Kedua method tersebut dianggap berbeda karena urutan
   tipe parameternya berbeda.
*/