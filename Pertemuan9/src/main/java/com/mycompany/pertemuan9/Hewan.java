/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan9;

/**
 *
 * @author maulzz
 */
abstract class Hewan {
    abstract void suara();
    
    void info(){
        System.out.println("hewan ini bisa bersuara");
    }
}

class Kucing extends Hewan {
    @Override
    void suara(){
         System.out.println("Meong Meong");
    }
}

class Anjing extends Hewan {
    @Override
    void suara(){
         System.out.println("Guk Guk Guk");
    }
}
