/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.praktikum;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BangunDatar lingkaran = new lingkaran("pink",9);
        Persegipanjang Persegipanjang = new Persegipanjang ("hitam",10,6);
        segitiga segitiga = new segitiga("biru",10,4);
        
        lingkaran.gambar();
        lingkaran.luas();
        System.out.println();
        segitiga.gambar();
        segitiga.luas();
        System.out.println();
        Persegipanjang.gambar();
        Persegipanjang.luas();
                      
    }
    
}
