package data;

/**
 *
 * @author sye
 */
import java.util.Scanner;

public class Laptop {
    
    Scanner input = new Scanner(System.in);
    
    protected String name, brand, name_pro, so, storage, core_pro, ram, stock;

    public Laptop() {
        
        setName();
        setBrand();
        setName_pro();
        setCore_pro();
        setSo();
        setRam();
        setStorage();
        setStock();   
    }
    
    public Laptop(String name, String brand, String name_pro, String so, 
            String storage, String core_pro, String ram, String stock){
        
        this.name = name;
        this.brand = brand;
        this.name_pro = name_pro;
        this.so = so;
        this.storage = storage;
        this.core_pro = core_pro;
        this.ram = ram;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.print("Nama\t\t: ");
        name = input.nextLine();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand() {
        System.out.print("Brand\t\t: ");
        brand = input.nextLine();
    }

    public String getName_pro() {
        return name_pro;
    }

    public void setName_pro() {
        System.out.print("Nama processor\t: ");
        name_pro = input.nextLine();
    }

    public String getSo() {
        return so;
    }

    public void setSo() {
        System.out.print("Sistem operasi\t: ");
        so = input.nextLine();
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage() {
        System.out.print("Jenis storage\t: ");
        storage = input.nextLine();
    }

    public String getCore_pro() {
        return core_pro;
    }

    public void setCore_pro() {
        System.out.print("Jumlah core\t: ");
        core_pro = input.nextLine();
    }

    public String getRam() {
        return ram;
    }

    public void setRam() {
        System.out.print("Ukuran RAM\t: ");
        ram = input.nextLine();
    }

    public String getStock() {
        return stock;
    }

    public void setStock() {
        System.out.print("Stok\t\t: ");
        stock = input.nextLine();
    }    
}