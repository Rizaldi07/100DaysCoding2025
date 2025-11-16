package rizaldi1;
import java.util.Arrays;
import java.util.Scanner;
public class BantaiARRAY {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.print("Masukkan lebar : ");
        int lebar = in.nextInt();
        System.out.print("Masukkan panjang : ");
        int panjang = in.nextInt();
        for (int i = 1; i <= lebar; i++) {
            for (int j = 1; j < panjang; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
       
    }
}
        
