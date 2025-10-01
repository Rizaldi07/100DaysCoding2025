package contohsoalgpt;
import java.util.Scanner;
public class ContohSoalGpt {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = in.nextInt();
        System.out.println("Masukkan angka kedua : ");
        int angka1 = in.nextInt();
        angka++;//Increament Menambah value, contoh 5 jika di increament seperti 5++ maka akan menambah value menjadi = 6
        angka1--;//Decreament Mengurangi value, contoh 10 jika di decreament seperti 10-- maka akan mengurangi value menjadi = 9
        System.out.print("Increment\t: "+angka);
        System.out.print("\nDecreament\t: "+angka1);
        System.out.print("\n");
        }
}
