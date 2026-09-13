/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

/**
 *
 * @author acer
 */
public class Mobil extends Kendaraan1 {
    private int jumlahPintu;
    
    public Mobil(String nama, int KecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, KecepatanMaks, jenisMesin);
        this.jumlahPintu = jumlahPintu;
    }
    
    public void tampilkanInfoMobil() {
        System.out.println("Kecepatan Maksimal Mobil : " + kecepatanMaks + " Km/h");
        System.out.println("Jumlah Pintu :" + jumlahPintu);
    }
}
