package MultipleInheritance;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
interface WaterVehicle {

    default void waterInfo() {
        System.out.println("This is a WaterVehicle");
    }
}
