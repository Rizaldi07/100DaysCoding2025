
package soal69;

import java.util.Arrays;
import java.util.Scanner;

public class Saldi {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.println("Input");
        System.out.print("Masukkan nama : ");
        String b = in.nextLine();
        System.out.print("Masukkan umur : ");
        int a = in.nextInt();
        System.out.print("Jenis Kelamin (P/L) : ");
        char c = in.next().charAt(0);
        System.out.print("Masukkan Tinggi badan : ");
        double d = in.nextDouble();
        System.out.print("Apakah kamu mahasiswa (true/false) : ");
        boolean e = in.nextBoolean();
        System.out.println("Output: \n");
        System.out.println("====BIODATA=====");
        System.out.println("Nama\t\t: "+nama(b));
        System.out.println("Usia\t\t: "+umur(a)+" tahun");
        System.out.println("Jenis Kelamin\t: "+c);
        System.out.println("Tinggi badan\t: "+tinggi(d)+" cm");
        System.out.println("Mahasiswa?\t: "+mahasiswa(e));
        }
    static int umur(int a){
        return a;
    }
    static String nama(String b ){
        return b;
    }static char jk(char c){
        return c;
    }static double tinggi(double d ){
        return d;
    }static boolean mahasiswa(boolean e){
        return e;
    }
    
    }
