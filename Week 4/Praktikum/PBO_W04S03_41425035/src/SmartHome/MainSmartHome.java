/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SmartHome;

/**
 *
 * @author User
 */
public class MainSmartHome {
    public static void main(String[] args) {

        SmartLamp lamp = new SmartLamp(80);
        SmartAC ac = new SmartAC(24);

        // Mencoba koneksi ketika perangkat mati
        lamp.connectToWifi("HomeWifi", "192.168.1.10");

        ac.connectToWifi("HomeWifi", "192.168.1.11");

        System.out.println();

        // Menyalakan perangkat
        lamp.turnOn();
        ac.turnOn();

        System.out.println();

        // Menghubungkan ke WiFi
        lamp.connectToWifi("HomeWifi", "192.168.1.10");
        ac.connectToWifi("HomeWifi", "192.168.1.11");

        System.out.println();

        // Mematikan perangkat
        lamp.turnOff();
        ac.turnOff();
    }
}
