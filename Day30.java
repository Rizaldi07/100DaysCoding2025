package ddp6s;
import java.util.Scanner;
public class DDP6S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        int a = in.nextInt();
        System.out.print("b = ");
        int b = in.nextInt();
        System.out.println("perbandingan a lebih besar sama dengan b? "+(a>=b));
        System.out.println("perbandingan a lebih kecil sama dengan b? "+(a<=b));
      }
    }
