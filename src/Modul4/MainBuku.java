/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4;

/**
 *
 * @author Belli
 */
public class MainBuku {

    public static void main(String[] args) {

        TA ambil = new TA();
        BukuTeks ambil2 = new BukuTeks();
        ambil.katalog();
        ambil2.katalog();
        ambil2.hitungdenda();
    }
}
