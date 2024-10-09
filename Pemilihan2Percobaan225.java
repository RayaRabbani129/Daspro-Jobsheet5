import java.util.Scanner;

public class Pemilihan2Percobaan225 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        String member, jenisPembayaran;
        double diskon = 0, harga, totalbayar;
        int menu, potonganQRIS = 0;

        System.out.println("------------------------");
        System.out.println("==== Menu Kafe JTI =====");
        System.out.println("------------------------");
        System.out.println("1. Rice Bowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Rice Bowl + Ice Tea)");
        System.out.println("---------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipesan: ");
        menu = input25.nextInt();
        input25.nextLine();  // Untuk membersihkan sisa karakter newline setelah nextInt
        System.out.print("Apakah punya member? (y/n): ");
        member = input25.nextLine();
        System.out.print("Jenis pembayaran? (cash/QRIS): ");
        jenisPembayaran = input25.nextLine();
        System.out.println("---------------------------------------");

        // Mengecek apakah pembelian menggunakan QRIS
        if(jenisPembayaran.equalsIgnoreCase("QRIS")){
            potonganQRIS = 1000;
        }

        if(member.equalsIgnoreCase("y")){
            diskon = 0.10;  // 10% diskon untuk member
            System.out.println("Besar diskon = 10%");
            if(menu == 1){
                harga = 14000;
                System.out.println("Harga Rice Bowl adalah " + harga);
            }
            else if(menu == 2){
                harga = 3000;
                System.out.println("Harga Ice Tea adalah " + harga);
            }
            else if(menu == 3){
                harga = 15000;
                System.out.println("Harga Bundling adalah " + harga);
            }
            else{
                System.out.println("Masukkan pilihan menu yang benar!");
                return;
            }
            totalbayar = harga - (harga * diskon) - potonganQRIS;
            System.out.println("Total bayar setelah diskon dan potongan QRIS = " + totalbayar);
        }
        else if(member.equalsIgnoreCase("n")){
            if(menu == 1){
                harga = 14000;
                System.out.println("Harga Rice Bowl adalah " + harga);
            }
            else if(menu == 2){
                harga = 3000;
                System.out.println("Harga Ice Tea adalah " + harga);
            }
            else if(menu == 3){
                harga = 15000;
                System.out.println("Harga Bundling adalah " + harga);
            }
            else{
                System.out.println("Masukkan pilihan menu yang benar!");
                return;
            }
            totalbayar = harga - potonganQRIS;
            System.out.println("Total bayar setelah potongan QRIS = " + totalbayar);
        }
        else{
            System.out.println("Kategori member tidak valid");
        }
        System.out.println("=======================================");
    }
}