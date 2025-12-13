package soal69;

import java.util.Arrays;
import java.util.Scanner;

public class Saldi {

    public static void main(String[] args) {
Scanner in = new Scanner (System.in);
        System.out.print("Masukkan sisi : ");
        int a = in.nextInt();
        System.out.println("Luas Persegi dengan sisi "+a+" adalah "+Kotak(a));
    }static int Kotak(int kotak){
        return kotak*kotak;
    }
}
