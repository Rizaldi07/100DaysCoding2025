package rizaldi1;
import java.util.Arrays;
import java.util.Scanner;
public class BantaiARRAY {
    public static void main(String[] args) {
Scanner in = new Scanner (System.in);
        System.out.print("Masukkan angka N : ");
        int n = in. nextInt();
        System.out.println("dari angka 1 ke angka "+n+" (ganjil)");
        for (int i = 0; i <= n; i++) {
            if(i%2==0){
                continue;
            }
                System.out.println(i);
        } System.out.println("dari angka "+n+" ke angka 1(genap)");
        for (int i = 0; i <= n; i++) {
            if(i%2!=0){
                continue;
            }
                System.out.println(i);
        }
    }
}
