/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExeptionHandling;

/**
 *
 * @author User
 */
class MultipleCatch {
    public static void main(String args[]) {
        int n = args.length;
        int a = 1;
        int c[] = new int[1];
        try {
            if (n == 0)
                a = a / (a - 1);
            else
                c[21] = 5;
        } catch (ArithmeticException e) {
            System.out.println("Ups, seem out we have an Arithmetic Exception here...");
        } catch (Exception e) {
            System.out.println("Let the other exception handler here...");
        }
    }
}
/*
a. Coba eksekusi program tanpa arguments. Catch statement mana yang dieksekusi?
b. Coba eksekusi program dengan sebuah argument. Catch statement mana yang dieksekusi?
c. Sekarang, ganti ArithmeticException dengan Excception sepeti yang ditunjukkan di
bawah ini:
jawab:
a. Tanpa arguments: Blok catch yang dieksekusi adalah ArithmeticException
karena terjadi pembagian dengan nol (a / (a - 1)).

b. Dengan sebuah argument: Blok catch yang dieksekusi adalah Exception 
karena terjadi error ArrayIndexOutOfBoundsException akibat mengakses indeks array c[21] yang melebihi batas ukuran array.

c. Jika posisi Exception diletakkan di atas ArithmeticException: Terjadi 
compile-time error. Alasannya, Exception adalah superclass dari semua exception, sehingga jika diletakkan di atas, 
seluruh jenis exception (termasuk ArithmeticException) akan langsung diserap olehnya, membuat blok penangkap di bawahnya menjadi tidak pernah terjangkau (unreachable catch block).
*/