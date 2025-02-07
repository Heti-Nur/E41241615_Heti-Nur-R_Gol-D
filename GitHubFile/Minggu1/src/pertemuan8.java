/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Heti
 */
import java.util.Scanner;
public class pertemuan8 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar menu makanan dan harganya
        String[] menuMakanan = {"Bakso", "Soto", "Nasi Campur", "Nasi Tahu Tek"};
        int[] hargaMakanan = {15000, 12000, 10000, 13000};

        // Daftar menu minuman dan harganya
        String[] menuMinuman = {"Es Teh", "Es Jeruk", "Teh Hangat", "Jeruk Hangat"};
        int[] hargaMinuman = {5000, 7000, 4000, 6000};

        // Menampilkan menu makanan
        System.out.println("Menu Makanan:");
        for (int i = 0; i < menuMakanan.length; i++) {
            System.out.println((i + 1) + ". " + menuMakanan[i] + " - Rp " + hargaMakanan[i]);
        }

        // Memilih makanan
        System.out.print("Pilih menu makanan (masukkan nomor): ");
        int pilihanMakanan = scanner.nextInt() - 1;

        // Menampilkan menu minuman
        System.out.println("Menu Minuman:");
        for (int i = 0; i < menuMinuman.length; i++) {
            System.out.println((i + 1) + ". " + menuMinuman[i] + " - Rp " + hargaMinuman[i]);
        }
        
         // Memilih minuman
        System.out.print("Pilih menu minuman (masukkan nomor): ");
        int pilihanMinuman = scanner.nextInt() - 1;

        // Menghitung total harga
        int totalHarga = hargaMakanan[pilihanMakanan] + hargaMinuman[pilihanMinuman];
        System.out.println("\nTotal harga yang harus dibayar: Rp " + totalHarga);

        // Input jumlah pembayaran
        int pembayaran;
        do {
            System.out.print("Masukkan jumlah pembayaran (tidak boleh kurang dari total): Rp ");
            pembayaran = scanner.nextInt();
            if (pembayaran < totalHarga) {
                System.out.println("Maaf, pembayaran tidak boleh kurang dari total harga.");
            }
        } while (pembayaran < totalHarga);

        // Hitung kembalian
        int kembalian = pembayaran - totalHarga;
        System.out.println("Kembalian: Rp " + kembalian);

        // Output sukses pembayaran
        System.out.println("Terima kasih telah berbelanja di kantin kami!");

        scanner.close();
     }
    
}

