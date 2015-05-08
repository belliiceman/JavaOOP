/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasMandiri;

/**
 *
 * @author Belli
 */
import java.util.Scanner;
public class Nomor2 {
    public static void main(String []test){
        int x,y;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        x = masukan.nextInt();
        for(y=1;y<=x;y++){
            System.out.println("Perulangan Ke : "+y);
        }
        
    }
}
