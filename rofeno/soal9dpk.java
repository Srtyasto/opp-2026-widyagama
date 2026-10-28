class Kalkulator {

    
    public int tambah(int a, int b) {
        return a + b;
    }


    public int tambah(int a, int b, int c) {
        return a + b + c;
    }

    
    public double tambah(double a, double b) {
        return a + b;
    }
}


public class soal9dpk {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();
        
        
        System.out.println(k.tambah(2, 3));
        
    
        System.out.println(k.tambah(1, 2, 3));
        
        
        System.out.println(k.tambah(1.5, 2.5));
    }
}