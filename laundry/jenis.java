/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;
import java.util.ArrayList;
public class jenis {
    
    private ArrayList<String> jenis = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();
    
    public jenis(){
        this.jenis.add("Pakaian");
        this.harga.add(5000);
        this.durasi.add(5);
        
        this.jenis.add("Selimut");
        this.harga.add(6000);
        this.durasi.add(4);
        
        this.jenis.add("Boneka");
        this.harga.add(7000);
        this.durasi.add(5);
    }
    
    public int getJmlLaundry(){
        return this.jenis.size();
    }
    public void setJenis(String jenis){
        this.jenis.add(jenis);
    }
    public String getJenis(int idJenis){
        return this.jenis.get(idJenis);
    }
    
    public void setDurasi(int durasi){
        this.durasi.add(durasi);
    }
    public int getDurasi(int idJenis){
        return this.durasi.get(idJenis);
    }
    public void editDurasi(int idJenis, int durasi){
        this.durasi.set(idJenis, durasi);
    }
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    public int getHarga(int idJenis){
        return this.harga.get(idJenis);
    }
    
}