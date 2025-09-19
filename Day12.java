import java.util.Scanner;
public class SaldiJhy {
    public static void main(String[] args) {
   Scanner saldi = new Scanner(System.in);
        System.out.println("MY BIODATA GUA(-_-)"); 
        System.out.println("=====================================");
        System.out.print("Masukkan Nama Anda   : ");
        final String nama = saldi.nextLine();
        System.out.print("Masukkan Nim Anda    : ");
        String Nim = saldi.nextLine();
        System.out.print("Masukkan Umur Anda   : ");
        int Umur = saldi.nextInt();
        System.out.print("Apa Gender Anda      : ");
        char Jk = saldi.next().charAt(0);
        System.out.print("Masukkan Tinggi Anda :  ");
        double Tinggi = saldi.nextDouble();
        saldi.nextLine();
        System.out.print("Masukkan Alamat Anda : ");
        String Alamat = saldi.nextLine();
        System.out.print("Masukkan Hobi Anda   : ");
        String Hobi = saldi.nextLine();
        System.out.println("====================================");
        System.out.println("THIS IS MY BIODATA GUA('_')");
        System.out.printf("Nama\t\t: %s ",nama);
        System.out.printf("\nNim\t\t: %s \n",Nim);
        System.out.println("Umur\t\t: "+Umur+" tahun");
        System.out.println("Jenis Kelamin\t: "+Jk);
        System.out.printf("Tinggi\t\t: "+Tinggi+" cm");
        System.out.printf("\nAlamat\t\t: "+Alamat);
        System.out.printf("\nHobi\t\t: "+Hobi+"\n");
        System.out.println("=====================================");
        System.out.println("Perkenalan Singkat Jhe(>_<)");
        System.out.println("Halo, perkenalkan nama saya "+nama);
        System.out.println("Dan umur saya tahun ini yaitu "+Umur+" tahun");
        System.out.println("Saat ini saya lagi ngekost di "+Alamat);
        System.out.println("Dan Hobbi saya,Dulu sih suka "+Hobi);
    }
}
