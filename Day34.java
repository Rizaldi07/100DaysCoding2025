 package contohsoal;
import java.util.Scanner;
public class ContohSoal {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Nilai pertama : ");
        int angka = in.nextInt();
        System.out.println("Masukkan nilai Kedua : ");
        int angka1 = in.nextInt();
        
        boolean ya = !(angka>angka1 || angka<angka1);
        boolean no = (angka>angka1 && angka<angka1);
        System.out.println(ya);
        System.out.println(no);
}
}
