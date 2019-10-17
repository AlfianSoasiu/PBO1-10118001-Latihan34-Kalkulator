import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * Nama      : Alfian Soasiu
 * Kelas     : PBO1
 * NIM       : 10118001
 * Deskripsi : Memanggil subclass kalkulator
 */
public class prgmkalkulator {
 
    public static void main(String[] args) {
        
		Kalkulator kalkulator = new Kalkulator();
		System.out.println("===Aplikasi Kalkulator Bilangan===");
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan Angka ke-1 : ");
		kalkulator.value1 = sc.nextDouble();
		System.out.print("Masukkan Angka ke-2 : ");
		kalkulator.value2 = sc.nextDouble();
		System.out.println("\nHasil Pertambahan : " + kalkulator.tambahBilangan());
		System.out.println("Hasil Pengurangan : " + kalkulator.kurangBilangan());
		System.out.println("Hasil Perkalian : " + kalkulator.kaliBilangan());
		System.out.println("Hasil Pembagian : " + kalkulator.bagiBilangan());
		System.out.println("Hasil Sisa : " + kalkulator.sisaBilangan());
	}
	
}
