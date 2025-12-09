import java.util.Scanner;
public class Soal69a {
    public static void main(String[] args) {
Scanner in =new Scanner (System.in);
        System.out.print("pembulatan ke terdekat : ");
        double a = in.nextDouble();
        System.out.print("pembulatan ke bawah : ");
        float c = in.nextFloat();
        System.out.print("pembulatan ke atas : ");
        double d = in.nextDouble();
        long b = Math.round(a);
        int e = (int) Math.floor(c);
        int f = (int)Math.ceil(d);
        
        
        System.out.println(a+" dibulatan ke bilangan bulat terdekat yaitu "+b);
        System.out.println(c+" dibulatan kebawah menjadi "+e);
        System.out.println(d+" dibulatan keatas menjadi "+f);
