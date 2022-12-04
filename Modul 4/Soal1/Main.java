package praktikum4.soal1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Deklarasi variabel penampung sementara
        String judul = "", penulis = "";
        int tahun = 0;
        
        // Instansiasi Scanner dengan nama input
        Scanner input = new Scanner(System.in);
        
        // User input
        System.out.print("Judul: ");
        judul = input.nextLine();
        
        System.out.print("Penulis: ");
        penulis = input.nextLine();
        
        System.out.print("Tahun Terbit: ");
        tahun = input.nextInt();
        
        // Instansiasi Object Buku dengan nama buku
        Buku buku = new Buku(judul, penulis, tahun);
        
        buku.display();
        
    }
}
