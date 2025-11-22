
package soal69;

import java.util.Scanner;

public class Saldi {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
            System.out.print("Masukkan kalimat pertama : ");
            String apa = in.nextLine();
            System.out.print("Masukkan kalimat kedua : ");
            String itu = in.nextLine();
            
               System.out.print("Contains : ");
           if(apa.contains("aku")){
               System.out.println("ada kata aku");
           }else{
               System.out.println("Tidak ada kata aku");
           }
               System.out.print("Empty : ");
           if(apa.isEmpty()||itu.isEmpty()){
               System.out.println("salah satu varible nilainya kosong");
           }else{
               System.out.println("kedua variable tidak kosong");
           }
               System.out.print("equals : ");
           if(apa.equals(itu)){
               System.out.println("kata pada kedua varible sama (dalam hal huruf besar kecil)");
           }else{
               System.out.println("kata pada kedua varible beda (dalam hal huruf besar kecil)");
           }
               System.out.print("equals ignore case : ");
           if(apa.equalsIgnoreCase(itu)){
               System.out.println("kata pada kedua variable sama (yang penting hurufnya sama)) ");
           }else{
               System.out.println("tidak");
           }
    }
}

    

