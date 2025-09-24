
package D0225009;
import java.util.Scanner;
public class SaldiJhy {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
           System.out.print("Masukkan Angka Pertama : ");
           int angka = in.nextInt();
           System.out.print("Masukkan Angka Kedua   : ");
           int angka1 = in.nextInt();
           System.out.println();
           System.out.println("OUTPUT");
           System.out.print("Modulus atau Sisa bagi\t: "+angka%angka1+"\n");
  }
}
