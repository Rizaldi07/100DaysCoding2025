package evaluasimentor2;
import java.util.Scanner;
public class EvaluasiMentor2 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);  System.out.print("Masukkan nama karyawan : ");
         String nama = in.nextLine();
         System.out.print("Masukkan gaji pokok : ");
         double gj = in.nextDouble();
         in.nextLine();
         System.out.print("Masukkan Status karyawan (tetap/kontrak) : ");
         String status = in.nextLine();
         System.out.println("Nama Karyawan : "+nama);
         System.out.println("Gaji kotor karyawan : "+gj+"\n");
         double pajak = 0;
         if(status.equalsIgnoreCase("tetap")){
             pajak = gj*10/100.0;
             gj = gj+pajak;
             System.out.println("Anda ada potongan pajak sebesar "+pajak);
             System.out.println("Total gaji bersih anda adalah : "+gj);
         }else{
             pajak = gj*5/100.0;
             gj = gj+pajak;
             System.out.println("Anda ada potongan pajak sebesar "+pajak);
             System.out.println("Total gaji bersih anda adalah : "+gj);
         }
    }
}
