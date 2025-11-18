import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Masukkan angka : ");
	int batas = in.nextInt();
	int batas1 = batas;
	do{
	    int segitiga = 1;
	    do{
	        
	        System.out.print("* ");
	        segitiga++;
	        }while(segitiga<=batas1);
	        System.out.println(" ");
	        batas1--;
	        }while(batas1>=1);	
	}
}
