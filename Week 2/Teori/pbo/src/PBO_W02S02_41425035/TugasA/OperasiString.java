/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_W02S02_41425035.TugasA;

//nama:John Reguel Pakpahan
//Nim:41425035
//Prodi:DIV Teknologi Rekayasa Perangkat Lunak

import java.util.Scanner;
public class OperasiString {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Masukan nama lengkap: ");
        String nama = input.nextLine();
        
        System.out.println("Panjang String : )" + nama.length());
        System.out.println("Huruf pertama : " + nama.charAt(0));
        System.out.println("Mengandung spasi ?"+ nama.contains(""));
       
        
    }
    // 1 jika nama yg diiput dengann lebih dari 1 spasi maka itu akan tetep
    //dihitung di nama.legth
}
