/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promosi;

/**
 *
 * @author acer
 */
public class produk {
    //field atau variable
    String id_produk;
    String nama_produk;
    String foto;
    String kategori;
    int harga;
    String produkterbaik;
    
    public produk (){
    } // contructor 1
    
    public produk (String id_produk){
            this.id_produk = id_produk;
    }
    
    public produk (String id_produk, String nama_produk){
            this.id_produk = id_produk;
            this.nama_produk = nama_produk;
    }
    
    public produk (String id_produk, String nama_produk, String foto){
            this.id_produk = id_produk;
            this.nama_produk = nama_produk;
            this.foto = foto;
    }
    
     public produk (String id_produk, String nama_produk, String foto, String kategori){
            this.id_produk = id_produk;
            this.nama_produk = nama_produk;
            this.foto = foto;
            this.kategori = kategori;
    }
     
     public produk (String id_produk, String nama_produk, String foto, String kategori, int harga){
            this.id_produk = id_produk;
            this.nama_produk = nama_produk;
            this.foto = foto;
            this.kategori = kategori;
            this.harga = harga;
    }
    
      public produk (String id_produk, String nama_produk, String foto, String kategori, int harga, String produkterbaik){
            this.id_produk = id_produk;
            this.nama_produk = nama_produk;
            this.foto = foto;
            this.kategori = kategori;
            this.harga = harga;
            this.produkterbaik = produkterbaik;
      }
      
      // method
      
    public void setid_produk (String id_produk, String nama_produk, String foto, String kategori, int harga, String produkterbaik){
            this.id_produk = id_produk;
            this.nama_produk = nama_produk;
            this.foto = foto;
            this.kategori = kategori;
            this.harga = harga;
            this.produkterbaik = produkterbaik;
      }
    
    // Getter dan Setter untuk masing-masing field
    public String getId_produk() {
        return id_produk;
    }

    public void setId_produk(String id_produk) {
        this.id_produk = id_produk;
    }

    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getProdukTerbaik() {
        return produkterbaik;
    }

    public void setProdukTerbaik(String produkterbaik) {
        this.produkterbaik = produkterbaik;
    }

    public void setNama_Produk(String khongguan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
