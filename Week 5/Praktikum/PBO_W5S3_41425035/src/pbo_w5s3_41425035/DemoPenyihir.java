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

class Penyihir {

    // Method yang dimiliki oleh kelas induk
    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}

// Harry Potter mewarisi kelas Penyihir
class HarryPotter extends Penyihir {

    // Override method ucapkanMantra()
    @Override
    public void ucapkanMantra() {
        System.out.println(
            "Harry Potter mengucapkan mantra dengan tongkatnya yang unik."
        );
    }
}

// Hermonie mewarisi kelas Penyihir
class Hermonie extends Penyihir {

    // Override method ucapkanMantra()
    @Override
    public void ucapkanMantra() {
        System.out.println(
            "Hermione mengucapkan mantra dengan tepat dan percaya diri."
        );
    }
}

// Ron Weasley mewarisi kelas Penyihir
class RonWeasley extends Penyihir {

    // Override method ucapkanMantra()
    @Override
    public void ucapkanMantra() {
        System.out.println(
            "Ron Weasley mengucapkan mantra dengan penuh keberanian."
        );
    }
}

public class DemoPenyihir {

    public static void main(String[] args) {

        // Tipe referensi Penyihir tetapi objeknya HarryPotter
        Penyihir penyihir1 = new HarryPotter();

        // Tipe referensi Penyihir tetapi objeknya Hermonie
        Penyihir penyihir2 = new Hermonie();

        // Tipe referensi Penyihir tetapi objeknya RonWeasley
        Penyihir penyihir3 = new RonWeasley();

        // Polymorphism akan memanggil method sesuai objek sebenarnya
        penyihir1.ucapkanMantra();
        penyihir2.ucapkanMantra();
        penyihir3.ucapkanMantra();
    }
}
/*


1. Tambahkan kelas RonWeasley yang mewarisi Penyihir dan
   override method ucapkanMantra() dengan implementasi
   yang sesuai untuk Ron.

2. Apa yang terjadi jika kita tidak menggunakan annotation
   @Override? Apakah kode masih berjalan?

3. Apa keuntungan menggunakan polymorphism dalam contoh ini?



JAWABAN


1. Kelas RonWeasley telah ditambahkan. Kelas tersebut
   mewarisi Penyihir menggunakan extends dan melakukan
   overriding terhadap method ucapkanMantra().

2. Program tetap dapat berjalan tanpa @Override selama
   method yang dibuat benar-benar memiliki nama dan
   parameter yang sama dengan method pada class induk.
   Namun, @Override membantu compiler mendeteksi kesalahan
   ketika method tidak benar-benar melakukan overriding.

3. Keuntungan polymorphism adalah satu tipe referensi
   Penyihir dapat digunakan untuk objek HarryPotter,
   Hermonie, dan RonWeasley. Ketika ucapkanMantra()
   dipanggil, Java akan menjalankan method sesuai dengan
   objek sebenarnya.
*/
