/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NilaiMahasiswa;

/**
 *
 * @author User
 */
public class MainStudent {
    public static void main(String[] args) {

        StudentGrade student =
                new StudentGrade("12S23001", "Budi");

        student.setNilaiKuis(85);
        student.setNilaiUTS(90);

        student.cetakLaporan();

        System.out.println();

        // Percobaan nilai tidak valid
        student.setNilaiKuis(110);
    }
}
