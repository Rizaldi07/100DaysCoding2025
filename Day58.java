package rizaldi1;
import java.util.Scanner;
public class BantaiARRAY {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
    int a = in.nextInt();
        System.out.println("\ndari 1 ke "+a+ " : ");
        for (int i = 1; i <= a; i++) {
            System.out.print(i+" ");   
        }
        System.out.println("\ndari "+a+" ke 1 : ");
        for (int j = a; j >= 1; j--) {
            System.out.print(j+" ");

    
        }
    }
}
