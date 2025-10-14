package saldid;
import java.util.Scanner;
public class SaldiD {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = in.nextInt();
        if(angka%2==0){
            System.out.println(angka+" adalah Bilangan Genap ");
        }else{
            System.out.println(angka+" adalah Bilangan Ganjil ");
        }
    }
    
}
