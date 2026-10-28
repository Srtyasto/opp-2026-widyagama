class Produk {
    String namaProduk;
    int harga;

    
    public Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }


    void tampilkan() {
        System.out.println("Nama Produk: " + namaProduk);
        
        System.out.println("Harga: Rp " + String.format("%,d", harga).replace(',', '.'));
    }
}

public class soal3dpk {
    public static void main(String[] args) {
        
        Produk p1 = new Produk("AA-12 Shotgun", 18000000);
        
        p1.tampilkan();
    }
}