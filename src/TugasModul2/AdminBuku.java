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

public class AdminBuku {
     Buku [] mybook = new Buku [5];
        int x = 0 ;
      
    public void insertDataBuku(){
      
        mybook[0]= new Buku();
        mybook[1]= new Buku();
        mybook[2]= new Buku();
        mybook[3]= new Buku();
        mybook[4]= new Buku();
        
        mybook[0].setJudul ("Look For Love");
        mybook[1].setJudul ("Harry Potter");
        mybook[2].setJudul ("Da Vinci Code");
        mybook[3].setJudul ("Fifty Shades Of Grey");
        mybook[4].setJudul ("A Clokwork Orange");
        mybook[0].setJumlahhalaman("551");
        mybook[1].setJumlahhalaman("989");
        mybook[2].setJumlahhalaman("654");
        mybook[3].setJumlahhalaman("789");
        mybook[4].setJumlahhalaman("590");
        mybook[0].setPenulis("Belli K.G");
        mybook[1].setPenulis("J.K. Rowling");
        mybook[2].setPenulis("Brown");
        mybook[3].setPenulis("E.L.James");
        mybook[4].setPenulis("Anthony Burgress");
      
        }
        public void cetakDataBUku(){
              while(x<5){
            System.out.print("Title : ");
            System.out.println(mybook[x].getJudul());
            System.out.println(mybook[x].getJumlahhalaman());
            System.out.print("By  ");
            System.out.println(mybook[x].getPenulis());
            x = x+1;
            
        }
        
    }
    
    
}
