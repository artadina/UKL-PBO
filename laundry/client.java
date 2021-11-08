/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;
import java.util.ArrayList;

public class client implements user{
    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
    
    public client(){
        this.namaClient.add("dina");
        this.alamat.add("sawojajar");
        this.telepon.add("08123456666");
        this.saldo.add(100000);
        
        this.namaClient.add("Septia");
        this.alamat.add("bululawang");
        this.telepon.add("08122233344");
        this.saldo.add(200000);
    }
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    public int getSaldo(int idClient){
        return this.saldo.get(idClient);
    }
    public void editSaldo(int idClient, int saldo){
        this.saldo.set(idClient, saldo);;
    }
    public int getJmlClient(){
        return this.saldo.size();
    }
    
    @Override
    public void setNama(String namaClient){
        this.namaClient.add(namaClient);
    }
    @Override
    public void setAlamat(String alamat){
        this.alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon){
        this.telepon.add(telepon);
    }
    @Override 
    public String getNama(int idClient){
        return this.namaClient.get(idClient);
    }
    @Override
    public String getAlamat(int idClient){
        return this.alamat.get(idClient);
    }
    @Override 
    public String getTelepon(int idClient){
        return this.telepon.get(idClient);
    }
}
