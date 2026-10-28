class Barang {
    String nama;
    int harga;
    int stok;

    public Barang(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    
    void beli(int jumlah) {
        System.out.println("Beli " + jumlah + " " + nama + "...");
        
        
        if (jumlah <= stok) {
            stok -= jumlah; 
            System.out.println("Stok " + nama + " sekarang: " + stok);
        } else {
            System.out.println("Stok tidak cukup!");
        }
        System.out.println(); 
    }

    
    void info() {
        System.out.println("=== INFO BARANG ===");
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp" + String.format("%,d", harga).replace(',', '.'));
        System.out.println("Stok: " + stok);
        System.out.println();
    }
}

public class soal5dpk {
    public static void main(String[] args) {
        
        
        Barang barang1 = new Barang("AA-12 Shotgun", 18000000, 5);
        Barang barang2 = new Barang("Fried Chicken spicy", 12000, 15);

        
        barang1.info(); 
        barang1.beli(8); 
        barang1.beli(3); 
        
        
        barang2.info(); 
    }
}