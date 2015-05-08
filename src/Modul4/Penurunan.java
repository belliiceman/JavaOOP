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
public class Penurunan extends Inheritance {
    int Size = 90;
    public Penurunan (){
        super.bunyi();
        bunyi();
        System.out.println(super.Size);
        System.out.println(this.Size);
        this.Size = 70;
        System.out.println(this.Size);
        
    }
    public static void main(String[] args) {
        Penurunan a = new Penurunan ();
        
    }
   @Override
    public void bunyi(){
        System.out.println("Hau.... Hauuu ");
    }
}
