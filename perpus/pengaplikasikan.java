/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpus;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class pengaplikasikan {
    public static void main(String[] args) {
       Scanner myObj = new Scanner(System.in);
       
       peminjaman pj = new peminjaman();
       buku bk = new buku();
       siswa sw = new siswa();
       petugas pt = new petugas();
       laporan lp = new laporan();
       
       System.out.println("Selamat datang di Perpustakaan");
       System.out.println("Ketik 1 untuk menampilkan tabel siswa");
       System.out.println("Ketik 2 untuk menampilkan tabel buku");
       System.out.println("Ketik 3 untuk meminjam/mengembalikan buku");
       System.out.println("Ketik 4 untuk menampilkan laporan peminjaman");
       System.out.println("Ketik 0 untuk keluar dari program");
       
       int pilih;
       do{
           System.out.print("Ketikkan angka untuk memilih opsi : ");
           pilih = myObj.nextInt();
           if (pilih == 1){
               lp.laporan(sw);
           } else if (pilih == 2){
               lp.laporan(bk);
           } else if (pilih == 3){
               pj.peminjaman(sw, pt, bk, lp, pj);
           } else if (pilih == 4){
               lp.laporan(pj, bk);
               lp.laporan(sw);
               lp.laporan(bk);
           }
       } while (pilih != 0);
}
}
