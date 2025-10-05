package Saldi;
import java.util.Scanner;
public class Saldi {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        int a = in.nextInt();
        System.out.print("b = ");
        int b = in.nextInt();
        System.out.print(a==b);// "==" untuk membandingkan nilai 1 dengan nilai lainnya dengan hasil sama
        System.out.print("\n"+(a!=b));// "!=" untuk membandingkan nilai 1 dengan nilai lainnya dengan hasil tidak sama
        System.out.println();
    }
}
