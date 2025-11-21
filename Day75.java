
package soal69;

import java.util.Scanner;

public class Saldi {
    public static void main(String[] args) {
Scanner in = new Scanner (System.in);
        System.out.print("Masukkan nama anda : ");
        String nama = in.nextLine();
       int apa = nama.length();
       String itu = nama.toLowerCase();
       String iya_itu = itu.toUpperCase();
        System.out.println("Jumlah kata dari nama anda adalah : "+apa);
        System.out.println("Mengubah kata huruf besar jadi kecil : "+itu);
        System.out.println("Mengubah kata huruf kecil jadi besar : "+iya_itu);
       
    }
}
