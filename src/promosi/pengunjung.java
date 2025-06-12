/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promosi;

/**
 *
 * @author acer
 */
public class pengunjung {
    
    //filed atau variable global
    String id_member;
    String nama_member;
    String alamat;
    String no_telp;

    public pengunjung(){
    } //contructor 1
    
    public pengunjung(String id_member){
        this.id_member = id_member;
    }
    
    public pengunjung(String id_member, String nama_member){
        this.id_member = id_member;
        this.nama_member = nama_member;
    }
    
    public pengunjung(String id_member, String nama_member, String alamat){
        this.id_member = id_member;
        this.nama_member = nama_member;
        this.alamat = alamat;
    }
    
    public pengunjung(String id_member, String nama_member, String alamat, String no_telp){
        this.id_member = id_member;
        this.nama_member = nama_member;
        this.alamat = alamat;
        this.no_telp = no_telp;
    }
    
    //method
    public void setId_member(String id_member, String nama_member, String alamat, String no_telp){
        this.id_member = id_member;
        this.nama_member = nama_member;
        this.alamat = alamat;
        this.no_telp = no_telp;
    }
    
    // getter dan setter untuk masing masin field
    
    public String getId_member(){
        return id_member;
    }
    
    public void setId_member (String id_member){
        this.id_member = id_member;
    }
    
    public String getNama_member(){
        return nama_member;
    }
    
    public void setNama_member (String nama_member){
        this.nama_member = nama_member;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getNo_telp(){
        return no_telp;
    }
    
    public void setNo_telp (String no_telp){
        this.no_telp = no_telp;
    }
}