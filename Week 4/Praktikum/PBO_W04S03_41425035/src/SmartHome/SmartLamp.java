/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SmartHome;

/**
 *
 * @author User
 */
public class SmartLamp implements Switchable, Connectable {

    private int brightness;
    private boolean isOn;
    private String wifiSSID;
    private String ipAddress;

    public SmartLamp(int brightness) {
        this.brightness = brightness;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Smart Lamp menyala.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Smart Lamp mati.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        if (!isOn) {
            System.out.println(
                "Error: Smart Lamp harus menyala sebelum terhubung WiFi."
            );
            return;
        }

        this.wifiSSID = ssid;
        this.ipAddress = ipAddress;

        System.out.println(
            "Smart Lamp terhubung ke WiFi " + ssid
            + " dengan IP " + ipAddress
        );
    }
}
