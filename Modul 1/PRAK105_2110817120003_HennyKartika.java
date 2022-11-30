package praktikum1;
import java.util.Scanner;
public class PRAK105_2110817120003_HennyKartika {        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double phi = 3.14;
        double volume, r, t;
       
        System.out.print("Masukkan jari-jari : ");
             r = input.nextDouble();
        System.out.print("Masukkan tinggi : ");
             t = input.nextDouble();
     
         volume = (phi * r*r * t);
       
        System.out.println("Volume tabung dengan jari "+r+" cm dan tinggi "+t+" cm adalah "+volume+ " m3");
    }
}