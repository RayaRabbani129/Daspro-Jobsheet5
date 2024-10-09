import java.util.Scanner;
public class Biayaparkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kendaraan;
        int lamadurasi;
        double totalPembayaran = 0;

        System.out.println("Program hitung pembayaran parkir");
        System.out.println("Masukkan 1 untuk Mobil, 2 untuk Motor, atau 0 untuk keluar");

        while (true) {
            System.out.print("Jenis kendaraan (1/2/0): ");
            kendaraan = sc.nextInt();

            if (kendaraan == 0) {
                break;
            }

            System.out.print("Durasi parkir (jam): ");
            lamadurasi = sc.nextInt();

            if (lamadurasi <= 0) {
                System.out.println("Durasi tidak valid. Harus lebih dari 0 jam.");
                continue;
            }

            double biaya;
            if (lamadurasi > 5) {
                biaya = 12500;
            } else {
                if(kendaraan == 1) {
                    biaya = 3000 * lamadurasi; 
                }else if (kendaraan == 2) {
                    biaya = 2000 * lamadurasi; 
                }else {
                    System.out.println("Jenis kendaraan tidak valid.");
                    continue;
                }
            }

            totalPembayaran += biaya;
            System.out.println("Biaya parkir: Rp " + biaya);
        }

        System.out.println("Total pembayaran parkir: Rp " + totalPembayaran);
        sc.close();
    }
}
