/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        Mobil Merc = new Mobil("Mercedes", "G-Class", 2026, "Hitam");
        Mobil bmw = new Mobil("BMW", "M3", 2025, "Putih");
        
        System.out.println("--- Informasi Mobil 1 ---");
        Merc.displayInfo();
        System.out.println("--- Informasi Mobil 2 ---");
        bmw.displayInfo();
        
        System.out.println("--- Menyalakan Mobil ---");
        Merc.startEngine();
        bmw.startEngine();
        
        System.out.println("--- Mengubah Warna Mobil 1 ---");
        Merc.setWarna("Abu-Abu");
         Merc.displayInfo();
    }
}
