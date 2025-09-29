package D0225009;
import java.util.Scanner;
public class SaldiJhy {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.print("Masukkan sisi : ");
        int sisi = in.nextInt();
        int luas = sisi * sisi; // Rumus dari luas adalah sisi pangkat 2 (sisi * sisi)
         System.out.println("Outputnya");
         System.out.printf("Luas\t: %d ",luas);
         System.out.println("");
         
    }
}
