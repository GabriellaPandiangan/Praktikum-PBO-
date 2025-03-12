package unguided;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
class engine {
    private String type;   // Atribut 'type' menyimpan jenis mesin (misalnya, bensin atau diesel).

    public engine(String type) {
        this.type = type;      // Menyimpan nilai tipe mesin ke dalam atribut 'type'.
    }

    public void startengine() {    // Metode untuk menyalakan mesin.
        System.out.println("engine " + type + "started.");    // Menampilkan pesan bahwa mesin telah dinyalakan.
    }
}