/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_w01s03_41425035;

/**
 *
 * @author User
 */
public class Circle {
Prive double radius;
private string color;


public circle(){
radius = 1.0;
color = "red";
}

public circle (double r){
    radius = r;
    color = "red";
    
}
public circle(double r,string c){
    radius = r;
    color = c;
    
}

public double getraddius(){
    return radius;
}

public string getcolor(){
    return color;
}
public double getarea(){
    return radius*radius*Math.PI
}
/**
 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
