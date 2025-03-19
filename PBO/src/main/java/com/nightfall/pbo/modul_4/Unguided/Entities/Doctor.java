/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nightfall.pbo.modul_4.Unguided.Entities;

/**
 *
 * @author ASUS
 */
public class Doctor {  // Kelas untuk menyimpan data dokter
    private String id;   //id dokter
    private String name; // Nama dokter
    private String specialty; // Spesialisasi dokter

    public Doctor(String id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    public void displayInfo() { //Menampilkan informasi dokter
        System.out.println("Doctor ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialty: " + specialty);
    }
}

//Output dari kode ini adalah untuk memberikan informasi dokter ditampilkan sebelum informasi pasien dan janji temu.
