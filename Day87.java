package soal69;

import java.util.Arrays;
import java.util.Scanner;

public class Saldi {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.print("Masukkan batas array : ");
        int batas = in.nextInt();
        int arr[]= new int[batas];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.nextInt();
            
        }
        System.out.print("Nilai elemen : ");
       for(int a : arr){
           System.out.print(a+" ");
       }
        System.out.println("\ncari : ");
        int b = in.nextInt();
        boolean c = false;
        for (int i = 0; i < arr.length; i++) {
            if(b==arr[i]){
                System.out.println("Berada pada indeks "+i);
            }
        }
        
    }
       }
