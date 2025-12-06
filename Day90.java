package yokbelajar;

import java.util.Scanner;

public class YokBelajar {

    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.print("Masukkan alas: ");
        int a = in.nextInt();
        System.out.print("Masukkan tinggi: ");
        int b = in.nextInt();
        double total = segitiga(a,b);
        System.out.println("Luas segitiga adalah : "+total);
        
    }
    static double segitiga  (double a , double b){
        return 0.5*(a*b);
    }
    
}
