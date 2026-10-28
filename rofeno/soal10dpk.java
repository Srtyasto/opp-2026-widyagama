class Menu {
    private String nama;
    private int harga;

    public Menu(String nama, int harga) {
        this.nama = nama;
        
        setHarga(harga); 
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    
    public void setHarga(int harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("Error: Harga harus lebih dari 0!");
            this.harga = 0; 
        }
    }

    
    public void tampilMenu() {
        System.out.println("[" + nama + " - Rp" + harga + "]");
    }

}
class Makanan extends Menu {
    private String porsi;

    public Makanan(String nama, int harga, String porsi) {
        super(nama, harga); 
        this.porsi = porsi;
    }

    public String getPorsi() {
        return porsi;
    }

    public void setPorsi(String porsi) {
        this.porsi = porsi;
    }

    
    @Override
    public void tampilMenu() {
        System.out.println("[MAKANAN] " + getNama() + " - Rp" + getHarga() + " (Porsi: " + porsi + ")");
    }
}


class Minuman extends Menu {
    private String ukuran;

    public Minuman(String nama, int harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    
    @Override
    public void tampilMenu() {
        System.out.println("[MINUMAN] " + getNama() + " - Rp" + getHarga() + " (Ukuran: " + ukuran + ")");
    }
}


public class soal10dpk {
    public static void main(String[] args) {
        System.out.println("=== DAFTAR MENU ===");

        
        Makanan nasiGoreng = new Makanan("Nasi Goreng", 15000, "Besar");
        Minuman esTeh = new Minuman("Es Teh", 5000, "Large");

        
        nasiGoreng.tampilMenu();
        esTeh.tampilMenu();

        System.out.println("-------------------");

        
        int totalHarga = nasiGoreng.getHarga() + esTeh.getHarga();
        System.out.println("Total harga: Rp" + totalHarga);
    }
}
