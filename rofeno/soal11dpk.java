class Hewan {
    void suara() {
        System.out.println("...");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meong!");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Guk guk!");
    }
}

class Sapi extends Hewan {
    @Override
    void suara() {
        System.out.println("Mooo!");
    }
}

public class soal11dpk {
    public static void main(String[] args) {
        Hewan[] daftar = { new Kucing(), new Anjing(), new Sapi() };
        
        for (Hewan h : daftar) {
            h.suara();
        }
    }
}
 
// Meskipun variabel referensinya bertipe 'Hewan', Java akan memanggil method 'suara()' yang sebenarnya 
// dimiliki oleh objek aslinya (Kucing, Anjing, atau Sapi) saat program berjalan (runtime).