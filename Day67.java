import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("masukkan batas : ");
	int a = in.nextInt();
	int b = 1;
	System.out.println();
	do{
	    
	    System.out.print("*");
	    
	    a--;	
	}
	
	while(a>=b);
	}
}
