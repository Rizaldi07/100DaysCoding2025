package evaluasimentor2;
import java.util.Scanner;
public class EvaluasiMentor2 {
    public static void main(String[] args) { 
Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka (1-5) : ");
        int angka = in.nextInt();
        switch(angka){
            case 1:
                System.out.println("Anda memilih 1");
                break;
            case 2:
                System.out.println("Anda memilih 2");
                break;
            case 3:
                System.out.println("Anda memilih 3");
                break;
            case 4:
                System.out.println("Anda memilih 4");
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
        in.close();
        
    }
       
}
