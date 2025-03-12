package unguided;


import unguided.Transmission;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
class car {
    // Variabel instance bersifat private untuk menjaga enkapsulasi
    private engine engine;
    private Transmission Transmission;
    private String brand;

    //menginisialisasi objek Car dengan brand, engine, dan transmission
    public car(String brand, engine engine, Transmission transmission) {
        this.brand = brand;
        this.engine = engine;
        this.Transmission = transmission;
    }
// Metode untuk menyalakan mobil
    public void startCar() {
        System.out.println("Starting " + brand + "...");   // Menampilkan pesan bahwa mobil sedang dinyalakan
        engine.startengine();
        Transmission.engage();
        System.out.println(brand + " is now running!\n");  // Menampilkan pesan bahwa mobil sudah berjalan
    }
}
