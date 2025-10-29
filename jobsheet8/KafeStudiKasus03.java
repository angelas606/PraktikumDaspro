package jobsheet8;

import java.util.Scanner;

public class KafeStudiKasus03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah cabang kafe: ");
        int cabang = sc.nextInt();
        System.out.println();
        System.out.println("=== Input Penjualan Per Cabang ===");

        int totalPelangganAll = 0;
        int totalItemAll = 0;

        for (int c = 1; c <= cabang; c++) {
            System.out.println();
            System.out.println("--- Cabang " + c + " ---");

            int jumlahPelanggan;
            do {
                System.out.print("Jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif. Masukkan lagi.");
                }
            } while (jumlahPelanggan < 0);

            int itemTerjualCabang = 0;
            for (int p = 1; p <= jumlahPelanggan; p++) {
                int item;
                do {
                    System.out.print("- Pelanggan " + p + " memesan berapa item? ");
                    item = sc.nextInt();
                    if (item < 1) {
                        System.out.println("Jumlah item harus minimal 1. Masukkan lagi.");
                    }
                } while (item < 1);
                itemTerjualCabang += item;
            }

            // Ringkasan cabang
            System.out.println("Cabang " + c + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + itemTerjualCabang);

            totalPelangganAll += jumlahPelanggan;
            totalItemAll += itemTerjualCabang;
        }

        // Ringkasan seluruh cabang
        System.out.println();
        System.out.println("Total seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelangganAll + " orang");
        System.out.println("Item terjual: " + totalItemAll + " item");
    }
}
