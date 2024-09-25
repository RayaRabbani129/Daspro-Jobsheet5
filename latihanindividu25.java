import java.util.Scanner;
public class latihanindividu25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan umur:");
        int umur = input.nextInt();

        if (umur<0) {
            System.out.println("Input tidak valid");
        }
        else if (umur>0 && umur <=12) {
            System.out.println("Umur dikategorikan anak anak");
        }
        else if (umur >= 13 && umur <= 19) {
            System.out.println("Umur dikategorikan remaja");
        }
        else if (umur >= 20 && umur <=64) {
            System.out.println("Umur dikategorikan dewasa");
        }
        else {
            System.out.println("Umur dikategorikan lansia");
        }
        }
}
