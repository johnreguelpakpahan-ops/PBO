/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBO_W02S02_41425035.TugasA;

/**
 *
 * @author User
 */
public class Datadiri {
//nama:John Reguel Pakpahan
//Nim:41425035
//Prodi:DIV Teknologi Rekayasa Perangkat Lunak
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama = "Andi";
        int umur = 19;
        double tinggi = 165.8;
        boolean isMahasiswa = true;
        
        System.out.println("Nama : "+nama);
        System.out.println("Umur : "+ umur + " Tahun");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("Status Mahasiswa: " + isMahasiswa);
        
        int tinggiBulat= (int) tinggi;
       System.out.println("Tinggi (Dibulatkan): "+tinggiBulat+" cm");
    }
    
}
