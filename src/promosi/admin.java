/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promosi;
import javax.swing.JOptionPane;
/**
 *
 * @author acer
 */
public class admin {
    
    //field atau variable global
    String id_admin;
    String nama_admin;
    String username;
    String password;
    private String getPassword;
    
    // overload contructor lebih dari 1
    public admin(){
    }//contructor 1
    
    public admin(String id_admin, String nama_admin, String username,String password){
        this.id_admin = id_admin;
        this.nama_admin = nama_admin;
        this.username = username;
        this.password = password;
    } //contructor 2
    
    // method
    public void setId_admin(String id_admin, String nama_admin, String username, String password){
        this.id_admin=id_admin;
        this.nama_admin=nama_admin;
        this.username=username;
        this.password=password;
    }  

    
    //set dan get
    public String getId_admin() {
        return id_admin;
    }

    public void setId_admin(String id_admin) {
        this.id_admin = id_admin;
    }

    public String getNama_admin() {
        return nama_admin;
    }

    public void setNama_admin(String nama_admin) {
        this.nama_admin = nama_admin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void infoAdmin(){
        String pesan ="ID Admin :"+getId_admin()+"\n Nama Admin :"+
                getNama_admin()+"\n Username :"+getUsername()+"\n Password :"+getPassword;
        
        
        JOptionPane.showMessageDialog(null, pesan);
    }
}
