package data;

/**
 *
 * @author sye
 */
public class Asus extends Laptop {
    
    String storage_type, storefront, color, price;
    int harddisk;
    boolean isNumber;
    
    public Asus() {
        setStorage_type();
        setStorefront();
        setColor();
        setPrice();
        setHarddisk();
    }

    public String getStorage_type() {
        return storage_type;
    }

    public void setStorage_type() {
        System.out.print("Tipe Storage\t: ");
        storage_type = input.nextLine();
    }

    public String getStorefront() {
        return storefront;
    }

    public void setStorefront() {
        getStorage_type();
        switch(storage_type){
            case "SSD M.2":
                storefront = "Best";
                break;
            case "SSD SATA":
                storefront = "Good";
                break;
            case "HDD":
                storefront = "Middle";
                break;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        System.out.print("Warna Laptop\t: ");
        color = input.nextLine();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice() {
        System.out.print("Harga Laptop\t: ");
        price = input.nextLine();
    }

    public int getHarddisk() {
        return harddisk;
    }

    public void setHarddisk() {
        do {
            System.out.print("Ukuran Harddisk\t: ");
            harddisk = input.nextInt();
            if ( harddisk < 0){
                System.out.println("--ERROR--\nTidak dapat bernilai minus, input kembali bilangan.\n");
                isNumber = false;
            } else {
                isNumber = true;
            }
        } while (!(isNumber));
    }  
}