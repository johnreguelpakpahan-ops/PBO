/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w07s03_41425035;

/**
 *
 * @author User
 */
// ==========================================
// 1. KELAS CUSTOM EXCEPTION BUATAN SENDIRI
// ==========================================
// Exception ini menangani kasus ketika level karakter game belum mencukupi untuk masuk dungeon.
class LevelKarakterKurangException extends Exception {
    public LevelKarakterKurangException(String pesan) {
        super(pesan); // Meneruskan pesan kesalahan ke constructor kelas induk (Exception)
    }
}

// ==========================================
// 2. KELAS LOGIKA DUNGEON GAME
// ==========================================
class DungeonGame {
    
    // Menggunakan keyword 'throws' pada header method untuk mendeklarasikan potensi custom exception
    public void masukDungeon(int levelPemain) throws LevelKarakterKurangException {
        // Aturan game: Dungeon khusus ini hanya boleh dimasuki oleh pemain minimal level 50
        if (levelPemain < 50) {
            
            // Menggunakan keyword 'throw' untuk memicu exception secara manual jika level terlalu rendah
            throw new LevelKarakterKurangException("Akses Ditolak! Level karakter Anda (" + levelPemain + ") belum mencapai syarat minimal level 50.");
        }
        
        System.out.println("Akses disetujui! Selamat bertarung di dalam dungeon.");
    }
}

// ==========================================
// 3. KELAS DRIVER (MAIN METHOD)
// ==========================================
public class MainGame {
    public static void main(String[] args) {
        // Menginstansiasi (membuat objek) dari kelas DungeonGame
        DungeonGame game = new DungeonGame();

        System.out.println("=== PEMERIKSAAN LEVEL DUNGEON ===");

        // Blok try: Mencoba menjalankan kode yang berpotensi menghasilkan exception
        try {
            // Skenario pengujian: Pemain baru level 30 mencoba masuk dungeon level tinggi (pasti error)
            game.masukDungeon(30);
        } 
        // Blok catch: Menangkap custom exception yang dilempar dari method di atas
        catch (LevelKarakterKurangException e) {
            System.out.println("Pesan Error Tertangkap: " + e.getMessage());
        } 
        // Blok finally: Blok kode yang SELALU dieksekusi di akhir, baik terjadi error maupun aman
        finally {
            System.out.println("=== PROSES PEMERIKSAAN SELESAI ===");
        }
    }
}