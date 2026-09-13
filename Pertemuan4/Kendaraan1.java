/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 *
 * @author acer
 */
public class Kendaraan1 {
    private String nama;
    protected int kecepatanMaks;
    public String jenisMesin;
    
    public Kendaraan1(String nama, int KecepatanMaks, String jenisMesin) {
        this.nama = nama;
        this.jenisMesin = jenisMesin;
        this.kecepatanMaks = kecepatanMaks;
    }
    
     public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void tampilkaInfoKendaraan() {
        System.out.println("Nama Kendaraan : " + nama);
        System.out.println("Kecepatan Maksimum : " + kecepatanMaks);
        System.out.println("Jenis Mesin : " + jenisMesin);
    }
    
}
