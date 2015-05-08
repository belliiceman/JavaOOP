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
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class MesinBank {

    ATMBank ATM = new ATMBank();
    Scanner input = new Scanner(System.in);
     
    public void Tanggal(){
        Calendar cal = Calendar.getInstance();
        
        SimpleDateFormat baru = new SimpleDateFormat("EEEE, d MMMM yyyy");
        SimpleDateFormat baru1 = new SimpleDateFormat("HH:mm:ss");
        
        String Tanggal = baru.format(cal.getTime());
        String Waktu = baru1.format(cal.getTime());
        
        System.out.println(Tanggal);
        System.out.println(Waktu);
    }

    public void input() {

        System.out.print("Masukkan Pin : ");
        ATM.setPin(input.nextInt());
        if (ATM.getPin() == 12345 ){
        System.out.print("Tanggal : ");
        ATM.setTanggal(input.nextInt());
        System.out.print("Masukkan Nominal : ");
        ATM.setNominal(input.nextInt());
        ATM.a = ATM.getNominal();  
        }else{
           input(); 
        }
        
    }

    public void hitung() {

        if (ATM.a > 100) {
            ATM.a = ATM.a - 100;
            ATM.seratus++;
            //  System.out.println(" "+ATM.a);
            hitung();
        } else if (ATM.a >= 50) {
            ATM.a = ATM.a - 50;
            ATM.limapuluh++;
            //System.out.println(" "+ATM.a);
            hitung();
        } else if (ATM.a >= 20) {
            ATM.a = ATM.a - 20;
            ATM.duapuluh++;
            //System.out.println(" "+ATM.a);
            hitung();
        }else if (ATM.a != 0) {
            ATM.a = ATM.kosong;
           System.out.println(" Maaf nominal yang anda masukan salah Tidak bersisa = "+ATM.kosong);
        }else {
            System.out.println("Jumlah Pecahan Ratusan = " + ATM.seratus);
            System.out.println("Jumlah Pecahan Lima puluh ribu = " + ATM.limapuluh);
            System.out.println("Jumlah Pecahan Dua  = " + ATM.duapuluh);
            
        }

    }
}
