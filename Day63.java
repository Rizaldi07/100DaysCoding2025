package rizaldi1;
import java.util.Arrays;
import java.util.Scanner;


public class BantaiARRAY {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int N= in.nextInt();
        int awal = 1;
        int total =1;
        while(awal<=N){
            total*=awal;
            System.out.print(awal+" ");
            awal++;
        }
        System.out.println("\nhasil perkalian 1-"+N+" : "+total);
    }
}
