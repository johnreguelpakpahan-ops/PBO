/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExeptionHandling;

/**
 *
 * @author User
 */
class ReThrowExc {
    static void demoThrow() {
        try {
            System.out.println("I'm throwing an exception from demoThrow method");
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("I'm catching the exception [" + e + "]");
            System.out.println("But I'll throw it again...\n");
            throw e;
        }
    }

    public static void main(String args[]) {
        try {
            demoThrow();
        } catch (NullPointerException e) {
            System.out.println("I'm catching the exception [" + e + "]\nthrown from demoThrow method");
        }
    }
}

/*
a. Jika exception e tidak dilempar (rethrown) dari method demoThrow, apakah masih
akan di tangkap dari dalam main function?
b. Apa yang bisa Anda simpulkan dari kode program di atas?
Jawab:
a. Jika exception e tidak dilempar ulang (rethrown): Exception hanya akan ditangani secara lokal di dalam method demoThrow() saja.
Fungsi main tidak akan mendeteksi exception tersebut, sehingga blok catch di dalam main tidak akan tereksekusi.

b. Kesimpulan: Mekanisme re-throwing memungkinkan suatu method untuk melakukan tindakan penanganan awal (seperti logging atau pembersihan lokal),
lalu meneruskannya kembali ke fungsi pemanggil (caller) untuk penanganan lanjutan.
*/