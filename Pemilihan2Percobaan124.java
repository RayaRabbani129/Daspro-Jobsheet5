import java.util.Scanner;
public class Pemilihan2Percobaan124 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        int tahun;
        System.out.print("Masukkan tahun: ");
        tahun = input24.nextInt();

        // Aturan kabisat yang benar
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println("Sekarang adalah tahun kabisat");
        } else {
            System.out.println("Bukan tahun kabisat");
        }
    }
}