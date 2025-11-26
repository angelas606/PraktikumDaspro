package jobsheet12;

import java.util. Scanner;

public class Kafe03 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        
        if (kodePromo != null && !kodePromo.isEmpty()) {
            if (kodePromo.equals("DISKON50")) {
                System.out.println("Anda berhasil mendapatkan diskon 50%!");
            } else if (kodePromo.equals("DISKON30")) {
                System.out.println("Anda berhasil mendapatkan diskon 30%!");
            } else {
                System.out.println("Kode promo tidak valid.");
            }
        } 

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Capuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan");
        
    }

    public static int hitungTotalHarga03(int pilihanMenu, int banyakItem) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItem[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Budi", true, "DISKON30");

        System.out.print("Masukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga03(pilihanMenu, banyakItem);
        System.out.printf("Total harga untuk pesanan Anda: Rp %,d%n", totalHarga);
    }
}
