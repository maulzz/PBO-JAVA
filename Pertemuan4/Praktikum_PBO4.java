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
public class Praktikum_PBO4 {
    public static void main(String[] args) {
//        Kendaraan mobil = new Kendaraan("BMW", "M4", 2025);
//        
//        System.out.println("Merek: " + mobil.getMerk());
//        System.out.println("Model: " + mobil.getModel());
//        System.out.println("Tahun: " + mobil.getTahun());
//        
//        mobil.setModel("X7");
//        mobil.setTahun(2026);
//        
//         System.out.println("Model: " + mobil.getModel());
//        System.out.println("Tahun: " + mobil.getTahun());

          Pekerja pekerja = new Pekerja("Wildan", 19, "Project Manager", 10000000);
          
        System.out.println("Informasi Awal:");
        System.out.println(pekerja.toString());
        
        pekerja.setNama("Maulana");
        
        System.out.println("\nSetelah Nama Diubah:");
        System.out.println(pekerja.toString());
        
        System.out.println(pekerja.usia);      // Bisa
        System.out.println(pekerja.pekerjaan); // Bisa
    }
    
}
