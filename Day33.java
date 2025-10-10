package soalkakhasnur;
import java.util.Scanner;
public class SoalKakHasnur {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        int a = in.nextInt();
        System.out.print("b = ");
        int b = in.nextInt();
        System.out.print("Masukkan ket (true/false): ");
        boolean ket = in.nextBoolean();
        boolean c = (a<b);
        System.out.println(!c);
        System.out.println(!ket);
    }
    
}
