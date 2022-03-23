package data;

/**
 *
 * @author sye
 */
public class LaptopApp {
    public static void main(String[] args){
       
        System.out.println("== INPUT DATA LAPTOP ==\n");
        var lap1 = new Laptop();
        var lap2 = new Laptop(lap1.name, lap1.brand, lap1.name_pro, lap1.so, lap1.storage,
                                lap1.core_pro, lap1.ram, lap1.stock);
        
        System.out.println("\n== OUTPUT DATA LAPTOP ==");
        
        System.out.println("\nNama\t\t: " + lap2.getName());
        System.out.println("Brand\t\t: " + lap2.getBrand());
        System.out.println("Nama processor\t: " + lap2.getName_pro());
        System.out.println("Jumlah core\t: " + lap2.getCore_pro());
        System.out.println("Sistem Operasi\t: " + lap2.getSo());
        System.out.println("Ukuran RAM\t: " + lap2.getRam() + " GB");
        System.out.println("Jenis storage\t: " + lap2.getStorage());
        System.out.println("Stok\t\t: " + lap2.getStock() + " unit");  
    }
}