package praktikum1;
import java.util.Scanner;
public class PRAK103_2110817120003_HennyKartika{
   
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int input = keyboard.nextInt();
        int i = 1;
        do {
            if (input % 7 == 0){
                continue;
            }
            if (i == 5) System.out.print(input);
            else System.out.print(input+",");
            i++;
            input--;
        } while (i<=5);
      
    } 
}
    