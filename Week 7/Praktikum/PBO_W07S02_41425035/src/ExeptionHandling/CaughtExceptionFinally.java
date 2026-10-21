/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExeptionHandling;

/**
 *
 * @author User
 */
class CaughtExceptionFinally {
    public static void main(String args[]) {
        int n = args.length;
        try {
            if (n == 0) {
                System.out.println(3/n);
                System.out.println("This won't be executed");
            } else {
                System.out.println("This will be executed if arguments is not zero");
            }
        } catch (Exception e) {
            System.out.println("Catching exception: " + e);
        } finally {
            System.out.println("After trying or catching...");
        }
    }
}

/*
a. Coba eksekusi program di atas tanpa arguments. Apa hasilnya?
b. Coba eksekusi program di atas dengan arguments. Apa hasilnya?
c. Jelaskan kesimpulan Anda dari pertanyaan a dan b setelah menjalankan program.
 jawab
a. Eksekusi tanpa arguments: Variabel n bernilai 0. Operasi 3 / 0 memicu ArithmeticException, 
lalu ditangkap oleh blok catch, dan blok finally tetap dieksekusi menampilkan
pesan "After trying or catching...".

b. Eksekusi dengan arguments: Variabel n > 0. Blok try berjalan normal melewati 
percabangan else, blok catch dilewati, dan blok finally tetap dieksekusi.

c. Kesimpulan: Blok finally dijamin selalu dieksekusi dalam kondisi apapun,
baik terjadi pengecualian (exception) maupun tidak, 
atau apakah exception tersebut tertangkap maupun tidak.
*/
