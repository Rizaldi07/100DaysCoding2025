package soal69;

import java.util.Arrays;
import java.util.Scanner;

public class Saldi {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.print("Masukkan batas elemen array : ");
        int batas = in.nextInt();
        int arr[]= new int[batas];
        int awal = 0;
        int jumlah = 0;
        while(awal<arr.length){
        System.out.print("Masukkan elemen array ke-"+awal+" : ");
            arr[awal]= in.nextInt();
            jumlah+=arr[awal];
            awal++;
            
        }
        System.out.println("Hasil dari penjumlahan elemen array : "+jumlah);
       }
       }
