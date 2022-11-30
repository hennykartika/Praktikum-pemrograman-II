package praktikum1;
import java.util.Scanner;
public class PRAK102_2110817120003_HennyKartika {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input = keyboard.nextInt();
        int i = 0;
        
        while (i <= 6) {
            int t;
            if (input % 2 == 0) {
                t = (input / 2) -1;
                System.out.print(" " + t + " " );
            } else {
                System.out.print(input);
            }
            input++;
            i++;
        }
       keyboard.close();
    }
    
}
