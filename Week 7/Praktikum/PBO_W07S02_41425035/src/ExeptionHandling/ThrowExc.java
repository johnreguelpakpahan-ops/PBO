/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExeptionHandling;

/**
 *
 * @author User
 */
class ThrowExc {
    public static void main(String args[]) {
        try {
            System.out.println("I'm throwing an exception from here...");
            throw new NullPointerException("throw demo");
        } catch (NullPointerException e) {
            System.out.println("I'm catching an exception: [" + e + "] from here...");
        }
    }
}
/*
1.Jika exception e tidak dilempar (rethrown) dari method demoThrow, apakah masih
akan di tangkap dari dalam main function?
jawab
Program secara eksplisit melemparkan objek exception baru menggunakan
keyword throw. Exception tersebut langsung ditangkap di dalam blok catch (NullPointerException e) yang bersesuaian pada fungsi yang sama.

*/