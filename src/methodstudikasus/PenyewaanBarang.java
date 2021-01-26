/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodstudikasus;

/**
 *
 * @author MOKLET-1
 */
public class PenyewaanBarang {
    int ktp, harga1 = 300000, harga2 = 285000, harga3 = 95000;
    int lamaSewa, jumlah, total, uang, kembalian;
    
    static void ucapan (){
        System.out.println("<<<               JAYA ABADI              >>>");
        System.out.println("              Dunia Para Laptop              ");
    }
    
         
    static void Daftar (){
        int harga1 = 300000,  
            harga2 = 285000,  
            harga3 = 195000,
            hasil;
        //Daftar barang
        System.out.println("---------------------------------------------");
        System.out.println("|      Daftar Harga Sewa Laptop Perhari      |");
        System.out.println("---------------------------------------------");
        System.out.println("\n");
        String[] produk = {" ", " Asus Zenbook Series       ", 
                                " Macbook Pro (2020)        ", 
                                " OLenovo Legion Y540 15    "};
        
        int [] harga = {0, harga1, harga2, harga3};
        for (int i = 1; i < harga.length; i++)
            System.out.println("Kode "+i+produk[i]+"Rp. "+harga[i]);

        
        System.out.println("\n");
        System.out.println("---------------------------------------------");
    }
}
