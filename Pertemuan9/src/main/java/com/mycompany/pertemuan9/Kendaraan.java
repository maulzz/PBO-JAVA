/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan9;

/**
 *
 * @author maulzz
 */
abstract class Kendaraan {
    abstract void berjalan();
    
    void info(){
        System.out.println("ini adalah kendaraan");
    }
}

class Mobil extends Kendaraan {
    @Override
    void berjalan(){
        System.out.println("mobil berjalan");
    }
    
    @Override
    void info(){
        System.out.println("Ini adalah mobil");
    }
}

class Sepeda extends Kendaraan {
    @Override
    void berjalan(){
        System.out.println("sepeda berjalan");
    }
}