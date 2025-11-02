
package rizaldi1;

import java.util.Scanner;

public class BantaiARRAY {
    public static void main(String[] args) {
Scanner in = new Scanner (System.in);
        int a;
        do{
            System.out.print("Masukkan angka (Kelipatan 5 untuk berhenti) : ");
            a = in.nextInt();
            if(a%5==0){
                System.out.println("Kamu memasukkan angka kelipatan 5.\nKondisi terpenuhi.\nperulangan berhenti");
                System.out.println();
            }else{
                System.err.println("Kamu memasukkan angka "+a+"\nKondisi tidak terpenuhi.\nMasukkan kelipatan 5 untuk berhenti");
                System.out.println();
        }
            }while(a%5!=0);
    }
}
