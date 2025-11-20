package soal69;

import java.util.Scanner;

public class Saldi {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("=====WELCOME TO CAFE TNG======");
            System.out.println("===== MENU UTAMA =====");
            System.out.println("1. Jus Apel");
            System.out.println("2. Jus Mangga");
            System.out.println("3. Jus Jeruk");
            System.out.println("4. Jus Alpukat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = in.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Kamu memilih menu jus Apel");
                    break;
                case 2:
                    System.out.println("Kamu memilih menu Jus Mangga");
                    break;
                case 3:
                    System.out.println("Kamu memilih menu Jus Jeruk");
                    break;
                case 4:
                    System.out.println("Kamu memilih menu Jus Alpukat");
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!,Tidak ada di menu");
            }

            System.out.println(); // baris kosong

        } while (pilih != 5); // selama belum memilih keluar

        in.close();
    }
}
