/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nightfall.pbo.modul_4.Unguided.Entities;



/**
 *
 * @author ASUS
 */

import java.time.LocalDateTime;  // Mengimpor LocalDateTime untuk menangani tanggal & waktu

public class Main {
    public static void main(String[] args) {
        Doctor doc1 = new Doctor("D001", "Dr. Andi", "Cardiology");  // Membuat objek dokter
        Patient pat1 = new Patient("P001", "Budi", 25); // Membuat objek pasien

        LocalDateTime appointmentDate = LocalDateTime.of(2025, 3, 16, 14, 30); // Menentukan tanggal janji temu
        Appointment app1 = new Appointment(doc1, pat1, appointmentDate);  // Membuat objek janji temu


        doc1.displayInfo();  // Menampilkan informasi dokter
        System.out.println();
        pat1.displayInfo();  // Menampilkan informasi pasien
        System.out.println();
        app1.displayInfo();  // Menampilkan informasi janji temu
    }
}
//output dari kode ini adalah untuk menjelaskan informasi dokter,
//informaasi pasien, dan informais janji temu yang dimana menunjukkan
//bahwa janji temu telah berhasil dibuat dan ditampilkan dengan detail dokter, pasien, serta tanggal dan waktu janji temu.