/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan5;

/**
 *
 * @author maulzz
 */
public class Kucing extends Hewan{
      private String suara = "MIAW MIAW";
    
    public Kucing(String nama, String warna){
    super(nama, warna);
    }
    
    @Override
    public void infoHewan() {
        super.infoHewan();
        System.out.println("Suara " + nama + " : " + suara);
    }
}
