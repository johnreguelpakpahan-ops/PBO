/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SmartHome;

/**
 *
 * @author User
 */
public class SmartAC implements Switchable, Connectable {

    private double temperature;
    private boolean isOn;
    private String wifiSSID;
    private String ipAddress;

    public SmartAC(double temperature) {
        this.temperature = temperature;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Smart AC menyala.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Smart AC mati.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        if (!isOn) {
            System.out.println(
                "Error: Smart AC harus menyala sebelum terhubung WiFi."
            );
            return;
        }

        this.wifiSSID = ssid;
        this.ipAddress = ipAddress;

        System.out.println(
            "Smart AC terhubung ke WiFi " + ssid
            + " dengan IP " + ipAddress
        );
    }
}
