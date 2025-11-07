package rizaldi1;
import java.util.Arrays;
import java.util.Scanner;


public class BantaiARRAY {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
        System.out.print("Masukkan angka N : ");
        int N = in.nextInt();
        System.out.print("Masukkan angka M : ");
        int M = in.nextInt();
        int i = 1;
        System.out.println("Kelipatan "+M+" dari 1-"+N+" adalah ");
        do{
           if(i%M==0){ 
               System.out.print(i+" ");
               
           }i++;
        }   while(i<=N);
        
    }
}
