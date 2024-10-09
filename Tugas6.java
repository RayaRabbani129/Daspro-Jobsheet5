import java.util.Scanner;
public class Tugas6 {
    public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);

        int kategori;
        int merk, ukuran, harga = 0;

        System.out.println("=============================");
        System.out.println("======= Toko sepatu =========");
        System.out.println("=============================");
        System.out.println("1. Convers");
        System.out.println("\t 1. Slip on");
        System.out.println("\t 2. High top");
        System.out.println("2. Sketcher");
        System.out.println("\t 1. Woman");
        System.out.println("\t 2. Man");
        System.out.println("3. Nike");
        System.out.println("\t 1. Kids");
        System.out.println("\t 2. Adult");
        System.out.println("Pilih merk = ");
        merk = input25.nextInt();
        input25.nextLine();
        System.out.println("Pilih kategori = ");
        kategori = input25.nextInt();
        System.out.println("Masukkan ukuran sepatu = ");
        ukuran = input25.nextInt();

        if(merk==1){
            if(kategori==1){
                if(ukuran >= 36 && ukuran <= 40){
                    harga = 800000;
                }else{
                    System.out.println("Invalid");
                }
            }else if(kategori==2){
                if(ukuran >= 40 && ukuran <= 44){
                    harga = 1200000;
                }else{
                    System.out.println("Invalid");
                }
            }else{
                System.out.println("Invalid kategori");
            }
        }else if(merk==2){
            if(kategori==1){
                if(ukuran >= 36 && ukuran <= 41){
                    harga = ;
                }
            }
        }
    }
}
