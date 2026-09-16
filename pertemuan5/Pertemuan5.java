/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5;

/**
 *
 * @author maulzz
 */
public class Pertemuan5 {

    public static void main(String[] args) {
        
        //KENDARAAN
        Mobil mobil = new Mobil("Toyota Avanza", 120, 4, 4);
        SepedaMotor motor = new  SepedaMotor("Supra", 300, 2 , "2JZ");
        
        mobil.tampilkanInfo();
        motor.tampilkanInfo();

        //HEWAN
//        Anjing anjing = new Anjing("Dika", "HITAM LEGAM");
//        Kucing kucing = new Kucing("Lala", "PUTIH");
//        
//        anjing.infoHewan();
//        kucing.infoHewan();
    }
}
