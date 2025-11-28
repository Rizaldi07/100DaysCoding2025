import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int awal =0;
		System.out.print("Masukkan Jumlah Elemen array : ");
		int angka = in.nextInt();
		int arr[]= new int[angka];
		System.out.print("Masukkan elemen array : " );
		do{
		    
		    arr[awal]= in.nextInt();
		    
		    awal++;
		    
		}while(awal<arr.length);
		System.out.println("Output : ");
	for(int a : arr){
	 
	 System.out.println(a);
	 }	
  }
}
