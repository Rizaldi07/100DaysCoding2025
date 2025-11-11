package rizaldi1;
import java.util.Arrays;
import java.util.Scanner;
public class BantaiARRAY {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int n = in.nextInt();
        int a = n;
        int faktorial = 1;
        
        do{
           
            faktorial*=n;
            System.out.print(""+n+"*");
            n--;
        }while(n>= 1);
        System.out.println("\njadi "+a+"! ("+a+" faktorial) adalah "+faktorial);
        }
}
