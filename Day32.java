package ddp6s;
import java.util.Scanner;
public class DDP6S {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka pertama : ");
        int angka = in.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int angka1 = in.nextInt();
        
        int a = 90;
       
        System.out.println(angka>a || angka1<a);
    }
}
