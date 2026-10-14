/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_W02S02_41425035.TugasA;
//nama:John Reguel Pakpahan
//Nim:41425035

import java.util.Scanner;

//Prodi:DIV Teknologi Rekayasa Perangkat Lunak
/**
 imp
 * @author User
 */

public class Kalkulator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka pertama : ");
        int a = input.nextInt();
        System.out.print("Masukan angka Kedua : ");
        int b = input.nextInt();
        
        
        System.out.println("Tambah : " + (a+b));
        System.out.println("Kurang : " + (a-b));
        System.out.println("Kali : " + (a*b));
        System.out.println("Bagi : " + (double)(a/b));
    }
    
    /*1.kalau kita mengunakan int dan jumalah bilangan kedua tidak habis  
    membagi bilangan pertama maka bilangan tersebut tidak ada di belakang koma,
    tapi jika mengunakan double maka bisa di belakang koma.
    jadi perbedaanya nilai asli double maka bisa ada angka dibelakang koma dan jika int 
    maka hanya kan mengambil bilngan bulatnya
     2.jika kita tidak mengunakan double maka tidak bisa dibelakang kom dan itu bukan 
    nilai aslinya  misal 12:5 adalah 2.4  jika kita tidak mengcasting ke double maka jawabannya 
    adalah 2 bukann 2,4 padahal 2 kali 5  adalah  10 bukan 12  
    3.jika pembagi adalah 0 maka jawabanya tidak terdefinisi, karna gak ada bilangan  yg bisa di bagi 0 
     semisal ada 12 apel ingin di bagi untuk  0 orang  maka terjadi pembagian yg tidak akan pernah siap
  
*/
}
