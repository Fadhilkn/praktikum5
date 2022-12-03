/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum;

/**
 *
 * @author USER
 */
public class segitiga extends BangunDatar {
    int alas;
    int tinggi;

    public segitiga(String warna, int alas , int tinggi){
        super(warna);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void gambar(){
        System.out.println("warna segitiga: " + warna);
    }
     public float luas(){
            System.out.println("Menghitung Luas persegi panjang");
            System.out.println("Luas Lingkaran = " + (1/2 * alas * tinggi));
            return 1;
      }   
}
