package praktikum4.soal1;

public class Buku {
    private String judul;
    private String penulis;
    private Integer tahun;
    
    // Constructor
    public Buku(String j, String p, int t){
        this.judul = j;
        this.penulis = p;
        this.tahun = t;
    }
    
    // Method Display Output
    void display(){
        System.out.println("Detail buku:");
        System.out.println("Judul adalah " + this.judul);
        System.out.println("Penulis adalah " + this.penulis);
        System.out.println("Tahun Terbit adalah " + this.tahun);
    }
    
}
