package D0225009;
import java.util.Scanner;
public class SaldiJhy {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
        System.out.print("masukkan nama :");
    String nama = in.nextLine();
        System.out.print("masukkan umur :");
       int umur = in.nextInt();
        System.out.print("Masukkan anka = ");
        int angka = in.nextInt();
        in.nextLine();
        System.out.print("masukkan alamat : ");
        String alamat = in.nextLine();
        System.out.print("masukkan no :");
        String no = in.nextLine();
        System.out.print("masukkan tinggi :");
        double tinggi = in.nextDouble();
        System.out.println();
        System.out.println("nama saya adalah " + nama);
        System.out.println("umur saya saat ini " + umur);
        System.out.println("angka keberuntungan saya "+angka);
        System.out.println("alamat saya di " + alamat);
        System.out.println("tinggi saya sekitar "+ tinggi );
        System.out.println("nomor wa saya " + no);
    }
}
