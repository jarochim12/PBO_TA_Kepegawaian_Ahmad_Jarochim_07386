/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kepegawaian.pegawai;

/**
 *
 * @author msi pc
 */
public class Pegawai {
    String nama, alamat, lahir, jabatan, telp;
        int id;

    public Pegawai(int id, String nama, String alamat, String lahir, String jabatan, String telp) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.lahir = lahir;
        this.jabatan = jabatan;
        this.telp = telp;
    }


    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getLahir() {
        return lahir;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getTelp() {
        return telp;
    }

    public int getId() {
        return id;
    }

    
}
