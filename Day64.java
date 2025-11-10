import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Masukkan nilai N : ");
	int n = in.nextInt();
	System.out.print("Masukkan pangkat (nilai M) :  ");
	int m = in.nextInt();
	int nilai1 = 1;
	int pangkat = 1;
	do{
	    
	    pangkat*=n;
	    
	    System.out.print(pangkat+" ");
	    
	    nilai1++;
	}while(nilai1<=m);
	System.out.println("\nhasil dari "+n+" pangkat "+m+" adalah "+pangkat);
	}
}
