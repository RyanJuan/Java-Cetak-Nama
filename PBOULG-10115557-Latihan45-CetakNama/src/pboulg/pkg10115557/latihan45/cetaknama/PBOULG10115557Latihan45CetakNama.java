/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg.pkg10115557.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author RyanJuan
 * NAMA              : RAYAN
 * KELAS             : PBOULG
 * NIM               : 10115557
 * Deskripsi Program : Menampilkan nama user sesuai dengan jumlah yang user inginkan
 */
public class PBOULG10115557Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Printer P = new Printer();
        Scanner scn = new Scanner(System.in);
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.printf("Masukkan nama anda : ");
        P.setNama(scn.nextLine());
        System.out.printf("Mau Cetak nama anda berapa kali ? : ");
        P.setJmlCetak(scn.nextInt());
        P.cetak(P.getNama());
        System.out.println("Hasil Cetak : ");
        P.cetak(P.getJmlCetak(),P.getNama());
    }
}
