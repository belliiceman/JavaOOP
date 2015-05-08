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
abstract public class Buku {
        String judul;
	String penulis;
	int jmlhlm;

	public void setJudul(String judul) {
		this.judul = judul;
	}

	public void setPenulis(String penulis) {
		this.penulis = penulis;
	}

	public void setJmlhlm(int jmlhlm) {
		this.jmlhlm = jmlhlm;
	}

	public String getJudul() {
		return judul;
	}

	public String getPenulis() {
		return penulis;
	}

	public int getJmlhlm() {
		return jmlhlm;
	}

	abstract String katalog();
    
    
    
}
