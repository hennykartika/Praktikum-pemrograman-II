package Praktikum4.Soal1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String a, b;
        int c;
        /*
        Urutan Input adalah Judul, Penulis, Tahun Terbit.
        Penginputan WAJIB menyertakan keterangan yang diikuti dengan tanda ":" dan spasi (" ") input didepannya, seperti:
        Judul: <Judul Buku>"
        Penulis: <Nama Penulis>
        Tahun Terbit: <Tahun Terbit>
        Contoh Input :
        Judul: Laskar Pelangi
        Penulis: Andrea Hirata
        Tahun Terbit: 2005
        */
        inp.next();
        a = inp.nextLine();
        inp.next();
        b = inp.nextLine();
        inp.next();
        inp.next();
        c = inp.nextInt();
        Buku book = new Buku(a, b, c);
        book.display();
    }
}
