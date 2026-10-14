/*
  Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
  Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLIMORFISME;
/*
Nama:John Reguel Pakpahan 
NIM:41425035


*/

class KurirReguler{
    protected String nama;
    public KurirReguler(String nama){
        this.nama = nama;
    }
    public void kirimBarang(String alamat){
        System.out.println(nama +" mengantar paket ke " +alamat+" lewat jalur darat menembus kemacetan");
        
    }
    
 
           
}   
class KurirDrone extends KurirReguler {
        private String IdDrone;
                public KurirDrone(String nama,String idDrone){
                    super(nama);
                    this.IdDrone = idDrone;
                }
                @Override
                public void kirimBarang(String alamat){
                    System.out.println("unit Drone [" + IdDrone + "] operator"+nama+
                            " terbang mengantar paket langsung ke kordinator : "+alamat);
                }
    }

public class Simulasioverriding {
    public static void main(String[] args) {
        System.out.println("==== INI METHOD OVERRIDING ===");
        KurirReguler k1= new KurirReguler("Budi");
        KurirReguler k2= new KurirDrone("Arka","DRN-01");
        k1.kirimBarang("Jl. Sudirman No.10");
        k2.kirimBarang("Gedung Grada lt.5");
    }
}

/*
Berikut adalah jawaban lengkap untuk 4 poin eksperimen tersebut:

---

 1. Hasil Perubahan Kode (Hapus @Override & Typo kirimbarang)

Saat @Override dihilangkan dan nama method diubah menjadi kirimbarang (huruf 'b' kecil), Java menganggap kirimbarang sebagai method baru yang terpisah milik class KurirDrone, bukan sebagai method yang menimpa (override) method kirimBarang dari class induk.

---

 2. Output dari k2.kirimBarang("Gedung Graha Lt. 5")

 Output yang tercetak:
Arka mengantar paket ke Gedung Graha Lt. 5 lewat jalur darat menembus kemacetan
 Jawaban: Output berubah menjadi "lewat jalur darat".
Penjelasan: Karena terjadi salah ketik pada sub-class, pemanggilan k2.kirimBarang() mengeksekusi method kirimBarang milik class induk (KurirReguler).

---

3. Pesan Error Saat @Override Dikembalikan

text
method does not override or implement a method from a supertype

4. Fungsi Utama @Override bagi Programmer

Sebagai pemeriksa/validasi otomatis dari kompilator (compiler). Anotasi 
@Override memastikan bahwa method yang ditulis programmer benar-benar menimpa method milik class induk.
Jika terjadi kesalahan ketik (typo) atau perbedaan tipe data parameter, kompilator akan langsung memberikan error saat proses kompilasi sehingga mencegah munculnya kesalahan (bug) saat program dijalankan.

*/


