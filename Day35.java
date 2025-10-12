package contohsoal;
import java.util.Scanner;
public class ContohSoal {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.print("Masullan Nilai Siswa : ");
        int nilai = in.nextInt();
        if(nilai>=75 && nilai<=100){
            System.out.println("Nilai Anda lulus Nilai KKM");
        }else if(nilai>=0 && nilai<=74){
            System.out.println("Nilai anda tidak Lulus KKM");
        }else{
            System.out.println("Nilai Tidak valid");
        }
    }
    
}
