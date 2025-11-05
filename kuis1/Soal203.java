//Angela Salma_254107060006_SIB-1A_Soal ke-2
import java.util.Scanner;

public class Soal203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahBbm, jarak, lamaHari, biayaTol, totalBbm, totalBiaya;
        int jasaSupir = 300000, hargaBbm = 12000;
        //dengan rata-rata 1 liter bensin untuk 2 km dan harga bensin 12000 per liter

        System.out.println("Masukkan lama perjalanan (hari): ");
        lamaHari = sc.nextInt();
        System.out.println("Masukkan jarak perjalanan (km): ");
        jarak = sc.nextInt();
        System.out.println("Masukkan biaya tol: ");
        biayaTol = sc.nextInt();

        jumlahBbm = jarak/ 2;
        totalBbm = jumlahBbm*hargaBbm;
        totalBiaya = (jasaSupir*lamaHari)+totalBbm+biayaTol;

        System.out.println("Banyak BBM yang digunakan adalah " + jumlahBbm + " liter");
        System.out.println("Total biaya perjalanan adalah Rp " + totalBiaya);

    }
}
