/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum;

/**
 *
 * @author USER
 */
public class lingkaran extends BangunDatar {
    int r;

    public lingkaran(String warna, int r){
        super(warna) ;
        this.r = r;
    }

    public void gambar(){
        System.out.println("Warna lingkaran : " + warna);
    }
     public float luas(){
            System.out.println("Menghitung Luas Lingkaran");
            System.out.println("r = " + r );
            System.out.println("Luas Lingkaran = " + (3.14 * r * r) + "4");
            return 1;
      }   
}
