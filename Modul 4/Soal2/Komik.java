package Praktikum4.Soal2;

public class Komik extends Buku {
    private int volume;
    private String sinopsis;

    public Komik(String j, String p, String t, int v, String s){
        super.judul = j;
        super.penulis = p;
        super.tahun = Integer.valueOf(t);
        this.volume = v;
        this.sinopsis = s;
    }

    public String getKomikDetail() {
        return "Data yang baru di inputkan adalah\nSebuah Komik dengan judul " + judul
                + ".\nKomik  tersebut dibuat oleh " + penulis + " dan diterbitkan pada tahun " + tahun
                + " .Sampai saat ini komik tersebut memiliki jumlah volume sebanyak " + volume + " buah."
                + "\nSinopsis : " + sinopsis.substring(0, 64) + "...";
    }
}