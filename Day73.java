import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	int i=1;
		int total = 0;
		do{
		    	System.out.print("Masukan angka(negatif agar berhenti) : ");
		     i = in.nextInt();
		    if(i<0){
		        break;
		        
		    }
		    total+=i;
		}while(true);
		System.out.println(total);
	}
}
