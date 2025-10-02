package contohsoalgpt;
import java.util.Scanner;
public class ContohSoalGpt {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = in.nextInt();
        System.out.print("Masukkan angka1 : ");
        int angka1 = in.nextInt();
        System.out.print("Masukkan angka2 : ");
        int angka2 = in.nextInt();
        System.out.print("Masukkan angka3 : ");
        int angka3 = in.nextInt();
        System.out.println("Sebelum ada operator Penugasan(+=,-=,*=,/=)");
        System.out.print(""+angka);
        System.out.print("\n"+angka1);
        System.out.print("\n"+angka2);
        System.out.print("\n"+angka3);
         angka += 5;// inputan variabel angka akan ditambah dengan 5
         angka1 -= 5;// inputan variabel angka1 akan dikurangi dengan 5
         angka2 *= 5;// inputan variabel angka2 akan dikali dengan 5
         angka3 /= 5;// inputan variabel angka3 akan dibagi dengan 5
        System.out.println("\nSesudah ada operator penugasan (+=,-=,*=,/=)");
        System.out.print("+= "+angka);
        System.out.print("\n-= "+angka1);
        System.out.print("\n*= "+angka2);
        System.out.print("\n/= "+angka3);
        System.out.println();
        
        }
}
