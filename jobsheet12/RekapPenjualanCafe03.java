package jobsheet12;

import java.util.Scanner;

public class RekapPenjualanCafe03 {

    static void inputPenjualan(int[][] penjualan, Scanner sc, String[] daftarMenu, int menu, int hari) {
        System.out.println("==== INPUT DATA PENJUALAN ====");
        for (int i = 0; i < hari; i++) {
            System.out.println("Hari ke-" + (i + 1) + " : ");
            for (int j = 0; j < menu; j++) {
                System.out.print("Penjualan " + daftarMenu[j] + ": ");
                penjualan[j][i] = sc.nextInt();
            }
        }
    }

    static void tampilData(int[][] penjualan, String[] daftarMenu, int menu, int hari) {
        System.out.println();
        System.out.println("=============== REKAP PENJUALAN ===============");
        System.out.printf("%-15s", "Menu");
        for (int i = 0; i < hari; i++) {
            System.out.printf(" H%-2d", (i + 1));
        }
        System.out.println(" | Total");
        System.out.println("---------------------------------------------------------");

        for (int j = 0; j < menu; j++) {
            System.out.printf("%-15s", daftarMenu[j]);
            int total = 0;
            for (int d = 0; d < hari; d++) {
                System.out.printf(" %3d", penjualan[j][d]);
                total += penjualan[j][d];
            }
            System.out.println(" | " + total);
        }
    }

    static void menuTertinggi (int[][] penjualan, String[] daftarMenu, int menu, int hari) {
        int best = 0;
        int bestTotal = -1;
        for (int j = 0; j < menu; j++) {
            int total = 0;
            for (int i = 0; i < hari; i++) {
                total += penjualan[j][i];
            }
            if (total > bestTotal) {
                bestTotal = total;
                best = j;
            }
        }
        System.out.println("Menu dengan penjualan tertinggi: " + daftarMenu[best] + " -> " + bestTotal);
    }

    static void rataPenjualan (int[][] penjualan, String[] daftarMenu, int menu, int hari) {
        System.out.println("Rata-rata per menu:");
        for (int j = 0; j < menu; j++) {
            int total = 0;
            for (int i = 0; i < hari; i++) {
                total += penjualan[j][i];
            }
            double rata = (double) total / hari;
            System.out.printf("- %s: %.2f%n", daftarMenu[j], rata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah menu: ");
        int menu = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int hari = sc.nextInt();
        sc.nextLine(); 

        String[] daftarMenu = new String[menu];
        for (int j = 0; j < menu; j++) {
            System.out.print("Nama menu ke-" + (j + 1) + ": ");
            daftarMenu[j] = sc.nextLine();
        }

        int[][] penjualan = new int[menu][hari];

        inputPenjualan(penjualan, sc, daftarMenu, menu, hari);
        tampilData(penjualan, daftarMenu, menu, hari);
        menuTertinggi(penjualan, daftarMenu, menu, hari);
        rataPenjualan(penjualan, daftarMenu, menu, hari);
    }
}
