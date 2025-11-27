import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	int a[]={10,20,30,40,50,60};
	for(int c : a){
	    
	System.out.print(c+" ");}
	System.out.print("\nMasukkan indeks array yang ingin di akses (0-5) :  ");
	int b = in.nextInt();

	
	System.out.println("indeks ke "+b+" : "+a[b]);
	}
}
