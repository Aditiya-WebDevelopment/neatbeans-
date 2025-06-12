/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promosi;

/**
 *
 * @author acer
 */
public class promosi {
    String id_promosi, judul_promosi, priode, keterangan;
    
    public promosi (){
    }
    
    public promosi (String id_promosi, String judul_promosi, String priode, String keterangan){
        this.id_promosi = id_promosi;
        this.judul_promosi = judul_promosi;
        this.priode = priode;
        this.keterangan = keterangan;
    }
    
    // method
    public void setId_promosi (String id_promosi, String judul_promosi, String priode, String keterangan){
        this.id_promosi = id_promosi;
        this.judul_promosi = judul_promosi;
        this.priode = priode;
        this.keterangan = keterangan;
    }
    
    // getter dan setter
    public String getId_promosi (){
        return id_promosi;
    }
    
    public void setId_promosi(String id_promosi){
        this.id_promosi = id_promosi;
    }
    
    public String getJudul_promosi (){
        return judul_promosi;
    }
    
    public void setJudul_promosi(String judul_promosi){
        this.judul_promosi = judul_promosi;
    }
    
    public String getPriode (){
        return priode;
    }
    
    public void setPriode (String priode){
        this.priode = priode;
    }
    
    public String getKeterangan(){
        return keterangan;
    }
    
    public void setKeterangan (String keterangan){
        this.keterangan = keterangan;
    }
    

}


