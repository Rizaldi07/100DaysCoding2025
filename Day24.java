package javaaplication19;
import java.util.Scanner;
public class JavaApplication19{
public static void main(String[] args){

Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Jari-jari = ");
        double r = in.nextDouble();// r adalah symbol jari-jari.
        double phi = Math.PI;// Nilai dari "Math.PI adalah 3.14 
        double Luas = r * r * phi;// Rumus luas Lingkaran yaitu jari pangkat 2 * phi(jarijari*jarijari*phi)
        double Keliling = 2 * phi * r;//rumus Keliling Lingkaran yaitu 2*phi*jarijari
        System.out.println("Output");
        System.out.print("\nLuas\t\t: "+Luas);
        System.out.print("\nKeliling\t: "+Keliling);
        System.out.println();
  }
}
