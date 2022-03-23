package application;

import data.Lenovo;
import data.Asus;
import data.Dell;

/**
 *
 * @author sye
 */

public class Application {
    public static void main(String[] args) {
        // class lenovo
        System.out.println("== INPUT DATA LAPTOP MERK LENOVO ==");
        
        var lenovo = new Lenovo();
        
        System.out.println("\n== OUTPUT DATA LAPTOP MERK LENOVO ==");
        
        System.out.println("\nNama\t\t: " + lenovo.getName());
        System.out.println("Brand\t\t: " + lenovo.getBrand());
        System.out.println("Nama processor\t: " + lenovo.getName_pro());
        System.out.println("Jumlah core\t: " + lenovo.getCore_pro());
        System.out.println("Sistem Operasi\t: " + lenovo.getSo());
        System.out.println("Ukuran RAM\t: " + lenovo.getRam() + " GB");
        System.out.println("Jenis storage\t: " + lenovo.getStorage());
        System.out.println("Stok\t\t: " + lenovo.getStock() + " unit");
        System.out.println("Tipe Storage\t: " + lenovo.getStorage_type());
        System.out.println("Posisi Etalase\t: " + lenovo.getStorefront());
        System.out.println("Warna Laptop\t: " + lenovo.getColor());
        System.out.println("Harga Laptop\t: Rp " + lenovo.getPrice());
        System.out.println("Ukuran Harddisk\t: " + lenovo.getHarddisk() + " GB");
        
        //class asus
        System.out.println("\n\n== INPUT DATA LAPTOP MERK ASUS ==");
        
        var asus = new Asus();
        
        System.out.println("\n== OUTPUT DATA LAPTOP MERK ASUS ==");
        
        System.out.println("\nNama\t\t: " + asus.getName());
        System.out.println("Brand\t\t: " + asus.getBrand());
        System.out.println("Nama processor\t: " + asus.getName_pro());
        System.out.println("Jumlah core\t: " + asus.getCore_pro());
        System.out.println("Sistem Operasi\t: " + asus.getSo());
        System.out.println("Ukuran RAM\t: " + asus.getRam() + " GB");
        System.out.println("Jenis storage\t: " + asus.getStorage());
        System.out.println("Stok\t\t: " + asus.getStock() + " unit");
        System.out.println("Tipe Storage\t: " + asus.getStorage_type());
        System.out.println("Posisi Etalase\t: " + asus.getStorefront());
        System.out.println("Warna Laptop\t: " + asus.getColor());
        System.out.println("Harga Laptop\t: Rp " + asus.getPrice());
        System.out.println("Ukuran Harddisk\t: " + asus.getHarddisk() + " GB");
        
        //class dell
        System.out.println("\n\n== INPUT DATA LAPTOP MERK DELL ==");
        
        var dell = new Dell();
        
        System.out.println("\n== OUTPUT DATA LAPTOP MERK DELl ==");
        
        System.out.println("\nNama\t\t: " + dell.getName());
        System.out.println("Brand\t\t: " + dell.getBrand());
        System.out.println("Nama processor\t: " + dell.getName_pro());
        System.out.println("Jumlah core\t: " + dell.getCore_pro());
        System.out.println("Sistem Operasi\t: " + dell.getSo());
        System.out.println("Ukuran RAM\t: " + dell.getRam() + " GB");
        System.out.println("Jenis storage\t: " + dell.getStorage());
        System.out.println("Stok\t\t: " + dell.getStock() + " unit");
        System.out.println("Tipe Storage\t: " + dell.getStorage_type());
        System.out.println("Posisi Etalase\t: " + dell.getStorefront());
        System.out.println("Warna Laptop\t: " + dell.getColor());
        System.out.println("Harga Laptop\t: Rp " + dell.getPrice());
        System.out.println("Ukuran Harddisk\t: " + dell.getHarddisk() + " GB");
        
    }
    
}
