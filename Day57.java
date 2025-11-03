package rizaldi1;
import java.util.Scanner;
public class BantaiARRAY {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
        for (int i = 1; i <= a; i++) {
        for (int j = 1; j <= b; j++) {
            System.out.print(i*j+" ");   
        }
            System.out.println();

    
        }
    }
}
//contoh output jika input a = 5 dan input b 5
//1 2 3 4 5 
//2 4 6 8 10 
//3 6 9 12 15 
//4 8 12 16 20 
//5 10 15 20 25 
