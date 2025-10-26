import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Masukkan Nilai Tugas : ");
	int tugas = in.nextInt();
	System.out.print("Masukkan nilai UTS : ");
	int UTS = in.nextInt();
	System.out.print("Masukkan nilai UAS : ");
	int UAS = in.nextInt();
	int rata = (tugas+UAS+UTS)/3;
	System.out.println("Rata-rata nilai anda adalah "+rata);
	String status = 
            (tugas > 100 || UTS > 100 || UAS > 100 || tugas < 0 || UTS < 0 || UAS < 0)
            ? "Nilai tidak valid"
            : (rata >= 75 ? "Lulus" : "Tidak Lulus");	
	System.out.println("Anda : "+status);
	}
}
