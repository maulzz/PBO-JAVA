/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan5;

/**
 *
 * @author maulzz
 */
public class Hewan {
    String nama;
    String warna;
    
    public Hewan(String nama, String warna){
        this.nama = nama;
        this.warna = warna;
    }
    
    public void infoHewan() {
        System.out.println("Nama:" + nama);
        System.out.println("Warna:" + warna);
    }
}
