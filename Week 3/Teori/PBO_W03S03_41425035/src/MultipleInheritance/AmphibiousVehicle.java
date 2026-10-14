package MultipleInheritance;


import MultipleInheritance.LandVehicle;
import MultipleInheritance.WaterVehicle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class AmphibiousVehicle
    implements LandVehicle, WaterVehicle {

    AmphibiousVehicle() {
        System.out.println("This is an AmphibiousVehicle");
    }
}