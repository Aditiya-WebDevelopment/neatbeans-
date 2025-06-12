/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_promosi;

import promosi.*;
import promosi.admin;
import promosi.produk;
import promosi.pengunjung;
import Frame.FrameAdmin;
import Frame.FramePengunjung;

/**
 *
 * @author acer
 */
public class Tugas_promosi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        admin objKu = new admin("ID001", "Dintsy", "Admin", "Admin123");
        //objKu.setId_admin("ID001");
        //objKu.setNama_admin("Aditiya");
        //objKu.setUsername("Aditiya25__");
        //objKu.setPassword("1234");
        
        
//        System.out.println("ID :"+objKu.getId_admin());
//        System.out.println("Nama :"+objKu.getNama_admin());
//        System.out.println("Username :"+objKu.getUsername());
//        System.out.println("Password :"+objKu.getPassword());

        FrameAdmin form1 = new FrameAdmin();
        form1.setVisible(true);
        
//        produk
        produk p2 = new produk ("IP001", "Khongguan", "Khongguan.jpg", "Makanan Ringan", 55000, "Ya");
        //p2.setId_produk("IP001");
        //p2.setNama_produk("Khongguan");
        //p2.setFoto("Khonguan");
        //p2.setKategori("Makanan Ringan");
        //p2.setHarga(55000);
        //p2.setProdukTerbaik("Ya");
        
//        System.out.println("ID Produk      : " + p2.getId_produk());
//        System.out.println("Nama Produk    : " + p2.getNama_produk());
//        System.out.println("Foto           : " + p2.getFoto());
//        System.out.println("Kategori       : " + p2.getKategori());
//        System.out.println("Harga          : Rp" + p2.getHarga());
//        System.out.println("Produk Terbaik : " + p2.getProdukTerbaik());
        
//      pengunjung 
        pengunjung Mmber = new pengunjung ("0928", "Fiqri", "Jl.Perdagangan", "0813-5265-7153");
        //Mmber.setId_member("0928");
        //Mmber.setNama_member("Fiqri");
        //Mmber.setAlamat("JL.Perdagangan");
        //Mmber.setNo_telp("0813-1234-5678");
        
//        System.out.println("ID Member     : " + Mmber.getId_member());
//        System.out.println("Nama Member    : " + Mmber.getNama_member());
//        System.out.println("Alamat           : " + Mmber.getAlamat());
//        System.out.println("NO TELP       : " + Mmber.getNo_telp());

        FramePengunjung form3 = new FramePengunjung();
        form3.setVisible(true);
        
//      promosi
        promosi gaMen = new promosi ("1990", "Nitro 5", "2019", "Baik Sekali");
        //gaMen.setId_promosi("1990");
        //gaMen.setJudul_promosi("Nitro 5");
        //gaMen.setPriode("2019");
        //gaMen.setKeterangan("Baik Sekali");
        
        System.out.println("ID Promosi     : " + gaMen.getId_promosi());
        System.out.println("Judul Promosi   : " + gaMen.getJudul_promosi());
        System.out.println("Priode         : " + gaMen.getPriode());
        System.out.println("Keterangan     : " + gaMen.getKeterangan());   
    }
}