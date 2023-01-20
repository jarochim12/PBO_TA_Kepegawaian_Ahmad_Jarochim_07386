package kepegawaian.pegawaiControler;

import kepegawaian.pegawai.Pegawai;
import java.util.*;
public class ArraylistPegawai {
    
    ArrayList<Pegawai> data = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int noId;
    String name, alamat, ttl, jabatan, Telepon;
    
 
    
    public void isidata(){
        System.out.print("Masukan Id : ");
        noId = input.nextInt();
        System.out.print("Masukan nama : ");
        name = input.next();
        System.out.print("Masukan Alamat : ");
        alamat = input.next();
        System.out.print("Masukan Tempat Tangga Lahir : ");
        ttl = input.next();
        System.out.print("Masukan Jabatan : ");
        System.out.print("");
        jabatan = input.next();
        System.out.print("Masukan No Telfon : ");
        Telepon = input.next();
        System.out.println("");
        data.add(new Pegawai(noId, name, alamat, ttl, jabatan, Telepon));
    }
    
    public void tampildata(){
        System.out.println("Data Karyawan : ");
        System.out.println("");
        for (Pegawai item:data){
            System.out.println("No. Id : "+item.getId());
            System.out.println("nama : "+item.getNama());
            System.out.println("Alamat : "+item.getAlamat());
            System.out.println("Tempat Tanggal Lahir : "+item.getLahir());
            System.out.println("Jabatan : "+item.getJabatan());
            System.out.println("No Telephone : "+item.getTelp());
            System.out.println("");
            
        
                 }
        
    }
    
    public void hapusdata(){
        System.out.print("Masukan Id karyawan yang ingin dihapus : ");
        int idkar = input.nextInt();
        data.removeIf(item -> item.getId() == idkar);
        System.out.println("");
    }
    
    public void editdata(){
        System.out.println("Masukan Urutan Data ke berapa yang ingin di update : ");
        int index = input.nextInt();
        for (Pegawai item : data) {
                System.out.print("Masukan Id : ");
                noId = input.nextInt();
                System.out.print("Masukan nama : ");
                name = input.next();
                System.out.print("Masukan Alamat : ");
                alamat = input.next();
                System.out.print("Masukan Tempat Tangga Lahir : ");
                ttl = input.next();
                System.out.print("Masukan Jabatan : ");
                jabatan = input.next();
                System.out.print("Masukan No Telfon : ");
                Telepon = input.next();
                System.out.println("");
                data.set(index, item);
        }
    }
    
}