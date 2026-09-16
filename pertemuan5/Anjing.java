/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan5;

/**
 *
 * @author maulzz
 */
public class Anjing extends Hewan{
    private String suara = "GUK GUK GUK";
    
    public Anjing(String nama, String warna){
    super(nama, warna);
    }
    
    @Override
    public void infoHewan() {
        super.infoHewan();
        System.out.println("Suara " + nama + " : " + suara);
    }
}
