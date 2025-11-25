
package soal69;

import java.util.Scanner;

public class Saldi {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
            System.out.println("======= Akun Mobile Legend Kamu =======");
            String user = "SHIROE S.";
            String PW = "shiroe123";
           
            do{
                System.out.print("Masukkan Username : ");
                String nama = in.nextLine();
                System.out.print("Masukkan Sandi : ");
                String sandi= in.nextLine();
                if(nama.equals(user)&& !sandi.equals(PW)){
                    System.out.println("Sandi salah, Coba lagi");   
                }else if(!nama.equals(user) && sandi.equals(PW)){
                    System.out.println("User name anda salah, coba lagi ");
                }else if(!nama.equals(user) && !sandi.equals(PW)){
                    System.out.println("Username dan Sandi anda salah, coba lagi");
                }else{
                    System.out.println("Selamat Datang SHIROE S., Selamat Bersenang-senang membantai para poke-poke di Land Of Down");
                    break;
                }
               
            }while(true);
         }
}

    
