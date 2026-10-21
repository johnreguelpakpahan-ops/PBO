/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExeptionHandling;

/**
 
 * @author User
 */
class UncaughtException {
    public static void main(String args) {
        System.out.println(3/0);
    }
}

/*
a. Analisis apa yang akan terjadi ketika program di atas di eksekusi.
b. Apa outputnya?
Jawaban:
a.Gak bisa dijalankan karena tidak memiliki method main
b.tidak memiliki output karena tidak bisa jalan karena gak memiiliki method main tetapi
akan mengeluarkan pesan stack trace error dari Java Virtual Machine (JVM)


*/