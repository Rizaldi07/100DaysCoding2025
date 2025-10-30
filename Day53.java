import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
            System.out.print("Anda memasukkan angka : ");
           int angka = in.nextInt();
            if(angka==7){
                break;
            }
           System.out.println();
            System.out.println("Kamu memasukkan angka "+angka);
            System.out.println("Masukkan 7 untuk berhenti");
            System.out.println();
            
        }
        System.out.println("Angka memasukkan angka 7 jadi perulangannya berhenti");
	}
}
