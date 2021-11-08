/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;
public class laporan {
    
    public void laporan(jenis jenis){
        int x = jenis.getJmlLaundry();
        
        System.out.println();
        System.out.println("Tabel Jenis Laundry");
        System.out.println();
        System.out.println("Jenis \tDurasi \tHarga");
        for(int i = 0; i < x; i++){
            System.out.println(jenis.getJenis(i)+"\t"+jenis.getDurasi(i)+"\t"+jenis.getHarga(i));
        }
    }
    public void laporan(client client){
        int x = client.getJmlClient();
        
        System.out.println("============================");
        System.out.println("Tabel Client");
        System.out.println();
        System.out.println("Nama \tAlamat \t\tTelepon \tSaldo");
        for(int i = 0; i < x; i++){
            System.out.println(client.getNama(i)+"\t"+client.getAlamat(i)+"\t"+client.getTelepon(i)+"\t"+client.getSaldo(i));
        }
    }
    public void laporan(transaksi transaksi, jenis jenis){
        int x = transaksi.getJmlTransaksi();
        
        System.out.println("============================");
        System.out.println("Laporan Transaksi");
        System.out.println();
        System.out.println("Jenis \tQty \tHarga \tJumlah");
        
        int total=0;
        for(int i = 0; i < x; i++){
            int jumlah = transaksi.getBanyaknya(i)*jenis.getHarga(transaksi.getIdJenis(i));
            total+=jumlah;
            
            System.out.println(jenis.getJenis(transaksi.getIdJenis(i))+"\t"+transaksi.getBanyaknya(i)+"\t"+jenis.getHarga(transaksi.getIdJenis(i))+"\t"+ jumlah);
        }
        System.out.println("Total Omset = "+total);
    }
}

