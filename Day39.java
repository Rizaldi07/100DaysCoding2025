
package saldid;

import java.util.Scanner;

public class SaldiD {

    public static void main(String[] args) {
        System.out.println("I Sekai No Resutoran E Youkoso");
        String ma,a,b,c,d,e,f,g,h;
        int j,k,l,m,n,o,pu,q;
         ma = "================Menu=================";
         a = "Bakso";  
         b = "Nasi Goreng";
         c = "Mie Ayam";
         d = "Gado-Gado";
         e = "Es teh";
         f = "Kopi";
         g = "Kopi Susu";
         h = "jus jeruk";
         j = 12;
         k = 15;
         l = 20;
         m = 15;
         n = 5;
         o = 5;
         pu = 8;
         q = 10;
        System.out.println(ma);
        System.out.println("====Makanan====");
        System.out.println(a+" \t\t: "+j+"K");
        System.out.println(b+" \t: "+k+"K");
        System.out.println(c+" \t\t: "+l+"K");
        System.out.println(d+" \t\t: "+m+"K");
        System.out.println("=====Minuman=====");
        System.out.println(e+" \t\t: "+n+"K");
        System.out.println(f+" \t\t: "+o+"K");
        System.out.println(g+" \t: "+pu+"K");
        System.out.println(h+" \t: "+q+"K");
       
       Scanner in = new Scanner(System.in);
        System.out.println("Silahkan Pesan");
        System.out.print("Makanan : ");
        String p = in.nextLine();
        System.out.print("Minuman : ");
        String mi = in.nextLine();
         System.out.println();
      if(p.equalsIgnoreCase(a)){
          System.out.println("Anda memesan "+a);
          System.out.println("Harga "+a+"nya sebesar "+j+"K");
          if(p.equalsIgnoreCase("bakso")&& mi.equalsIgnoreCase("es teh")){
              System.out.println("Anda memesan "+e);
              System.out.println("Harga "+e+"nya sebesar "+n+"K");
              System.out.println("Total belanja anda "+(j+n)+"K");
          }else if(p.equalsIgnoreCase("bakso")&& mi.equalsIgnoreCase("kopi")){
              System.out.println("Anda memesan "+f);
              System.out.println("Harga "+f+"nya sebesar "+o+"K");
              System.out.println("Total belanja anda "+(j+o)+"K");
          }  else if(p.equalsIgnoreCase("bakso")&& mi.equalsIgnoreCase("kopi susu")){
              System.out.println("Anda memesan "+g);
              System.out.println("Harga "+g+"nya sebesar "+pu+"K");
              System.out.println("Total belanja anda "+(j+pu)+"K");
          }else if(p.equalsIgnoreCase("bakso")&& mi.equalsIgnoreCase("jus jeruk")){
              System.out.println("Anda memesan "+h);
              System.out.println("Harga "+h+"nya sebesar "+q+"K");
              System.out.println("Total belanja anda "+(j+q)+"K");
      }
      }else if(p.equalsIgnoreCase(b)){
          System.out.println("Pesanan anda adalah "+b);
          System.out.println("Harga "+b+"nya sebesar "+k+"K");
          if(p.equalsIgnoreCase("nasi goreng")&& mi.equalsIgnoreCase("es teh")){
              System.out.println("Anda memesan "+e);
              System.out.println("Harga "+e+"nya sebesar "+n+"K");
              System.out.println("Total belanja anda "+(k+n)+"K");
          }else if(p.equalsIgnoreCase("nasi goreng")&& mi.equalsIgnoreCase("kopi")){
              System.out.println("Anda memesan "+f);
              System.out.println("Harga "+f+"nya sebesar "+o+"K");
              System.out.println("Total belanja anda "+(k+o)+"K");
          }  else if(p.equalsIgnoreCase("nasi goreng")&& mi.equalsIgnoreCase("kopi susu")){
              System.out.println("Anda memesan "+g);
              System.out.println("Harga "+g+"nya sebesar "+pu+"K");
              System.out.println("Total belanja anda "+(k+pu)+"K");
          }else if(p.equalsIgnoreCase("nasi goreng")&& mi.equalsIgnoreCase("jus jeruk")){
              System.out.println("Anda memesan "+h);
              System.out.println("Harga "+h+"nya sebesar "+q+"K");
              System.out.println("Total belanja anda "+(k+q)+"K");}
      }else if(p.equalsIgnoreCase(c)){
          System.out.println("Pesanan anda adalah "+c);
          System.out.println("Harga "+c+"nya sebesar "+l+"K");
          if(p.equalsIgnoreCase("mie ayam")&& mi.equalsIgnoreCase("es teh")){
              System.out.println("Anda memesan "+e);
              System.out.println("Harga "+e+"nya sebesar "+n+"K");
              System.out.println("Total belanja anda "+(l+n)+"K");
          }else if(p.equalsIgnoreCase("mie ayam")&& mi.equalsIgnoreCase("kopi")){
              System.out.println("Anda memesan "+f);
              System.out.println("Harga "+f+"nya sebesar "+o+"K");
              System.out.println("Total belanja anda "+(l+o)+"K");
          }  else if(p.equalsIgnoreCase("mie ayam")&& mi.equalsIgnoreCase("kopi susu")){
              System.out.println("Anda memesan "+g);
              System.out.println("Harga "+g+"nya sebesar "+pu+"K");
              System.out.println("Total belanja anda "+(l+pu)+"K");
          }else if(p.equalsIgnoreCase("mie ayam")&& mi.equalsIgnoreCase("jus jeruk")){
              System.out.println("Anda memesan "+h);
              System.out.println("Harga "+h+"nya sebesar "+q+"K");
              System.out.println("Total belanja anda "+(j+q)+"K");
          }
      }else if(p.equalsIgnoreCase(d)){
          System.out.println("Pesanan anda adalah "+d);
          System.out.println("Harga "+d+"nya sebesar "+m+"K");
          if(p.equalsIgnoreCase("gado-gado")&& mi.equalsIgnoreCase("es teh")){
              System.out.println("Anda memesan "+e);
              System.out.println("Harga "+e+"nya sebesar "+n+"K");
              System.out.println("Total belanja anda "+(m+n)+"K");
          }else if(p.equalsIgnoreCase("gado-gado")&& mi.equalsIgnoreCase("kopi")){
              System.out.println("Anda memesan "+f);
              System.out.println("Harga "+f+"nya sebesar "+o+"K");
              System.out.println("Total belanja anda "+(m+o)+"K");
          }  else if(p.equalsIgnoreCase("gado-gado")&& mi.equalsIgnoreCase("kopi susu")){
              System.out.println("Anda memesan "+g);
              System.out.println("Harga "+g+"nya sebesar "+pu+"K");
              System.out.println("Total belanja anda "+(m+pu)+"K");
          }else if(p.equalsIgnoreCase("gado-gado")&& mi.equalsIgnoreCase("jus jeruk")){
              System.out.println("Anda memesan "+h);
              System.out.println("Harga "+h+"nya sebesar "+q+"K");
              System.out.println("Total belanja anda "+(m+q)+"K");}
      }else{
          System.out.println("Maaf Yang anda inginkan tidak tersedia di menu");
          System.out.println("Mohon pesan sesuai yang ada di menu ");}
      }
    }  

