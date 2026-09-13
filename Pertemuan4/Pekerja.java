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
public class Pekerja extends Manusia {
    private int gaji;
    
    public Pekerja(String nama, int usia, String pekerjaan, int gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    
    public int getGaji() {
        return gaji;
    }
    
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    
    public String toString() {
        return "Nama : " + getNama() +
               "\nUsia : " + usia +
               "\nPekerjaan : " + pekerjaan +
               "\nGaji : " + gaji;
    }
}
