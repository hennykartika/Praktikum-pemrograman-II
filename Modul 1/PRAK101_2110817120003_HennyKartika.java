package praktikum1;
import java.util.Scanner;
public class PRAK101_2110817120003_HennyKartika{
    public static void main (String [] args) {
        Scanner scan=new Scanner(System.in);
     
        String namaLengkap,tempatLahir,tanggalLahir, namaBulan = null;
        int bulanLahir, tahunLahir,tinggiBadan;
        double beratBadan;
       
        System.out.print("\tMasukan Nama Lengkap\t:");
        namaLengkap=scan.nextLine();
        
        System.out.print("\tMasukan Tempat Lahir\t: ");
        tempatLahir=scan.nextLine();
        
        System.out.print("\tMasukan Tanggal Lahir\t: ");
        tanggalLahir=scan.nextLine();
       
        System.out.print("\tMasukan Bulan Lahir\t: ");
        bulanLahir=scan.nextInt();
        
        if (bulanLahir == 1) namaBulan ="Januari";
        else if (bulanLahir == 2) namaBulan ="Februari";
        else if (bulanLahir == 3) namaBulan ="Maret"; 
        else if (bulanLahir == 4) namaBulan ="April";
        else if (bulanLahir == 5) namaBulan ="Mei";
        else if (bulanLahir == 6) namaBulan ="Juni";
        else if (bulanLahir == 7) namaBulan ="Juli";
        else if (bulanLahir == 8) namaBulan ="Agustus";
        else if (bulanLahir == 9) namaBulan ="September";
        else if (bulanLahir == 10) namaBulan ="Oktober";
        else if (bulanLahir == 11) namaBulan ="November";
        else if (bulanLahir == 12) namaBulan ="Desember";

       
        System.out.print("\tMasukan Tahun Lahir\t: ");
        tahunLahir=scan.nextInt();
        
        System.out.print("\tMasukkan Tinggi Badan\t: ");
        tinggiBadan=scan.nextInt();
        
        System.out.print("\tMasukan Berat Badan \t: ");
        beratBadan=scan.nextDouble();

        System.out.println();
        System.out.println("\tData Telah Ditambahkan,\t");
        System.out.print("\tNama Lengkap "+namaLengkap+",");
        System.out.println(" Lahir di "+tempatLahir+" pada tanggal "+tanggalLahir+" "+namaBulan+" "+tahunLahir);
        System.out.println("\tTinggi Badan "+tinggiBadan+" cm dan Berat Badan "+beratBadan+" kilogram");
    }
}
