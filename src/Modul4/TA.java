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
public class TA extends Buku {
        int NIM;
	String abstrak;

	public void setNIM(int nIM) {
		NIM = nIM;
	}

	public void setAbstrak(String abstrak) {
		this.abstrak = abstrak;
	}

	public int getNIM() {
		return NIM;
	}

	public String getAbstrak() {
		return abstrak;
	}

	@Override
	String katalog() {
		super.setJudul("Harry Potter");
		super.setPenulis("Bayu");
		super.setJmlhlm(900);
		this.setNIM(145);
		this.setAbstrak("Buku");
		System.out.println("Katalog TA");
		System.out.println("==============");
		System.out.println("Judul \t\t: " + super.getJudul());
		System.out.println("Penulis \t: " + super.getPenulis());
		System.out.println("Jumlah Halaman \t: " + super.getJmlhlm());
		System.out.println("Nim \t\t: " + this.getNIM());
		System.out.println("Abstrak \t: " + this.getAbstrak());
		System.out.println("-------------------------------------------------");
		return null;

	}
    
}
