/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nightfall.pbo.modul_4.Unguided.Entities;

/**
 *
 * @author ASUS
 */
public class Patient {  //Kelas untuk menyimpan data pasien
    private String id;  //ID pasien
    private String name; //Nama pasien
    private int age; //Usia pasien

    public Patient(String id, String name, int age) {  //inisialisasi pasien
        this.id = id;  //menyimpan ID pasien
        this.name = name; //Menyimpan nama pasien
        this.age = age; //menyimpan usia pasien
    }

    public void displayInfo() {   // menampilkan informasi pasien
        System.out.println("Patient ID: " + id); //menampilkan id pasien
        System.out.println("Name: " + name); //menampilkan nama pasien
        System.out.println("Age: " + age); //menampilkan usia pasien
    }
}


//Kode ini adalah hanya untk menampulkan informasi pasien saat dipanggil atau displayInfo()