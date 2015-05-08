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
public class Test {
    public static void main(String[] args) {
        Buku coba = new Buku() {

            @Override
            String katalog() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        coba.katalog();
    }
}
