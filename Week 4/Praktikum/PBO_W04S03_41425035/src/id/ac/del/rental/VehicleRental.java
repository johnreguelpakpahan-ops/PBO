/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

public class VehicleRental {
    private final String plateNumber;
    private final double rentalRatePerDay;
    private int rentalDays;

    public VehicleRental(String plateNumber, double rate) {
        if (plateNumber == null || plateNumber.isBlank())
            throw new IllegalArgumentException("Plat nomor tidak boleh kosong");
        if (rate <= 0)
            throw new IllegalArgumentException("Tarif harus lebih dari 0");
        this.plateNumber = plateNumber;
        this.rentalRatePerDay = rate;
    }

    public void setRentalDays(int days) {
        if (days <= 0)
            throw new IllegalArgumentException("Hari sewa harus lebih dari 0");
        this.rentalDays = days;
    }

    public String getPlateNumber()      { return plateNumber; }
    public double getRentalRatePerDay() { return rentalRatePerDay; }
    public int getRentalDays()          { return rentalDays; }

    public double getTotalCost(Discountable discount) {
        double subtotal = rentalRatePerDay * rentalDays;

        if (discount == null) {
            return subtotal;
        }

        double potongan = discount.calculateDiscount(subtotal);
        potongan = Math.max(0, Math.min(potongan, subtotal)); // aman: 0 s.d. subtotal

        return subtotal - potongan;
    }
}



