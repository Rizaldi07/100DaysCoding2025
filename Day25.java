package contohsoalgpt;
import java.util.Scanner;
public class ContohSoalGpt {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = in.nextInt();
        System.out.println("Masukkan angka kedua : ");
        int angka1 = in.nextInt();
        angka++;
        angka1--;
        System.out.print("Increment\t: "+angka);
        System.out.print("\nDecreament\t: "+angka1);
        System.out.println("\n");
        }
}
