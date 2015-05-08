/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasModul2;

/**
 *
 * @author Belli
 */
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
public class ATMBankDamai {
    private int pin;
    private int nominal;
    static int a;
    static int seratus;
    static int limapuluh;
    static int duapuluh;
    Scanner input;

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
    
    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }
    public void insertdatanasabah() {
        //ATMBankSukses ATM = new ATMBankSukses();
        input = new Scanner(System.in);
        System.out.print("Masukkan Pin : ");
        setPin(input.nextInt());
        if(getPin() == 1234){
        System.out.print("Masukkan Nominal : ");
        setNominal(input.nextInt());
        a = getNominal();
        }else{
            System.out.println("Pin Anda Salah");
            insertdatanasabah();
        }
        
    }
    public void hitung() {
        if (a > 50000) {
            a = a - 50000;
            seratus++;
            hitung();
        } else if (a > 20000) {
            a = a - 20000;
            limapuluh++;
            hitung();
        } else if (a >= 5000) {
            a = a - 5000;
            duapuluh++;
            hitung();
        } else if (a != 0) {
            System.out.println("data yang anda masukan salah");
        }
        else {
        System.out.println("Jumlah Pecahan Seratus Ribu = "+seratus);
        System.out.println("Jumlah Pecahan Lima Puluh Ribu = "+limapuluh);
        System.out.println("Jumlah Pecahan Dua Puluh Ribu = "+duapuluh);
        }
    }
    public void Tanggal(){
        Calendar cal = Calendar.getInstance();
        
        SimpleDateFormat contoh4 = new SimpleDateFormat("EEEE, d MMMM yyyy");
        SimpleDateFormat contoh5 = new SimpleDateFormat("HH:mm:ss");
        
        String Tanggal4 = contoh4.format(cal.getTime());
        String Tanggal5 = contoh5.format(cal.getTime());
        
        System.out.println(Tanggal4);
        System.out.println(Tanggal5);
    }

    
}
