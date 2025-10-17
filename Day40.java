package saldid;
import java.util.Scanner;
public class SaldiD {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka pertama : ");
        double angka = in.nextDouble();
        in.nextLine();
        System.out.print("Masukkan Operator (+,*,-,/,%) : ");
        String op = in.nextLine();
        System.out.print("Masukkan angka kedua : ");
        double angka1 = in.nextDouble();
        if(op.equals("+")){
            System.out.println(angka+angka1);
            System.out.println("Total penjumlahan nya adalah "+(angka+angka1));
        }else
        if(op.equals("-")){
            System.out.println(angka-angka1);
            System.out.println("Total pengurangan adalah "+(angka-angka1));
        }else
        if(op.equals("*")){
            System.out.println(angka*angka1);
            System.out.println("Total perkalian nya adalah "+(angka*angka1));
        }else
        if(op.equals("/")){
            if(angka1==0){
                System.out.println("Error");
                System.out.println("angka yang di bagi 0 hasilnya tidak terdefinisi/Error");
            }else{
            System.out.println(angka/angka1);
            System.out.println("Total pembagian nya adalah "+(angka/angka1));
            }
        }else
        if(op.equals("%")){
            System.out.println(angka%angka1);
            System.out.println("Hasil dari "+angka+" Modulus "+angka1+" adalah "+(angka%angka1));
        }else {
            
        }
        
      }
    }  
