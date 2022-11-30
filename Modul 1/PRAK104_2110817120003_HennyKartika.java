package praktikum1;
import java.util.Scanner;
public class PRAK104_2110817120003_HennyKartika {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Deklerasi Variable
        int andiRondePertama, budiRondePertama, andiRondeKedua, budiRondeKedua, andiRondeKetiga, budiRondeKetiga;
        int pointAndi = 0, pointBudi=0;

        //Masukan Kartu Andi
        System.out.print("Kartu Andi: ");
        andiRondePertama = keyboard.nextInt();
        andiRondeKedua = keyboard.nextInt();
        andiRondeKetiga = keyboard.nextInt();
        keyboard.nextLine();
        //Dimasukan kedalam array andi
        int [] andi = {andiRondePertama,andiRondeKedua,andiRondeKetiga};

        //Masukan Kartu Budi
        System.out.print("Kartu Budi: ");
        budiRondePertama = keyboard.nextInt();
        budiRondeKedua = keyboard.nextInt();
        budiRondeKetiga = keyboard.nextInt();
        int [] budi = {budiRondePertama, budiRondeKedua, budiRondeKetiga};

        //Pengkodndisian Kartu yang digunakan hanya kartu 2 s.d 10.
        if ((budiRondePertama >= 2 && budiRondePertama <=10) &&
                (budiRondeKedua >= 2 && budiRondeKedua <=10) &&
                (budiRondeKetiga >= 2 && budiRondeKetiga <=10) &&
                (andiRondePertama >= 2 && andiRondePertama <= 10) &&
                (andiRondeKedua >= 2 && andiRondeKedua <=10) &&
                (andiRondeKetiga >=2 && andiRondeKetiga <=10)) {

            //Pertandingan dimulai dengan membandingkan tiap index andi dan budi
            int i = 0;
            while (i <= 2) {
                if (andi[i] > budi[i]) pointAndi++; //Tambahkan sebanyak 1 point untuk Andi
                else  if (budi[i] > andi[i]) pointBudi++; //Tambahkan sebanyak 1 point untuk Budi
                i++;
            }

            //Menentukan pemenang (Membandingkan pointAndi dan poinBudi)
            if (pointAndi > pointBudi) System.out.println("Andi"); //Menampilkan nama Andi
            else if(pointBudi > pointAndi) System.out.println("Budi");
            else
                System.out.println("Seri"); //Menampilkan nama Andi
        }
        else {
                //Jika kartu yang dimasukan kurang dari 2 dan lebih dari 10
                System.out.println("Invalid input kartu must be lebih dari 2 dan kurang dari 10 :)");
            }
        keyboard.close();
    }
}