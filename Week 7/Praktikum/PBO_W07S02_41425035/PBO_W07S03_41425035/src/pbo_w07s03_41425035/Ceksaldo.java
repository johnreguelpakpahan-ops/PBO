/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w07s03_41425035;

// 1. Definisikan kelas custom exception terlebih dahulu di luar/atas
class SaldoKurangException extends Exception {
    public SaldoKurangException(String pesan) {
        super(pesan);
    }
}

public class Ceksaldo {

    // 2. Method menggunakan 'throws'
    public static void cekSaldo(int saldo) throws SaldoKurangException {
        if (saldo < 10000) {
            // 3. Melemparkan exception secara manual
            throw new SaldoKurangException("Saldo Anda tidak mencukupi untuk melakukan transaksi!");
        }
        // Perhatikan: Hapus tulisan "x: " di dalam kurung
        System.out.println("Transaksi berhasil diproses.");
    }
}