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
public class Mobil {
    String merk;
    String model;
    int tahun;
    String warna;
    
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }
    
    public String getMerk() {
        return merk;
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public String getWarna() {
        return warna;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public int getTahun() {
        return tahun;
    }
    
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    void displayInfo() {
        System.out.println("Merk Mobil :" + getMerk());
        System.out.println("Model Mobil :" + getModel());
        System.out.println("Tahun Mobil :" + getTahun());
        System.out.println("Warna Mobil :" + getWarna());
    }
    
    void startEngine() {
        System.out.println("Mesin Mobil " + getMerk() + " Menyala");
    }
}
