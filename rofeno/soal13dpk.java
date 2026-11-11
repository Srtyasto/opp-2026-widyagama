interface BisaTerbang {
    void terbang();
}

class Burung implements BisaTerbang {
    @Override
    public void terbang() {
        System.out.println("Burung terbang dengan sayap");
    }
}

class Pesawat implements BisaTerbang {
    @Override
    public void terbang() {
        System.out.println("Pesawat terbang dengan mesin");
    }
}

public class soal13dpk {
    public static void main(String[] args) {
        Burung burung = new Burung();
        Pesawat pesawat = new Pesawat();

        burung.terbang();
        pesawat.terbang();
    }
}
// Jawaban Bonus: 
// Perbedaan utama terletak pada "is-a" (adalah) vs "can-do" (bisa melakukan).
// Abstract class digunakan untuk hubungan hierarki yang erat (Pewarisan/Inheritance). Satu class hanya bisa mewarisi satu abstract class. Gunakan ini jika class anak memiliki kesamaan sifat dasar (misal: Sapi dan Kucing sama-sama Hewan).
// Interface digunakan untuk mendefinisikan kemampuan/kontrak perilaku. Satu class bisa mengimplementasikan banyak interface. Gunakan ini jika class yang berbeda latar belakang memiliki kemampuan yang sama (misal: Burung dan Pesawat sama-sama "BisaTerbang", padahal mereka bukan keluarga yang sama).
