/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum;

/**
 *
 * @author USER
 */
public class Persegipanjang extends BangunDatar  {
    float panjang;
    float lebar;

    public Persegipanjang(String warna, float panjang, float lebar){
        super(warna);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void gambar(){
        System.out.println("warna persegi panjang: " + warna);
    }
     public float luas(){
            System.out.println("Menghitung Luas persegi panjang");
            System.out.println("Luas Lingkaran = " + (panjang * lebar));
            return 1;
      }   
}
