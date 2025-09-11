public class SaldiJhy {
    public static void main(String[] args) {
       //Byte: batas bilangan bulat untuk tipe data byte mulai dari -128 sampai dengan 127
       byte angka = 127;
       byte angka1= -128;
       //short : batas bilangan bulat unutk tipe data short mulai dari -32,768 sampai dengan 32767
       short anka = 32767;
       short angka2 = -32768;
       //integer : batas bilangan bulat untuk tipe data short mulai dari -2,147,483,648 sampai 2,147,483,647
       int angka3 = -2147483648;
       int anka1 = -2147483648;
       //long : batas bilangan bulat untuk tipe data long mulai dari -9,223,372,036,854,775,808 sampai 9,223,372,036,854,775,807
       // dan untuk tipe data long harus menyertakan huruf (L) di belakang nilai agar tidak error
       long angka4 = -9223372036854775808l;
       long ankaa = 9223372036854775807l;
        System.out.println("batas bilangan tipe data byte mulai dari "+angka1+" sampai dengan "+angka);
        System.out.println("batas bilangan tipe data short mulai dari "+angka2+" sampai dengan "+anka);
        System.out.println("batas bilangan tipe data integer mulai dari "+angka3+" sampai dengan "+anka1);
        System.out.println("batas bilangan tipe data long dimulai dari "+angka4+" sampai dengan "+ankaa);
        
    }
}
