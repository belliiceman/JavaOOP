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
public class RegularArray {
    public static void main (String [] tes){
        
        String [] mylist = new String [2];
        String a = new String ("YEahaaa");
        mylist [0] = a;
        String b = new String ("Apaan");
        mylist [1] = b;
        int theSize = mylist.length;
        String o = mylist[1];
        mylist[1] = null;
        boolean isIn = false;
        for (String item : mylist){
            if(b.equals(item)){
                isIn = true;
                break;
            }
            
        }
        
        
    }
}
