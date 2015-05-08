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

public class Nomor1 {

    public static void main(String[] Tugas) {
        int a;
        int b;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan Angka pertama : ");
        a = inputan.nextInt();
        System.out.print("Masukkan kata kedua : ");
        b = inputan.nextInt();
        pengkondisian(a, b);

    }

    public static void pengkondisian(int a, int b) {
        if (a < b) {
            System.out.println("Angka kedua lebih besar dari angka pertama");
        } else if (b < a) {
            System.out.println("Angka pertama lebih besar daripada angka kedua");
        }

    }
}
