package soal69;

import java.util.Scanner;

public class Saldi {
    public static void main(String[] args) {
System.out.print("Method non void : ");
         String a = aku("informatika","Rizaldi");
         System.out.println(a);
         System.out.println();
         System.out.print("Method void : ");
        nama();
        System.out.println();
        System.out.print("method privat : ");
        String c = hobi("sepak bola");
        System.out.println(c);
    }
         public static void nama(){
             String kata = "Rizaldi";
		String kita = kata.substring(0,5);// maka Rizaldi menjadi Rizal
		System.out.println("Substring : "+kita);
		String j = "jurusan saya adalah Sisfo";
		String j1 = j.replace("Sisfo","Informatika");//Mengubah sisfi menjadi informatika
		System.out.println("replace : "+j1);
		String u = " usia saya 18 tahun ";
		String a = u.trim();//menghilangkan spasi awal dan akhir
		System.out.println("trim : "+a);
             System.out.println("Halo nama saya adalah Rizaldi");
         }
         
         public static String aku(String prodi,String nama){
             return prodi+" "+nama;
             
             
         }
         private static String hobi(String b ){
             return b;
         }
}
