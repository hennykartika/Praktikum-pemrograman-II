package PRAK203_2110817120003_HennyKartika;

public class Soal3main {
    public static void main(String[] args) {
        //Pada baris ini terjadi error karena nama class yang digunakan berbeda, kita dapat mengubah nama class sesuai yang dibuat
        //Pegawai p1 = new Pegawai();
        Pegawai p1 = new Pegawai();

        //Pada baris ini terjadi error karena disebabkan tidak adanya titik koma (;)
        //p1.nama = "Roi"
        p1.nama = "Roi";

        //Pada baris ini terjadi error karena pada file Pegawai.java variabel asal di deklarasikan sebagai tipe data char
        //Public char asal
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");

        //Instasiasi variabel umur pada file main
        p1.umur = 17;

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //Pada baris ini diperlukan "tahun" dibelakang angka 17, kita dapat melakukan penambahan dibelakang p1.umur
        //System.out.println("Umur: " +  p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");

    }
}
