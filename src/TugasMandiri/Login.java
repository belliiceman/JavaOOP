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
public class Login {
   private String id;
   private String email;
   private String password;
   String getID;
   
   public String getID(){
       return id;
   }
   public void setID(String newID){
       id = newID;
   }
   public String getEmail(){
       return email;
   }
   public void setEmail(String newEmail){
       email = newEmail;
   }
   public String getPassword(){
       return password;
   }
    public void setPassword(String newPassword){
        password = newPassword;
    }
}

