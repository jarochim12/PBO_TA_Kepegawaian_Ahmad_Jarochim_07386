
package kepegawaian.MainView;

import java.util.Scanner;
import kepegawaian.gajiEntity.Gaji;
import kepegawaian.gajiEntity.Login;
import kepegawaian.pegawaiControler.ArraylistPegawai;

/**
 *
 * @author msi pc
 */
public class Mainclass {
    public static void main(String [] args) {
       ArraylistPegawai data = new ArraylistPegawai();
       Gaji gaji = new Gaji(); 
       Login masuk = new Login();
       Scanner input = new Scanner(System.in);
    
    String usr , pas;
        System.out.println("=========Login Pegawai==========");
        System.out.print("Masukan Username : ");
        usr = input.nextLine();
        System.out.print("Masukan Pasword : ");
        pas = input.nextLine();
    
        if(usr.equals(masuk.getUsername()) && pas.equals(masuk.getPass()))
        {
            System.out.println("Selamat Datang");
        }else {
            System.out.println("Username atau Pasword salah");
        }   
    int pilihan;
    char ulang;
     
    do {
      System.out.println("##  Daftar Pilihan  ##");
      System.out.println("============================");
      System.out.println("1. Tampilkan Data Karyawan ");
      System.out.println("2. Tambah Data Karyawan");
      System.out.println("3. Edit Data Karyawan");
      System.out.println("4. Hapus Data Karyawan");
      System.out.println("5. Hitung Gaji Karyawan");
       
      System.out.print("Pilihan anda: ");
      pilihan = input.nextInt();
    
      switch(pilihan){
        case 1:
          System.out.println("Anda memilih Tampilkan Data Pegawai");
          data.tampildata();
          break;
        case 2:
          System.out.println("Anda memilih Tambah Data Pegawai");
          data.isidata();
          System.out.println("Data Berhasi Ditambah");
          break;
        case 3:
          System.out.println("Anda memilih Edit Data Pegawai");
          data.editdata();
            System.out.println("Data Berhasil Di Update");
          break;
        case 4:
          System.out.println("Anda memilih Hapus Data Pegawai");
          data.hapusdata();
            System.out.println("Data Berhasil Dihapus");
          break;
        case 5:
          System.out.println("Anda memilih Hitung Gaji Pegawai");
          Gaji.Menugaji();
          break;
        default:
          System.out.println("Menu Ini tidak tersedia");
      }
    
      System.out.println();
    
      System.out.print("Apakah Anda Ingin memilih menu lain (y/t)? : ");
      ulang = input.next().charAt(0);
       
      System.out.println();
    }
    while (ulang!= 't');
    
    System.out.println("Terimakasih...");
    }
}

