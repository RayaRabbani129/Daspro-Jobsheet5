import java.util.Scanner;
public class Siakad25 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        System.out.println("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukkan kelas: ");
        kelas= sc.nextLine().charAt(0);
        System.out.println("Masukkan nomor absen:");
        absen = sc.nextByte();
        System.out.println("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan nilai tugas:");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai ujian:");
        nilaiUjian = sc.nextDouble();
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        System.out.println("Nama" + nama +"NIM" + nim);
        System.out.println("Kelas" + kelas + "Absen" + absen);
        System.out.println("Nilai Akhir" + nilaiAkhir);

        if(nilaiAkhir <= 100 && nilaiAkhir >= 80) 
        {
            System.out.println("Nilai akhir huruf: A");
            System.out.println("Kualifikasi: Sangat baik");
        }
        else if (nilaiAkhir >= 73 && nilaiAkhir <= 80)
        {
            System.out.println("Nilai akhir B+");
            System.out.println("Kualifikasi: Lebih dari baik");
        }
        else if (nilaiAkhir > 65 && nilaiAkhir <= 73)
        {
            System.out.println("Nilai akhir huruf: B");
            System.out.println("Kualifikasi: Baik");
        }
        else if (nilaiAkhir > 60 && nilaiAkhir <= 65)
        {
            System.out.println("Nilai akhir huruf: C+");
            System.out.println("Kualifikasi: Lebih dari cukup");
        }
        else if (nilaiAkhir > 50 && nilaiAkhir <= 60)
        {
            System.out.println("Nilai akhir huruf: C");
            System.out.println("Kalifikasi: Cukup");
        }
        else if (nilaiAkhir > 39 && nilaiAkhir <= 50)
        {
            System.out.println("Nilai akhir huruf: D");
            System.out.println("Kualifikasi: kurang");
        }
        else if (nilaiAkhir >=0 && nilaiAkhir <= 39)
        {
            System.out.println("Nilai akhir huruf");
            System.out.println("Kualifikasi: Gagal");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
