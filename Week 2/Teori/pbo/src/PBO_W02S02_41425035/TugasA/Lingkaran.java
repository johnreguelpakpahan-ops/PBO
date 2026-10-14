/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_W02S02_41425035.TugasA;

//nama:John Reguel Pakpahan
//Nim:41425035
//Prodi:DIV Teknologi Rekayasa Perangkat Lunak

import java.util.Scanner;
public class Lingkaran {
    
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        final double PI=3.14;
        System.out.print("Masukan jari jari");
        double r = input.nextDouble();
        if(r<0){
            System.out.println("Eror:jari jari tidak boleh negatif.");
            
        }
        else{
            double luas = PI * r * r;
            double keliling = 2 * PI * r;
            System.out.println("Luas : "+luas);
            System.out.println("keliling : " + keliling);
        }
        
        /*
        1. kita perlu validasi di karenakan kita menghitung keliling dan luas lingkaran
        jika jari jari  lebih kecil dari 0 makanya jawabnaya akan negatif , tidak ada luas dan
        keliling lingkaran yg negatif dan di dunian nyata tidak ada juga lingkaran lingkaran  yg 
        jari jarinya dibawah 0.
        2.saat user menginput data/sesuatu
        */
        
    }
}
