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
public class IdentitasDiri {
    String nama = "Tasya", 
            ttl = "22 Maret 2004", 
            alamat = "Dsn. Mulyosari, RT 02/RW 02, Ds. Bulusari, Kedungwaru, Tagung", 
            email = "tasyasyafira03@gmail.com", 
            no = "082 339 543 169";
    int nik = 346568679;
            
    String Nama(){
        System.out.print("Nama                  : ");
        return nama;
    }
    
    int NIK(){
        System.out.print("NIK                   : ");
        return nik;
    }
    
    String TTL(){
        System.out.print("Tempat Tanggal Lahir  : ");
        return ttl;
    }
    
    String Alamat(){
        System.out.print("Almat                 : ");
        return alamat;
    }
    
    String Email(){
        System.out.print("Email                 : ");
        return email;
    }
    
    String No(){
        System.out.print("No HP                 : ");
        return no;
    }
}
