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
import java.util.Scanner;
public class BukuTeks extends Buku implements Administrasi {
    	String penerbit;
	int tgl_pin, tgl_kem, bln_pin, bln_kem, hitung, Denda;
	Scanner input = new Scanner(System.in);

	public void setPenerbit(String penerbit) {
		this.penerbit = penerbit;
	}

	public String getPenerbit() {
		return penerbit;
	}

	@Override
	public void tglpinjam() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hitungdenda() {
		System.out.println("");
		System.out.print("Masukkan tanggal pinjam \t: ");
		tgl_pin = input.nextInt();
		System.out.print("Masukkan bulan pinjam \t\t: ");
		bln_pin = input.nextInt();
		System.out.print("Masukkan tanggal kembali \t: ");
		tgl_kem = input.nextInt();
		System.out.print("Masukkan bulan kembali \t\t: ");
		bln_kem = input.nextInt();
		Denda = tgl_kem - tgl_pin;
                if(Denda > 3)
                    hitung = Denda * 1000;
		System.out.println("-------------------------------------------------");
		System.out.println("Denda \t\t\t\t: " + hitung + " rupiah");
                
	}

	@Override
	String katalog() {
		super.setJudul("Harry Potter");
		super.setPenulis("Bayu");
		super.setJmlhlm(900);
		this.setPenerbit("UMM");
		System.out.println("Katalog BukuTeks");
		System.out.println("==============");
		System.out.println("Judul \t\t: " + super.getJudul());
		System.out.println("Penulis \t: " + super.getPenulis());
		System.out.println("Jumlah Halaman \t: " + super.getJmlhlm());
		System.out.println("Penerbit \t: " + this.getPenerbit());
		return null;
	}
}
