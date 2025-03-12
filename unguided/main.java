package unguided;


import unguided.engine;
import unguided.car;
import unguided.Transmission;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        engine myEngine = new engine("V8");         // Membuat objek Engine dengan tipe "V8".
        Transmission myTransmission = new Transmission("Automatic");   // Membuat objek Transmission dengan tipe "Automatic".
        car myCar = new car("Toyota", myEngine, myTransmission);     // Membuat objek Car dengan merek "Toyota", serta menyertakan mesin dan transmisi yang telah dibuat.
        
        myCar.startCar();   // Memanggil metode untuk menyalakan mobil.
    }
}

