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
public class Hewan {
     private String nama;
     private int umur;
     
     public  Hewan(String nama, int umur) {
         this.nama = nama;
         this.umur = umur;
     }
     
     public String getNama() {
         return nama;
     }
     
     public void setNama(String nama) {
         this.nama = nama;
     }
     
     public int getUmur() {
         return umur;
     }
     
     public void setUmur(int umur) {
         this.umur = umur;
     }
     
     void suara() {
         System.out.println("ALLO SEMUANAAA");
     }
     
     void info() {
         System.out.println("Nama :" + getNama() + " Umur :" + getUmur());
     }
     
}
