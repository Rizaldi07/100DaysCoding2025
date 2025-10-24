package rizaldi1;

import java.util.Scanner;

public class Rizaldi1 {

    public static void main(String[] args) {
System.out.println("=== Matkul ==");
        System.out.println("1. DDP");//senin
        System.out.println("2. PKN");//jumat
        System.out.println("3. AGAMA");//jumat
        System.out.println("4. WSBI");//selasa
        System.out.println("5. AOK");//senin
        System.out.println("6. MATEMATIKA");//selasa
        System.out.println("7. FISIKA ELEKTRONIKA");//jumat
        System.out.println("8. PSTI");//rabu
        System.out.print("Masukkan jadwal : ");
        Scanner in = new Scanner(System.in);
        String jadwal = in.nextLine();
        System.out.print("Sekarang hari apa? : ");
        String hari = in.nextLine();
        
        switch(hari){
            case "Senin":
                System.out.println("Hari ini adalah hari "+hari);
                System.out.println("matkul hari ini adalah "+jadwal);
                break;
            case "Selasa":
                System.out.println("Hari ini adalah hari "+hari);
                System.out.println("matkul hari ini adalah "+jadwal);
                break;
            case "Rabu":
                System.out.println("Hari ini adalah hari "+hari);
                System.out.println("matkul hari ini adalah "+jadwal);
                break;
            case "Kamis":
                System.out.println("Hari ini adalah hari "+hari);
                System.out.println("matkul hari ini adalah "+jadwal);
                break;
            case "Jumat":
                System.out.println("Hari ini adalah hari "+hari);
                System.out.println("matkul hari ini adalah "+jadwal);
                break
            case "Sabtu":
                System.out.println("Hari ini adalah hari "+hari);
                System.out.println("matkul hari ini adalah "+jadwal);
                break;
            case "Minggu":
                System.out.println("Hari ini adalah hari "+hari);
                System.out.println("matkul hari ini adalah "+jadwal);
                break;
            default: 
                System.out.println(hari+"? HARI APA TUHH? tujuh hari aja dah capek, ini mau tambah hari lagi,hadehhh");
                break;
        }
        }

}
