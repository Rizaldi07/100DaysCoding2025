package ddp05;

import java.util.Scanner;

public class Ddp05 {
    public static void main(String[] args) {
        Scanner Saldi = new Scanner(System.in);
        System.out.print("Aritmatika Perkalian dan Pembagian");
        System.out.println();
        System.out.print("Masukkan Angka Pertama : ");
        double  Angka1 = Saldi.nextDouble();
        System.out.print("Masukkan Angka Kedua   : ");
        double Angka2 = Saldi.nextDouble();
        System.out.println();
        System.out.print("Aritmatika Perkalian\t: "+Angka1*Angka2);
        System.out.print("\nAritmatika Pembagian\t: "+Angka1/Angka2+ "\n");
        
        
    }
}
