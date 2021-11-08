/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;
import java.util.ArrayList;
import java.util.Scanner;

public class transaksi {
    private ArrayList<Integer> idJenis = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    
    public void prosesTransaksi(client client, transaksi transaksi, jenis jenis){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Silahkan Laundry");
        System.out.println("Masukkan ID Client : ");
        int idClient = myObj.nextInt();
        System.out.println("Selamat datang "+client.getNama(idClient));

        int i=0;
        int temp=0;
        do{
            System.out.println("Masukkan kode jenis laundry: ");
            temp=myObj.nextInt();
            if(temp!=99){
                idJenis.add(temp);
                System.out.print(jenis.getJenis(idJenis.get(i))+" sebanyak(kg): ");
                banyak.add(myObj.nextInt());
                i++;
            }
        }while(temp!=99);
        
        System.out.println();
        System.out.println("Transaksi laundry "+client.getNama(idClient)+" sebagai berikut");
        System.out.println("Jenis \tQty \tHarga \tJumlah \t");
        
        int total=0;
        int x = idJenis.size();
        for(int j = 0; j < x; j++){
            int jumlah=banyak.get(j) * jenis.getHarga(idJenis.get(j));
            total+=jumlah;
            System.out.println(jenis.getJenis(idJenis.get(j))+"\t"+banyak.get(j)+"\t"+jenis.getHarga(idJenis.get(j))+"\t"+jumlah);
            transaksi.setTransaksi(jenis, idClient, idJenis.get(j), banyak.get(j));
        }
        
        System.out.println("Total Laundry: "+total);
        client.editSaldo(idClient, client.getSaldo(idClient)-total);
    }
    public void setTransaksi(jenis jenis, int idClient, int idJenis, int banyaknya){
        this.idClient.add(idClient);
        this.idJenis.add(idJenis);
        this.banyak.add(banyaknya);
        jenis.editDurasi(idJenis, jenis.getDurasi(idJenis)-banyaknya);
    }
    
    public int getIdJenis(int id){
        return this.idJenis.get(id);
    }
    public int getBanyaknya(int id){
        return this.banyak.get(id);
    }
    public int getIdClient(int id){
        return this.idClient.get(id);
    }
    public int getJmlTransaksi(){
        return this.idClient.size();
    }
}

