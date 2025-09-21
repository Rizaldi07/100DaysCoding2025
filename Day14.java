package terkaitday100;
import java.util.Scanner;
public class TerkaitDay100 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENGUBAH STRING MENJADI TIPE DATA PRIMITIF");
        System.out.print("\nMasukkan Angka Bebas (Maksimal 127) : ");
        String angka  = sc.nextLine();
        
        int No = Integer.parseInt(angka );
       System.out.println("Dari tipe data Strin ke Integer\t= "+No);
        
        byte NO = Byte.parseByte(angka );
        System.out.println("Dari tipe data Sting ke byte\t= "+NO);
        
        short nO = Short.parseShort(angka );
        System.out.println("Dari tipe data String ke Short\t= "+nO);
        
        long noo = Long.parseLong(angka );
        System.out.println("Dari tipe data String ke Long\t= "+noo);
      
        System.out.print("\nMasukkan bilangan Desimal (Contoh: 12.5) : ");
        
        String angkaa = sc.nextLine();
        
        double Mu = Double.parseDouble(angkaa);
        System.out.println("Dari tipe data String ke Double\t= "+Mu);
        
        float MU = Float.parseFloat(angkaa);
        System.out.println("Dari tipe data String ke float\t= "+MU);
      
        System.out.print("\nMasukkan 1 karakter huruf/symbol/angka : ");
        String huruf = sc.nextLine();
        char na = huruf.charAt(0);
        System.out.println("Dari tipe data String ke Char\t= "+na);
        
        System.out.print("\nMasukkan keterangan (true/false) = ");
        String aku = sc.nextLine();
        boolean ak = Boolean.parseBoolean(aku);
        System.out.println("Dari tipe data String ke Boolean = "+ak+"\n");
  
    }
    
}
