package saldid;
import java.util.Scanner;
public class SaldiD {
    public static void main(String[] args) {Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nama = in.nextLine();
        System.out.print("Masukkan Nilai : ");
        int angka = in.nextInt();
   if(angka>=90 && angka<=100){
       System.out.println("Predikat nilai anda : A");
   }else if(angka>=85 && angka<90){
       System.out.println("Predikat nilai anda : B");
   
   }else if(angka>=80 && angka<85){
       System.out.println("Predikat nilai anda : C");
   
   }else if(angka>75 && angka<80){
       System.out.println("Predikat nilai anda : D");
   }else if(angka>=0 && angka<75){
       System.out.println("Predikat nilai anda : E");
   }else{
       System.out.println("Nilai tidak valid");
   }
   
    }
}
