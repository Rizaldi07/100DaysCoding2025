import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
System.out.print("Masukkan angka pertama : ");
int angka = in.nextInt();
System.out.print("Masukkan Operator aritmatika (+,-,*,/,%) : ");

char op = in.next().charAt(0);

System.out.print("Masukkan angka kedua : ");
int angka1  = in.nextInt();
int jumlah = 0;
switch(op){
	case '+':
	  jumlah = angka+angka1;
	System.out.println("Hasil dari penjumlahan "+angka+" + "+angka1+" adalah "+jumlah);
	break;
	case '-':
	  jumlah = angka-angka1;
	System.out.println("Hasil dari pengurangan "+angka+" - "+angka1+" adalah "+jumlah);
	break;
	case '*':
	  jumlah = angka*angka1;
	System.out.println("Hasil dari perkalian "+angka+" * "+angka1+" adalah "+jumlah);
	break;
	case '/':
	if(angka1!=0){
	  jumlah = angka/angka1;
	
	System.out.println("Hasil dari pembagian "+angka+" / "+angka1+" adalah "+jumlah);
	}else{
	    System.out.print("error, tidak bisa di bagi 0");
	}
	break;
	case '%':
	  jumlah = angka%angka1;
	System.out.println("Hasil dari modulus "+angka+" % "+angka1+" adalah "+jumlah);
	break;
	default:
	System.out.println("operasi aritmatika apa kamu masukkan tuh?");
	break;
}
in.close();
	}
}
