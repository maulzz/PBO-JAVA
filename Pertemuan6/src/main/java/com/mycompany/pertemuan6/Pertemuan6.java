/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan6;

/**
 *
 * @author maulzz
 */

//
//class Kalkulator {
// public int jumlah (int a, int b) {
//     return a + b;
// }   
// public double jumlah (double a,double b) {
//     return a + b;
// }
// 
// public int jumlah (int a, int b, int c) {
//     return a + b + c;
// }
// 
//}

class Hewan {
    String nama;
    
    public Hewan(String nama) {
        this.nama = nama;
    }
    
    public void bersuara() {
        System.out.println(nama + " bersuara");
    }
    
    public void makan(String makanan) {
        System.out.println(nama + " makan " + makanan);
    }
    
    public void makan(String makanan, int jumlah) {
        System.out.println(nama + " makan " + jumlah + " porsi " + makanan);
    }
}

class Kucing extends Hewan {
    
    public Kucing(String nama) {
        super(nama); 
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " Bersuara Meow");
    }
}

class Anjing extends Hewan {
    
    public Anjing(String nama) {
        super(nama); 
    }
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara GUK GUK GUK");
    }
}


public class Pertemuan6 {

    public static void main(String[] args) {
//        Kalkulator kalkulator = new Kalkulator();
//        
//        int hasil1 = kalkulator.jumlah(1, 3);
//        double hasil2 = kalkulator.jumlah(1.2, 3.2);
//        int hasil3 = kalkulator.jumlah(2, 3, 2);
//        
//        System.out.println("Hasil 1 = " + hasil1);
//        System.out.println("Hasil 2 = " + hasil2);
//        System.out.println("Hasil 3 = " + hasil3);

//           Hewan dika = new Hewan("DIKA");
//           dika.bersuara();
//           dika.makan("TEMAN");
//           dika.makan("BABI", 100);

//        Hewan acep = new Kucing("Acep");
//        Hewan dika = new Anjing("DIKA");
//        
//        acep.bersuara();
//        dika.bersuara();
//        
//        System.out.println("---");
//        
//        acep.makan("Cat Food");
//        dika.makan("Teman", 1);

        KeranjangBelanja keranjang = new KeranjangBelanja();

        Produk buku = new Buku("Buku Pemrograman Java", 100000);
        Produk hp = new Elektronik("Smartphone", 2000000);
        Produk baju = new Pakaian("Kemeja Kerja", 200000);

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(hp);
        keranjang.tambahProduk(baju);

        keranjang.cetakStruk();
        
    }
}
