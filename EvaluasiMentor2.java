package evaluasimentor2;
import java.util.Scanner;
public class EvaluasiMentor2 {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      //Soal 1
//        System.out.print("Masukkan nilai asep : ");
//        int angka = in.nextInt();
//        System.out.print("Masukkan nilai budi : ");
//        int angka1 = in.nextInt();
//        if(angka>angka1){
//            System.out.println("Asep memiliki nilai lebih tinggi dari budi ");
//        }
//        else if(angka<angka1){
//            System.out.println("Budi memiliki nilai lebih tinggi dari Asep ");
//        }else{
//            System.out.println("Nilai mereka sama ");
//        }

//Soal 2
//        System.out.print("Masukkan daya listrik (watt) : ");
//        int lis = in.nextInt();
//        if(!(lis>2200)){
//            System.out.println("Status : Daya aman");
//        }else{
//            System.out.println("Status : daya tidak aman ");
//        }

//Soal 3
//        System.out.print("Apakah anda member? (True/False) : ");
//        boolean i = in.nextBoolean();
//        System.out.println("Masukkan Total belanja (Rp): ");
//        int n = in.nextInt();
//        if(i==true && n>500000){
//            System.out.println("Anda mendapat diskon 25%");
//        }else if(i==true || n>500000){
//            System.out.println("Anda mendapat diskon 10%");
//        }else{
//            System.out.println("Anda tidak dapat diskon");
//        }

//Soal 4
//        System.out.print("Masukkan kecepatan kendaraan (km/jam) : ");
//        int a = in.nextInt();
//        System.out.print("Masukkan batas kecepatan jalan (km/jam) : ");
//        int b =in.nextInt();
//        if(a<40){
//            System.out.println("Terlalu lambat, bisa mengganggu lalu lintas");
//        }
//        else if(a>=40 && a<=b){
//            System.out.println("Kecepatan normal");
//        }
//        else if(a>b && a<= b+20){
//            System.out.println("Hati-hati anda melebihi batas!");
//           
//        }else if(a>b+20){
//            System.out.println("bahaya! anda melaju terlalu cepat");
//        }
       int mangga = 12000;
		int alpukat = 15000;
		int jeruk = 10000;
		int americano = 12000;
		int kapalapi = 10000;
		int hytam = 5000;
		
		System.out.print("=== ISC Cafe ===");
		System.out.println("\n1. Kopi" + 
		                   "\n2. Jus" + 
		                   "\n3. Keluar");
		System.out.print("Pilih kategori (1-3): ");
		byte kategori = in.nextByte();
		
		if (kategori == 1){
		    System.out.println("\n=== Menu Kopi ===" + 
		                       "\n1. Americano (Rp12.000)" + 
		                       "\n2. Kapal Api (Rp10.000)" + 
		                       "\n3. Kopi Hytam (Rp5.000)");
		System.out.print("Pilih menu (1-3): ");
		byte menu1 = in.nextByte();
		System.out.print("\nMasukkan jumlah pesanan: ");
		byte jumlah = in.nextByte();
		
		if (menu1 == 1){
		    System.out.println("\nAnda memesan "+jumlah+" Americano");
		    System.out.println("Total bayar Rp"+jumlah*americano);
		}else if (menu1 == 2){
		    System.out.println("\nAnda memesan "+jumlah+" Kapal Api");
		    System.out.println("Total bayar Rp"+jumlah*kapalapi);
		}else if (menu1 == 3){
		    System.out.println("\nAnda memesan "+jumlah+" Kopi Hytam");
		    System.out.println("Total bayar Rp"+jumlah*hytam);
		}else{
		    System.out.println("\nAngka yang anda masukkan tidak valid");
		}
		
		System.out.println("\nPilih metode pembayaran: " + 
		                   "\n1. Cash" + 
		                   "\n2. QRIS");
		System.out.print("Masukkan pilihan (1-2): ");
		byte bayar = in.nextByte();
		
		if ( bayar == 1){
		    System.out.println("Pembayaran dengan Cash. Silahkan bayar di kasir");
		}else if ( bayar == 2){
		    System.out.println("\nPembayaran dengan QRIS. Silahkan scan QR");
		}else{
		    System.out.println("\nAngka yang anda masukkan tidak valid");
		}
		
		}else if(kategori == 2){
		    System.out.println("\n=== Menu Jus ===" + 
		                       "\n1. Jus Mangga (Rp12.000)" + 
		                       "\n2. Jus Alpukat (Rp15.000)" + 
		                       "\n3. Jus Jeruk (Rp10.000)");
		System.out.print("Pilih menu (1-3): ");
		byte menu = in.nextByte();
		System.out.print("\nMasukkan jumlah pesanan: ");
		byte jumlah = in.nextByte();
		
		if ( menu == 1 ){
		    System.out.println("\nAnda memesan "+jumlah+" mangga");
		    System.out.println("Total bayar Rp"+jumlah*mangga);
		}else if (menu == 2){
		    System.out.println("\nAnda memesan "+jumlah+" alpukat");
		    System.out.println("Total bayar Rp"+jumlah*alpukat);
		}else if(menu == 3){
		    System.out.println("\nAnda memesan "+jumlah+" jeruk");
		    System.out.println("Total bayar Rp"+jumlah*jeruk);
		}else{
		    System.out.println("\nAngka yang anda masukkan tidak valid");
		}
		
		System.out.println("\nPilih metode pembayaran: " + 
		                   "\n1. Cash" + 
		                   "\n2. QRIS");
		System.out.print("Masukkan pilihan (1-2): ");
		byte bayar = in.nextByte();
		
		if ( bayar == 1){
		    System.out.println("Pembayaran dengan Cash. Silahkan bayar di kasir");
		}else if(bayar == 2){
		    System.out.println("\nPembayaran dengan QRIS. Silahkan scan QR");
		}else{
		    System.out.println("\nAngka yang anda masukkan tidak valid");
		}
		    
		}else if(kategori == 3){
		    System.out.println("\nDadahh");
		
		}else{
		    System.out.println("\nAngka yang anda masukkan tidak valid");
		}
		
		System.out.println("\n=== Terima kasih telah berbelanja di ISC Cafe! ===");
    } 
}
