/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NilaiMahasiswa;

/**
 *
 * @author User
 */
public class StudentGrade {

    private String nim;
    private String nama;
    private double nilaiKuis;
    private double nilaiUTS;
    private String gradeHuruf;

    public StudentGrade(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiKuis = 0;
        this.nilaiUTS = 0;
        updateGrade();
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public double getNilaiKuis() {
        return nilaiKuis;
    }

    public double getNilaiUTS() {
        return nilaiUTS;
    }

    public String getGradeHuruf() {
        return gradeHuruf;
    }

    public void setNilaiKuis(double nilaiKuis) {
        if (nilaiKuis >= 0 && nilaiKuis <= 100) {
            this.nilaiKuis = nilaiKuis;
            updateGrade();
        } else {
            System.out.println(
                "Error: Nilai kuis harus 0 sampai 100."
            );
        }
    }

    public void setNilaiUTS(double nilaiUTS) {
        if (nilaiUTS >= 0 && nilaiUTS <= 100) {
            this.nilaiUTS = nilaiUTS;
            updateGrade();
        } else {
            System.out.println(
                "Error: Nilai UTS harus 0 sampai 100."
            );
        }
    }

    public double hitungNilaiAkhir() {
        return (nilaiKuis * 0.40) +
               (nilaiUTS * 0.60);
    }

    private void updateGrade() {
        double nilaiAkhir = hitungNilaiAkhir();

        if (nilaiAkhir >= 80) {
            gradeHuruf = "A";
        } else if (nilaiAkhir >= 70) {
            gradeHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            gradeHuruf = "C";
        } else if (nilaiAkhir >= 50) {
            gradeHuruf = "D";
        } else {
            gradeHuruf = "E";
        }
    }

    public void cetakLaporan() {
        System.out.println("===== LAPORAN HASIL STUDI =====");
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai Kuis  : " + nilaiKuis);
        System.out.println("Nilai UTS   : " + nilaiUTS);
        System.out.println("Nilai Akhir : " + hitungNilaiAkhir());
        System.out.println("Grade       : " + gradeHuruf);
    }
}