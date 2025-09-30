package javaaplication19;
import java.util.Scanner;
public class JavaApplication19{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
       System.out.print("Masukkan Panjang : ");
        int panjang = in.nextInt();
        System.out.print("Masukkan Lebar   : ");
       int lebar = in.nextInt();
       int luas = panjang*lebar;//rumus luas persegi panjang
        int keliling  = 2 * (panjang+lebar);//rumus keliling persegi panjang 
       System.out.println("Hasil");
      System.out.println("Luas\t\t: "+luas); 
System.out.println("Keliling\t: "+keliling);
}
}
