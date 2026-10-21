/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExeptionHandling;

/**
 *
 * @author User
 */
public class HandlingException {
    public static void main(String[] args) {
        try {
            System.out.println(3/0);
        } catch (ArithmeticException ex) {
            System.out.println("Error" + ex);
        }
    }
}
/*
a. Ganti ex dengan ex.getMessage() dan ex.getStackTrace(). Coba juga untuk
mengeksekusi statement ex.printStackTrace() dan lihat apa hasilnya.
b. Ganti AtirhmeticException dengan Exception. Apa hasilnya? Jelaskan.
Jawaban:
a.ex.getMessage(): Mengembalikan deskripsi atau pesan singkat mengenai penyebab error (contoh: / by zero).
 ex.getStackTrace(): Mengembalikan array yang berisi elemen stack trace dari pemanggilan method saat error terjadi.
 ex.printStackTrace(): Mencetak detail lengkap stack trace (termasuk baris kode dan urutan fungsi) ke standard error stream.
b.Program tetap akan berjalan dengan sukses dan menangkap error dengan benar. Hal ini karena Exception adalah kelas induk (superclass)
 dari ArithmeticException, sehingga prinsip polimorfisme memungkinkan blok penangkap umum
*/