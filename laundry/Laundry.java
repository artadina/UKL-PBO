/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

/**
 *
 * @author MOKLET-1
 */
public class Laundry {

    public static void main(String[] args) {
        // TODO code application logic here
        client client = new client();
        petugas petugas = new petugas();
        jenis jenis = new jenis();
        transaksi transaksi = new transaksi();
        laporan laporan = new laporan();
        laporan.laporan(jenis);
        laporan.laporan(client);
        transaksi.prosesTransaksi(client, transaksi, jenis);
        laporan.laporan(transaksi, jenis);
        laporan.laporan(jenis);
        laporan.laporan(client);
    }
    
}
