import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Masukkan batas : ");
	int a = in.nextInt();
	int arr[]= new int[a];
	int maks = 0;
	int awal=0;
	while(awal<arr.length){
	    arr[awal] = in.nextInt();
	    if(arr[awal]>maks){
	        maks=arr[awal];
	        }
	        
	    awal++;    
	}
	       
	       
	
	        System.out.println("Nilai Maksimalnya adalah : "+maks);	
	}
}
