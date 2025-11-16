package rizaldi1;
import java.util.Arrays;
import java.util.Scanner;


public class BantaiARRAY {
    public static void main(String[] args) {
// SOAL 1
//        Scanner in = new Scanner(System.in);
//        System.out.print("Masukkan Nilai N : ");
//        int n = in.nextInt();
//        int t = 0;
//        int fak =1 ;
//            System.out.print("deret 1 ke "+n+" : ");
//        for (int i = 1; i <= n; i++) {
//            System.out.print(i+" ");
//            t+=i;
//        }
//        System.out.println();
//        System.out.print("deret "+n+" ke 1 : ");
//        do{
//            fak*=n;
//            System.out.print(n+" ");
//            n--;
//        }while(n>=1);
//        System.out.println("\njumlah : "+t);
//        System.out.println("faktorial : "+fak);
//      SOAL 2
//        Scanner in = new Scanner(System.in);
//        System.out.print("Masukkan nilai N : ");
//        int N = in.nextInt();
//        int a = 1;
//        int jg= 0;int t1=0;
//        int jg1= 0;int t=0;
//        while(N>=a){
//          
//            if(a%2==0){
//                jg++;
//                t1+=a;
//            }else if(a%2!=0){
//                jg1++;
//                t+=a;
//                
//            }
//            a++;
//        }
//                System.out.println("jumlah angka genap : "+t1);
//                System.out.println("total angka genap : "+jg);
//                System.out.println("total angka ganjil :"+jg1);
//                System.out.println("jumlah angka ganjil : "+t);
//  SOAL 3

//        Scanner in = new Scanner (System.in);
//        System.out.println("Masukkan angka : ");
//        int a = in.nextInt();
//        long fak =1 ;
//        
//        for (int i = 1; i <= a; i++) {
//            fak*=i;
//           
//        }long temp = fak;
//        long jg=0;
//        if(temp==0){
//            jg=1;
//            
//        }else{
//           while(temp>0){
//               jg++;
//               temp/=10;
//           }
//        }
//        System.out.println(a+"! = "+fak);
//          System.out.println("jumlahdigit = "+jg);  
//      
// SOAL 4
//        Scanner in =new Scanner(System.in);
//        System.out.print("Masukkan ukuran N (persegi) : ");
//        int sisi = in.nextInt();
//        for (int i = 0; i <=sisi; i++) {
//            for (int j = 0; j <=sisi; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
// SOAL 5
         Scanner in =new Scanner(System.in);
        System.out.print("Masukkan sisi N (persegi) : ");
        int sisi = in.nextInt();
        for (int i = 1; i <=sisi; i++) {
            for (int j = 1; j <=sisi; j++) {
                if(i==1||i==sisi|j==1||j==sisi){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

       
    }
}
        
