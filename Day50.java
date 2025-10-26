import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan angka : ");
		int angka = in.nextInt();
		String bilangan = (angka%2==0)?"Genap":"Ganjil";
		System.out.println(angka+" adalah bilangan "+bilangan);
	}
}
