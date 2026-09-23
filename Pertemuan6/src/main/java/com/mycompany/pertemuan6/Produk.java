/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan6;

/**
 *
 * @author maulzz
 */
public class Produk {
    String nama;
    double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public double hitungDiskon() {
        return 0; 
    }
}

class Buku extends Produk{
    public Buku(String nama, double harga){
        super(nama,harga);
    }
    
    @Override
    public double hitungDiskon() {
        return harga * 0.1; 
    }
}

class Elektronik extends Produk{
    public Elektronik(String nama, double harga){
        super(nama,harga);
    }
    
    @Override
    public double hitungDiskon() {
        return harga * 0.2; 
    }
}

class Pakaian extends Produk{
    public Pakaian(String nama, double harga){
        super(nama,harga);
    }
    
    @Override
    public double hitungDiskon() {
        return harga * 0.15; 
    }
}
