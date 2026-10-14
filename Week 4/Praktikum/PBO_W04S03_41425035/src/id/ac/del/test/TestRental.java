/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.test;

/**
 *
 * @author User
 */


import id.ac.del.rental.MemberDiscount;
import id.ac.del.rental.FlashSaleDiscount;
import id.ac.del.rental.Discountable;
import id.ac.del.rental.CorporateDiscount;
import id.ac.del.rental.VehicleRental;

public class TestRental {

    public static void main(String[] args) {

        VehicleRental v =
                new VehicleRental("BK 1234 DEL", 250000);

        v.setRentalDays(7);

        Discountable discount =
                new MemberDiscount();

        double total =
                v.getTotalCost(discount);

        System.out.println(
            "Total Biaya: Rp" + total
        );

        System.out.println();

        discount = new FlashSaleDiscount();

        total = v.getTotalCost(discount);

        System.out.println(
            "Total Biaya Flash Sale: Rp" + total
        );

        System.out.println();

        discount = new CorporateDiscount();

        total = v.getTotalCost(discount);

        System.out.println(
            "Total Biaya Corporate: Rp" + total
        );
    }}


/*
1) Analisis Kompilasi dan Hak Akses

i) Baris B dan C yang error, karena TestRental berbeda package dengan VehicleRental dan bukan subclass-nya. Baris A lolos karena `public`. Baris B error karena `protected` hanya bisa diakses dari package yang sama atau subclass. Baris C error karena tanpa modifier (default) hanya bisa diakses dari package yang sama. Baris D lolos karena method-nya `public`. Aturannya: `public` bisa diakses dari mana saja, `protected` dari package yang sama dan subclass, default hanya dari package yang sama, dan `private` hanya dari dalam kelas itu sendiri.

2) Kelemahan Integritas Data

i) Setter `setRentalDays` langsung menyimpan nilai tanpa validasi, sehingga nilai tidak masuk akal seperti -7 tetap diterima. Pada Baris A, `plateNumber` yang `public` juga bisa dikosongkan tanpa pemeriksaan.

ii) Total biaya bisa negatif karena hari sewa, tarif, atau discountRate bisa diisi nilai sembarangan akibat field tidak dilindungi (tidak ada enkapsulasi). Cara refaktornya: jadikan semua field `private` (plateNumber dan rentalRatePerDay juga `final`), lalu tambahkan validasi di constructor dan setter yang melempar IllegalArgumentException jika plat kosong, tarif ≤ 0, atau hari sewa ≤ 0. Data diakses lewat getter.

3) Penerapan Interface

i) Interface Discountable berisi satu method abstrak, yaitu double calculateDiscount(double amount)`, yang mengembalikan nilai potongan harga. MemberDiscount, FlashSaleDiscount, dan CorporateDiscount mengimplementasikannya dengan persentase masing-masing.

ii) `getTotalCost(Discountable discount)` menghitung subtotal (tarif × hari), lalu memanggil `discount.calculateDiscount(subtotal)` untuk mendapat potongan, dan mengembalikan subtotal dikurangi potongan. Karena parameternya bertipe interface, objek diskon yang dikirim dari TestRental menentukan perhitungan saat runtime (polimorfisme), tanpa VehicleRental perlu tahu kelas konkretnya.

*/