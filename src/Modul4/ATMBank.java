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
import java.util.Scanner;
public class ATMBank {
    private int pin;
    private int tanggal;
    private int nominal;
    static int a;
    static int seratus;
    static int limapuluh;
    static int duapuluh;
    static int kosong;


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    
    public int getPin() {
        return pin;
    }

    
    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getTanggal() {
        return tanggal;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public static void setNol(int kosong) {
        ATMBank.kosong = kosong;
    }

    public static int getKosong() {
        return kosong;
    }
    
}

