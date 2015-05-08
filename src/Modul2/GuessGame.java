/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2;

/**
 *
 * @author Belli
 */
public class GuessGame {
    Player p1;//Instance variable pemain 1
    Player p2;//Instance variable pemain 2
    Player p3;//Instance variable pemain 3

    public void startGame() {//Deklarasi method  startGame
        p1 = new Player();//Menciptakan objek dari class  player
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);

        System.out.println("Saya berfikir angkanya antara 0 dan 9.... ");
        while (true) {
            System.out.println("Angka yang harus ditebak pemain" + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();
            guessp1 = p1.number;
            System.out.println("Pemain 1 menebak " + guessp1);
            guessp2 = p2.number;
            System.out.println("Pemain 2 menebak " + guessp2);
            guessp3 = p3.number;
            System.out.println("Pemain 3 menebak " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("Pemenangnya ditemukan !");
                System.out.println("Pemain 1 berhasil menebak " + p1isRight);
                System.out.println("Pemain 2 berhasil menebak " + p2isRight);
                System.out.println("Pemain 3 berhasil menebak " + p3isRight);
                System.out.println("Permainan Selesai ");
                break;// permainan selesai maka berhenti
            } else {
                System.out.println("Pemain akan mencoba lagi");

            }
        }
    }
}
