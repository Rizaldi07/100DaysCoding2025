import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		System.out.print("Masukkan batas deret : ");
		int batas = in.nextInt();
		int a =0;
		int b =1;
		System.out.print("Deret Fibonacci : ");
		for(int i=0;i<=batas;i++){
		    System.out.print(a+" ");
		    int c =a+b;a=b;b=c;
		}
	}
}
