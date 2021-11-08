/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lelang;
import java.util.ArrayList;

public class petugas extends user{

    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public void doYourJob(barang barang){
        System.out.print("Nama Barang : ");
        barang.addNamaBarang();
        System.out.print("Harga Awal Barang : ");
        barang.addHargaAwal();
        barang.setStatus(true);
    }

    public petugas(String nama, String alamat, String telepon){
        setNama(nama);
        setAlamat(alamat);
        setTelepon(telepon);
    }

    @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }

    @Override
    public void setAlamat(String Alamat) {
        this.alamat.add(Alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int ID) {
        return namaPetugas.get(ID);
    }

    @Override
    public String getAlamat(int ID) {
        return alamat.get(ID);
    }

    @Override
    public String getTelepon(int ID) {
        return alamat.get(ID);
    }
}