package rizaldi1;
import java.util.Arrays;
import java.util.Scanner;


public class BantaiARRAY {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka :");
        int a = in.nextInt();
        for (int i = 1; i <=a; i++) {
        for (int j = 1; j <=i; j++) {
            System.out.print("* ");
        }
            System.out.println("");
        }
    }
}
