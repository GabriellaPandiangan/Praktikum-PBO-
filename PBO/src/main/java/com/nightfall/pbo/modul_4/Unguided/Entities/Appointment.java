/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nightfall.pbo.modul_4.Unguided.Entities;



/**
 *
 * @author ASUS
 */

import java.time.LocalDateTime;  // Mengimpor LocalDateTime untuk tanggal & waktu


public class Appointment {  // Kelas untuk janji temu
    private Doctor doctor;  // Menyimpan dokter
    private Patient patient;  // Menyimpan pasien
    private LocalDateTime date; // Menyimpan tanggal janji


    public Appointment(Doctor doctor, Patient patient, LocalDateTime date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    public void displayInfo() {  // Menampilkan informasi janji temu
        System.out.println("Appointment Details:");
        doctor.displayInfo();  // Menampilkan info dokter
        System.out.println();
        patient.displayInfo(); // Menampilkan info pasien
        System.out.println("Appointment Date: " + date); // Menampilkan tanggal janji

    }
}

//output dari Appointment ini adalah untuk memastikan bahwa janji temu sudah terhubung dengan dokter dan pasien yang sesaui.
