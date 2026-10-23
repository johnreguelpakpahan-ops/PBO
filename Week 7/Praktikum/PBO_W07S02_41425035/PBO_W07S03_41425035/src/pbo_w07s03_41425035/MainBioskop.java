/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w07s03_41425035;

/**
 *
 * @author User
 */

// 1. KELAS CUSTOM EXCEPTION

// Exception ini menangani kasus ketika kursi bioskop sudah habis/penuh.
class KursiPenuhException extends Exception {
    public KursiPenuhException(String pesan) {
        super(pesan); // Meneruskan pesan kesalahan ke constructor kelas induk (Exception)
    }
}


// 2. KELAS BIOSKOP (LOGIKA BISNIS)

class Bioskop {
    private int sisaKursi = 2; // Sisa kursi yang tersedia di studio saat ini

    // Menggunakan keyword 'throws' untuk mendeklarasikan potensi custom exception
    public void pesanTiket(int jumlahPesan) throws KursiPenuhException {
        // Aturan: Jika tiket yang diminta melebihi sisa kursi yang ada
        if (jumlahPesan > sisaKursi) {
            
            // Menggunakan keyword 'throw' untuk memicu exception secara manual
            throw new KursiPenuhException("Pemesanan Gagal! Kursi tidak mencukupi. Sisa kursi hanya " + sisaKursi + ".");
        }
        
        sisaKursi -= jumlahPesan;
        System.out.println("Pemesanan berhasil! Sisa kursi saat ini: " + sisaKursi);
    }
}

// 
// 3. KELAS DRIVER (MAIN METHOD)
// 
public class MainBioskop {
    public static void main(String[] args) {
        // Menginstansiasi (membuat objek) dari kelas Bioskop
        Bioskop bioskop = new Bioskop();

        System.out.println("=== SISTEM PEMESANAN TIKET BIOSKOP ===");

        // Blok try: Mencoba menjalankan kode yang berpotensi menghasilkan exception
        try {
            // Skenario pengujian: Mencoba memesan 5 tiket, padahal sisa kursi cuma 2 (pasti error)
            bioskop.pesanTiket(5);
        } 
        // Blok catch: Menangkap custom exception yang dilempar dari method di atas
        catch (KursiPenuhException e) {
            System.out.println("Pesan Error Tertangkap: " + e.getMessage());
        } 
        // Blok finally: Blok kode yang SELALU dieksekusi di akhir, baik terjadi error maupun aman
        finally {
            System.out.println("=== PROSES PEMESANAN SELESAI ===");
        }
    }
}