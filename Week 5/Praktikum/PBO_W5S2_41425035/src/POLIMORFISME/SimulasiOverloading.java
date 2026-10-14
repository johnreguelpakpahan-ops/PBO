/*
  Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
  Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POLIMORFISME;
/*
Nama:John Reguel Pakpahan 
NIM:41425035


*/
class MesinTarif{
    private String kotaAsal;
    public MesinTarif(String kotaAsal){
        this.kotaAsal = kotaAsal;
        
    }
    public double hitungOngkir(double beratKG){
        return beratKG * 10000;
    }
    public double hitungOngkir(double beratKG,double nilaiBarang){
        double biayaAsuransi = nilaiBarang * 0.01;
        return(beratKG * 10000)+ biayaAsuransi;
    }
    public double hitungOngkir(double beratKG ,boolean isExpress){
        double total = beratKG * 10000;
        if(isExpress){
            total += 20000;
        }
        return total;
    }
}



public class SimulasiOverloading {
    public static void main(String[] args) {
       MesinTarif tarif =new MesinTarif("Medan");
       System.out.println("=== INI METHOD OVERLOADING ===");
       System.out.println("Ongkir Biasa(2.0 Kg)          :Rp"+tarif.hitungOngkir(2.0));
       System.out.println("Ongkir + Asuransi (Barang 5jt :Rp)"+tarif.hitungOngkir(2.0,5000000.0));
       System.out.println("Ongkir Express (2.0 Kg)     :Rp"+tarif.hitungOngkir(2.0,true));
      
    }
    
}

/*
1. Penentuan Method saat Compile-Time

Compiler Java dapat menentukan method mana yang dijalankan sebelum program dieksekusi melalui konsep Static Binding (Polimorfisme Compile-Time).

 Bagian yang diperiksa compiler: Method Signature, yaitu nama method dan daftar parameter (jumlah, tipe data, serta urutan parameternya).
 Cara kerja: Kompiler mencocokkan argumen pada pemanggilan fungsi dengan parameter yang tersedia:
 tarif.hitungOngkir(2.0) $\rightarrow$ cocok dengan parameter (double).
 tarif.hitungOngkir(2.0, 5000000.0) $\rightarrow$ cocok dengan parameter (double, double).
 tarif.hitungOngkir(2.0, true) $\rightarrow$ cocok dengan parameter (double, boolean).


2. Penyebab Error Perbedaan Tipe Kembalian (Return Type)

Kode tersebut ditolak (compile error) karena tipe kembalian (return type) tidak digunakan oleh Java untuk membedakan method overloading.

 Alasan: Method public int hitungOngkir(double beratKg) memiliki nama dan parameter (double) yang sama persis dengan public double hitungOngkir(double beratKG).
 Karena parameter-nya sama, kompiler menganggap kedua method tersebut duplikat. Kompiler tidak akan tahu method mana yang harus dipanggil jika ada baris kode seperti tarif.hitungOngkir(2.0); tanpa menampung nilai kembaliannya.
*/

