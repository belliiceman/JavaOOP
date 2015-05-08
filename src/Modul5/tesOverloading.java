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
public class tesOverloading {
    public static void main(String[] args) {
        Overloading a = new Overloading("0001","Belli");
        System.out.println("Nama user sebelum diganti : " + a.getNama());
        a.setNama("Adam");
        System.out.println("Nama user setelah diganti : "+a.getNama());
        a.setData("0002", "Kafilla");
        a.setData("0001","Kafilla", "Malang");
        System.out.println("ID : " + a.getId());
        System.out.println("Nama User : " + a.getNama());
        System.out.println("Alamat : "+a.getAlamat());
    }
    
}
