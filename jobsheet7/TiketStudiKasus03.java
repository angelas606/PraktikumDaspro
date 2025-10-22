package jobsheet7;

import java.util.Scanner;

public class TiketStudiKasus03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga = 50000, totalTiket = 0, jml;
        double totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket terjual (0 untuk selesai): ");
            jml = sc.nextInt();
            if (jml == 0) {
                break;
            }
            if (jml < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi jumlah tiket yang valid!");
                continue;
            }

            double totalHarga = harga * jml;
            double diskon = 0;

            if (jml > 10) {
                diskon = totalHarga * 0.15;
            } else if (jml > 4) {
                diskon = totalHarga * 0.10;
            }

            double totalBayar = totalHarga - diskon;
            System.out.println("Total harga untuk " + jml + " tiket: Rp" + (int) totalHarga);
            System.out.println("Total diskon untuk " + jml + " tiket: Rp " + (int) diskon);
            System.out.println("Total bayar untuk " + jml + " tiket: Rp " + (int) totalBayar);
            System.out.println();

            totalTiket += jml;
            totalPenjualan += totalBayar;
        }

        System.out.println("Total tiket terjual hari ini : " + totalTiket);
        System.out.printf("Total penjualan hari ini     : Rp " + (int) totalPenjualan);
    }
}
