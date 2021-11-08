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
import java.util.ArrayList;
public class siswa implements user{
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    
    public siswa(){
        this.namaSiswa.add("adi");
        this.alamat.add("sawojajar");
        this.telepon.add("0812344");
        this.status.add(false);

        this.namaSiswa.add("budi");
        this.alamat.add("bululawang");
        this.telepon.add("0812222");
        this.status.add(true);
    }
    
    public void setStatus(boolean status) {
        this.status.add(status);
    }
    
    public boolean getStatus(int idSiswa) {
        return this.status.get(idSiswa);
    }
    public void editStatus(int idStatus, boolean status) {
       this.status.set(idStatus, status);;
    }

    public int getJmlSiswa() {
        return this.namaSiswa.size();
    }

    @Override
    public void setNama(String namaSiswa) {
        this.namaSiswa.add(namaSiswa);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idSiswa) {
        return this.namaSiswa.get(idSiswa);
    }

    @Override
    public String getAlamat(int idSiswa) {
        return this.alamat.get(idSiswa);
    }

    @Override
    public String getTelepon(int idSiswa) {
        return this.telepon.get(idSiswa);
    }
}
