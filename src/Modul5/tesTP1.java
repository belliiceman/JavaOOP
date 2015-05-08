/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5;

/**
 *
 * @author Belli
 */
import java.util.Scanner;
public class tesTP1 extends TP1 {
    Scanner in = new Scanner(System.in);
    public tesTP1(int luastabung, int tinggi){
        super(0+luastabung,tinggi);
    }
    @Override
    void setLuastabung(int luastabung){
        System.out.println("Masukkan Luas Tabung : ");
        super.setLuastabung(in.nextInt()+luastabung);
    }
    
    @Override
    void setTinggi(int tinggi){
        System.out.println("Masukkan Tinggi : ");
        super.setTinggi(in.nextInt()+tinggi);
    }
    public void hasil(){
        int a = getLuastabung() / getTinggi();
        System.out.println("Hasil volume tabung anda " + a);
    }
    
    
    
}
