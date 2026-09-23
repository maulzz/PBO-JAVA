/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan6;

/**
 *
 * @author maulzz
 */

import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    List<Produk> listProduk;

    public KeranjangBelanja() {
        listProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        listProduk.add(produk);
    }

    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk p : listProduk) {
            double hargaSetelahDiskon = p.harga - p.hitungDiskon();
            total += hargaSetelahDiskon;
        }
        return total;
    }

    public void cetakStruk() {
        System.out.println("=== Detail Keranjang Belanja ===");
        for (Produk p : listProduk) {
            double diskon = p.hitungDiskon();
            double hargaAkhir = p.harga - diskon;
            System.out.println("- " + p.nama + " (Harga Awal: " + p.harga + ", Diskon: " + diskon + ", Harga Akhir: " + hargaAkhir + ")");
        }
        System.out.println("================================");
        System.out.println("Total Bayar: " + hitungTotalHargaSetelahDiskon());
    }
}
