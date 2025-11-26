
package soal69;

import java.util.Arrays;
import java.util.Scanner;

public class Saldi {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
       System.out.print("Masukkan batas array : ");
       int batas = in.nextInt();
       int arr[]= new int[batas];
       for (int i = 0; i < arr.length; i++) 
       {
        System.out.print("Masukkan nilai ke"+(i+1)+" : ");
       arr[i]= in.nextInt(); 
       }
          
        System.out.print("Nilai array : ");
       for(int a : arr)
       {
       System.out.print(a+" ");
       }
        System.out.print("atau "+Arrays.toString(arr));
       }
       }
