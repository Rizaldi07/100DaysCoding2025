 Scanner in = new Scanner(System.in);
        System.out.println("=== Selamat datang ke Restoran Abal-abal ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Nasi Kuning");
        System.out.println("3. Nasi Uduk");
        System.out.println("4. Nasi Campur");
        System.out.println("5. Tidak Memesan");
        System.out.print("Masukkan Menu (1-5) : ");
        int menu = in.nextInt();
        
        System.out.print("Masukkan Jumlah : ");
        int jumlah = in.nextInt();
        int harga = 0;
        
        
        switch(menu ){
            case 1 : 
                harga = 15000 * jumlah;
                System.out.println("Anda memesan Nasi Goreng");
                System.out.println("total belanja anda bayar = "+harga);
                break;
            case 2:
                harga = 10000 * jumlah;
                System.out.println("Anda memesan Nasi Kuning");
                System.out.println("Total belanja anda bayar = "+harga);
                break;
            case 3:
                 harga = 12000 * jumlah;
                System.out.println("Anda memesan Nasi Uduk");
                System.out.println("Total belanja anda bayar = "+harga);
                break;
            case 4:
                harga = 18000 * jumlah;
                System.out.println("Anda memesan Nasi Campur");
                System.out.println("Total belanja anda bayar = "+harga); 
                break;
            case 5:
                System.out.println("Tidak memesan");
                break;
            default:
                System.out.println("Tidak ada di menu");
                break;
        }
        System.out.println();
         System.out.print("Masukkan menu : ");
        int menuu = in.nextInt();
        System.out.print("Masukkan Jumlah : ");
        int jumlah1 = in.nextInt();
       
        int harga1 =0;
            switch(menuu ){
            case 1 : 
                harga1 = 15000 * jumlah1;
                System.out.println("Anda memesan Nasi Goreng");
                System.out.println("total belanja anda bayar = "+harga1);
                break;
            case 2:
                harga1 = 10000 * jumlah1;
                System.out.println("Anda memesan Nasi Kuning");
                System.out.println("Total belanja anda bayar = "+harga1);
                break;
            case 3:
                 harga1 = 12000 * jumlah1;
                System.out.println("Anda memesan Nasi Uduk");
                System.out.println("Total belanja anda bayar = "+harga1);
                break;
            case 4:
                harga1 = 18000 * jumlah1;
                System.out.println("Anda memesan Nasi Campur");
                System.out.println("Total belanja anda bayar = "+harga1); 
                break;
            case 5:
                System.out.println("tidak memesan");
                break;
            default:
                System.out.println("Tidak ada di menu");
                break;
        }
            System.out.println();
             System.out.print("Masukkan menu : ");
        int menu1 = in.nextInt();
        System.out.print("Masukkan Jumlah : ");
        int jumlah2 = in.nextInt();
       
        int harga2 =0;
            switch(menu1 ){
            case 1 : 
                harga2 = 15000 * jumlah2;
                System.out.println("Anda memesan Nasi Goreng");
                System.out.println("total belanja anda bayar = "+harga2);
                break;
            case 2:
                harga2 = 10000 * jumlah2;
                System.out.println("Anda memesan Nasi Kuning");
                System.out.println("Total belanja anda bayar = "+harga2);
                break;
            case 3:
                 harga2 = 12000 * jumlah2;
                System.out.println("Anda memesan Nasi Uduk");
                System.out.println("Total belanja anda bayar = "+harga2);
                break;
            case 4:
                harga2 = 18000 * jumlah2;
                System.out.println("Anda memesan Nasi Campur");
                System.out.println("Total belanja anda bayar = "+harga2); 
                break;
            case 5:
                System.out.println("tidak memesan");
                break;
            default:
                System.out.println("Tidak ada di menu");
                break;
        }
            System.out.println();
             System.out.print("Masukkan menu : ");
        int menu2 = in.nextInt();
        System.out.print("Masukkan Jumlah : ");
        int jumlah3 = in.nextInt();
       
        int harga3 =0;
            switch(menu2 ){
            case 1 : 
                harga3 = 15000 * jumlah3;
                System.out.println("Anda memesan Nasi Goreng");
                System.out.println("total belanja anda bayar = "+harga3);
                break;
            case 2:
                harga3 = 10000 * jumlah3;
                System.out.println("Anda memesan Nasi Kuning");
                System.out.println("Total belanja anda bayar = "+harga3);
                break;
            case 3:
                 harga3 = 12000 * jumlah3;
                System.out.println("Anda memesan Nasi Uduk");
                System.out.println("Total belanja anda bayar = "+harga3);
                break;
            case 4:
                harga3 = 18000 * jumlah3;
                System.out.println("Anda memesan Nasi Campur");
                System.out.println("Total belanja anda bayar = "+harga3); 
                break;
            case 5:
                System.out.println("tidak memesan");
                break;
            default:
                System.out.println("Tidak ada di menu");
                break;
        }
            System.out.println();
        int total = harga + harga1+harga2+harga3;
        System.out.println("Total semua pesanan anda : "+total);
        System.out.println("Terima Kasih");
        in.close();
}
}
