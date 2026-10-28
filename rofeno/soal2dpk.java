class Siswa {
    String nama;
    String kelas;

    void perkenalan() {
        System.out.println("Halo, saya " + nama + " dari kelas " + kelas);
    }
}

public class soal2dpk {
    public static void main(String[] args) {
        Siswa siswa1 = new Siswa();
        siswa1.nama = "Budi";
        siswa1.kelas = "X DPK 1";
        
       
        siswa1.perkenalan(); 
    }
}