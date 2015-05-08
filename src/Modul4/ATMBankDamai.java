/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Belli
 */
public class ATMBankDamai implements MesinATM {
    
    
       Scanner input = new Scanner (System.in);
       private String kodeTransaksi;
       private String pin;
       private String tanggal;
       static int seratus;
       static int lima;
       static int dua;
       static int a;
       static int kosong;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setKosong(int kosong) {
        this.kosong = kosong;
    }

    public int getKosong() {
        return kosong;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
    
    public void setKodeTransaksi(String kodeTransaksi) {
        this.kodeTransaksi = kodeTransaksi;
    }

   
    public String getKodeTransaksi() {
        return kodeTransaksi;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    public void keluarkanUang(){
       System.out.println("Masukkan Kode PIN anda :");
       setKodeTransaksi(input.nextLine());
       System.out.println("Berapa uang yang ingin anda ambil : ");
       setA(input.nextInt()); 
       a = getA();
    }
    

    public void hitung() {
       
        if (a >100) {
            a = a - 100;
            a = seratus++;
            hitung();
        } else if (a >= 50) {
            a = a - 50;
            a = lima++;
            hitung();

        } else if (a != 0) {
            a = kosong;
            System.out.println("Maaf Nominal yang anda minta tidak dapat diproses" +kosong);

        } else {
            System.out.println("Pecahan seratus = " + seratus);
            System.out.println("Pecahan lima puluh = " +lima);
        }

    }
}


