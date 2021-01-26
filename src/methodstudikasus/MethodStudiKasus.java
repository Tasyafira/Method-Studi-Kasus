/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodstudikasus;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class MethodStudiKasus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PenjualanBarang hai = new PenjualanBarang();
        
        hai.Toko();
        hai.Identitas();
        hai.Daftar();
        hai.Pilihan();
        hai.Ucapan();
        
        
        IdentitasDiri halo = new IdentitasDiri(); 
        
        String nama = halo.Nama();
        System.out.println(nama);
        
        int nik = halo.NIK();
        System.out.println(nik);
        
        String ttl = halo.TTL();
        System.out.println(ttl);
        
        String alamat = halo.Alamat();
        System.out.println(alamat);
        
        String email = halo.Email();
        System.out.println(email);
        
        String no = halo.No();
        //System.out.println(no);
        
        PenyewaanBarang.ucapan();
        System.out.println("\n");
        Identitas();
        PenyewaanBarang.Daftar();
        Pilihan();
    }
    
    static void Identitas(){
        //Memasukkan Identitas diri
        Scanner input = new Scanner(System.in);
        String nama, alamat, hp;
        int ktp;
        System.out.print("Nama Lengkap : ");
        nama = input.nextLine();
        System.out.print("Alamat       : ");
        alamat = input.nextLine();
        System.out.print("Nomer HP     : ");
        hp = input.nextLine();
        System.out.print("No KTP       : ");
        ktp = input.nextInt();
        
        System.out.println("\n");
    }
    
    static void Pilihan(){
        Scanner input = new Scanner(System.in);
        int  lamaSewa, jumlah, total, uang, kembalian;
        int harga1 = 300000,  
            harga2 = 285000,  
            harga3 = 195000;
        System.out.print("Masukkan Kode Laptop : ");
        int kode = input.nextInt();
        switch(kode){
            case 1 :
                System.out.println("Laptop yang disewa : Asus Zenbook Series");
                System.out.println("Harga sewa perhari : Rp. "+harga1);
                System.out.print("Lama Sewa : ");
                lamaSewa = input.nextInt();
                System.out.print("Jumlah Laptop : ");
                jumlah = input.nextInt();
                total = harga1*lamaSewa*jumlah;
                System.out.println("Total : Rp. "+total);
                System.out.print("Nominal uang : Rp ");
                uang= input.nextInt();
                if (uang == total){
                    System.out.print("Uang Anda Pas ");
                }else if (uang >= total){
                    kembalian = uang - total;
                    System.out.print("Kembalian : "+kembalian);
                }else if (uang <= total){
                    System.out.print("Uang Anda Kurang");
                }
                
                break;
            
            case 2 :
                System.out.println("Laptop yang disewa : Macbook Pro (2020)");
                System.out.println("Harga sewa perhari : Rp. "+harga2);
                System.out.print("Lama Sewa : ");
                lamaSewa = input.nextInt();
                System.out.print("Jumlah Laptop : ");
                jumlah = input.nextInt();
                total = harga2*lamaSewa*jumlah;
                System.out.println("Total : "+total);
                System.out.print("Nominal uang : Rp ");
                uang= input.nextInt();
                if (uang == total){
                    System.out.print("Uang Anda Pas ");
                }else if (uang >= total){
                    kembalian = uang - total;
                    System.out.print("Kembalian : "+kembalian);
                }else if (uang <= total){
                    System.out.print("Uang Anda Kurang");
                }
                break;
            
            case 3 :
                System.out.println("Laptop yang disewa : Lenovo Legion Y540 15");
                System.out.println("Harga sewa perhari : Rp. "+harga3);
                System.out.print("Lama Sewa : ");
                lamaSewa = input.nextInt();
                System.out.print("Jumlah Laptop : ");
                jumlah = input.nextInt();
                total = harga3*lamaSewa*jumlah;
                System.out.println("Total : "+total);
                System.out.print("Nominal uang : Rp ");
                uang = input.nextInt();
                if (uang == total){
                    System.out.print("Uang Anda Pas ");
                }else if (uang >= total){
                    kembalian = uang - total;
                    System.out.print("Kembalian : "+kembalian);
                }else if (uang <= total){
                    System.out.print("Uang Anda Kurang");
                }
                break;
            
            default:
                System.out.println("Maaf, Kode Yang Anda Masukkan Tidak Tersedia");
                break;
        }
        System.out.println("\n");
        System.out.println("        Terima Kasih Sudah Berkunjung        ");
        System.out.println("     Harap Membawa Nota Saat Pengembalian    ");
        
    
    }
    }
   
