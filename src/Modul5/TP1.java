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
public class TP1 {
    private static int luastabung;
    private static int tinggi;
    
    public TP1 (int luastabung, int tinggi){
        TP1.luastabung = luastabung;
        TP1.tinggi = tinggi;
        
    }

    public int getLuastabung() {
        return luastabung;
    }

    public int getTinggi() {
        return tinggi;
    }

    void setLuastabung(int luastabung) {
        TP1.luastabung = luastabung;
    }

    void setTinggi(int tinggi) {
        TP1.tinggi = tinggi;
    }
    
}
