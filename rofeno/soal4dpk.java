class Game {
    String judul;
    String genre;

    
    public Game(String judul, String genre) {
        this.judul = judul;
        this.genre = genre;
    }

    
    void tampilkan() {
        System.out.println(judul + " - " + genre);
    }
}

public class soal4dpk {
    public static void main(String[] args) {
        
        
        Game game1 = new Game("Modern Warship", "Strategy");
        
        
        Game game2 = new Game("Azur Lane", "RPG");

        System.out.print("Game 1: ");
        game1.tampilkan();
        
        System.out.print("Game 2: ");
        game2.tampilkan();
    }
}