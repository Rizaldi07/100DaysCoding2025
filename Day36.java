package saldid;
import java.util.Scanner;
public class SaldiD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan harga barang : ");
        int harga = in.nextInt();
        System.out.print("Masukkan jumlah barang : ");
        int j = in.nextInt();
        double total = harga*j;
        System.out.println("harga sebelum diskon : "+total);
        if(total>250000){
            double d = total*0.1;
            total = total-d;
            
            System.out.println("Diskon 10%");
            System.out.println("Harga setelah diskon : "+total);
            if(j>=10){
                System.out.println("dapat bonus gratis 1 ");
            }else{
                System.out.println("Tidak dapat bonus ");
            }
                
        }else{
            
            System.out.println("Tak dapat diskon");
           
        }
    }
    
}
