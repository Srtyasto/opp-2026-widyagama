import java.util.ArrayList;

interface BisaDipinjam {
    void pinjam();
    void kembalikan();
}

abstract class Item {
    private String judul;

    public Item(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public abstract void info();
}

class Buku extends Item implements BisaDipinjam {
    private String penulis;

    public Buku(String judul, String penulis) {
        super(judul);
        this.penulis = penulis;
    }

    @Override
    public void info() {
        System.out.println("[BUKU] " + getJudul() + " - " + penulis);
    }

    @Override
    public void pinjam() {
        System.out.println(getJudul() + " berhasil dipinjam!");
    }

    @Override
    public void kembalikan() {
        System.out.println(getJudul() + " berhasil dikembalikan!");
    }
}

class Majalah extends Item implements BisaDipinjam {
    private String edisi;

    public Majalah(String judul, String edisi) {
        super(judul);
        this.edisi = edisi;
    }

    @Override
    public void info() {
        System.out.println("[MAJALAH] " + getJudul() + " - Edisi " + edisi);
    }

    @Override
    public void pinjam() {
        System.out.println(getJudul() + " berhasil dipinjam!");
    }

    @Override
    public void kembalikan() {
        System.out.println(getJudul() + " berhasil dikembalikan!");
    }
}

public class soal15dpk {
    public static void main(String[] args) {
        ArrayList<Item> daftarPustaka = new ArrayList<>();
        
        daftarPustaka.add(new Buku("Laskar Pelangi", "Andrea Hirata"));
        daftarPustaka.add(new Buku("Bumi Manusia", "Pramoedya"));
        daftarPustaka.add(new Majalah("Tempo", "2024"));

        System.out.println("=== DAFTAR PERPUSTAKAAN ===");
        for (Item item : daftarPustaka) {
            item.info();
        }

        System.out.println();
        
        Item itemDipinjam = daftarPustaka.get(0);
        System.out.println("Meminjam: " + itemDipinjam.getJudul());
        
        if (itemDipinjam instanceof BisaDipinjam) {
            ((BisaDipinjam) itemDipinjam).pinjam();
        }

        System.out.println();
        System.out.println("Total item: " + daftarPustaka.size());
    }
}
