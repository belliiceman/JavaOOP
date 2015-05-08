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
public class Buku {
   private String judul;
   private String jumlahhalaman;
   private String penulis;
    
   public String getJudul(){
       return judul;
       }
        
   public String getJumlahhalaman(){
       return jumlahhalaman;
   }         
   public String getPenulis(){
       return penulis;
   }
   public void setJudul(String newJudul){
       judul = newJudul;
    }
   public void setJumlahhalaman(String newJumlahhalaman){
       jumlahhalaman = newJumlahhalaman;
   }
   public void setPenulis(String newPenulis){
       penulis = newPenulis;
   }
}
