package unguided;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
class Transmission {
    private String TransmissionType;  //menyimpan jenis transmisi 

    public Transmission(String transmissionType) {
        this.TransmissionType = transmissionType;  //// Menyimpan nilai tipe transmisi ke dalam atribut 'transmissionType'.
    }

    public void engage() {     // Metode untuk mengaktifkan transmisi.
        System.out.println("Transmission " + TransmissionType + " engaged.");       // Menampilkan pesan bahwa transmisi telah diaktifkan.
    }
}
