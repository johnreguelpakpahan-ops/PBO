/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExeptionHandling;

/**
 *
 * @author User
 */
class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("I'm throwing a non Runtime exception that I don't handle");
        System.out.println("Without specifying in method declaration");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[]) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        }
    }
}

/*
 Apa yang akan terjadi jika kode program di atas dieksekusi? Mengapa?
b. Apa yang akan terjadi jika IllegalAccessException diganti dengan
ArithmeticException? Mengapa? Perbaiki kode program di atas seperti yang
ditunjukkan di bawah ini:
Jawab:
a. Terjadi compile-time error. Alasannya, IllegalAccessException adalah jenis checked exception, 
sehingga kompiler Java mewajibkan programmer untuk membungkusnya dengan blok try-catch atau mendeklarasikannya
menggunakan keyword throws pada tanda tangan method.

b. Program dapat dikompilasi tanpa error kompilasi. Alasannya, ArithmeticException adalah jenis 
unchecked exception (turunan dari RuntimeException), sehingga tidak wajib dideklarasikan dengan throws ataupun 
dibungkus try-catch secara eksplisit.
*/