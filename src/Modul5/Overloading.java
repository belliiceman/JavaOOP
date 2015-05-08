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
public class Overloading {
    private String id;
    private String nama;
    private String alamat;
    
    public Overloading(String id, String nama){
        this.id = id;
        this.nama = nama;
    }
    void setData(String id,String nama){
        this.id = id;
        this.nama = nama;
    }
    void setData(String id ,String nama, String alamat){
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
}
