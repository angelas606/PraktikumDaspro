package jobsheet12;

import java.util.Scanner;

public class Kafe03 {
    static String[] daftarMenu = {"Kopi Hitam", "Capuccino", "Latte", "Teh Tarik", "Roti Bakar", "Mie Goreng"};
    static int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        
        if (kodePromo != null && kodePromo.equals("DISKON50")) {
            System.out.println("Anda berhasil mendapatkan diskon 50%!");
        } else if (kodePromo != null && kodePromo.equals("DISKON30")) {
            System.out.println("Anda berhasil mendapatkan diskon 30%!");
        } else if (kodePromo == null || kodePromo.isEmpty()) {
            System.out.println("Tidak ada kode promo.");
        } else {
            System.out.println("Kode promo tidak valid.");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        for (int i = 0; i < daftarMenu.length; i++) {
            System.out.printf("%d. %s - Rp %,d%n", (i + 1), daftarMenu[i], hargaItem[i]);
        }
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan (masukkan 0 jika selesai)");
    }

    public static int hitungTotalHargaTotal(int totalHarga, boolean isMember, String kodePromo) {
        System.out.printf("Total sebelum diskon: Rp %,d%n", totalHarga);

        int diskonPromo = 0;
        if (kodePromo != null && kodePromo.equals("DISKON50")) {
            diskonPromo = totalHarga * 50 / 100;
            System.out.printf("Diskon promo 50%%: Rp %,d%n", diskonPromo);
        } else if (kodePromo != null && kodePromo.equals("DISKON30")) {
            diskonPromo = totalHarga * 30 / 100;
            System.out.printf("Diskon promo 30%%: Rp %,d%n", diskonPromo);
        } else if (kodePromo == null || kodePromo.isEmpty()) {
            System.out.println("Tidak ada kode promo.");
        } else {
            System.out.println("Kode promo tidak valid. Tidak ada diskon promo.");
        }

        int hargaSetelahPromo = totalHarga - diskonPromo;

        int diskonMember = 0;
        if (isMember) {
            diskonMember = hargaSetelahPromo * 10 / 100;
            System.out.printf("Diskon member 10%%: Rp %,d%n", diskonMember);
        }

        int hargaAkhir = hargaSetelahPromo - diskonMember;
        System.out.printf("Total setelah diskon: Rp %,d%n", hargaAkhir);
        return hargaAkhir;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc.nextLine();

        System.out.print("Apakah memiliki member? (true/false): ");
        boolean isMember = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Masukkan kode promo (kosong jika tidak ada): ");
        String kodePromo = sc.nextLine();

        Menu(namaPelanggan, isMember, kodePromo);
        int[] jumlahPesanan = new int[daftarMenu.length];

        while (true) {
            System.out.print("Masukkan nomor menu (0 selesai): ");
            int pilihanMenu = sc.nextInt();
            if (pilihanMenu == 0) break;
            if (pilihanMenu < 1 || pilihanMenu > daftarMenu.length) {
                System.out.println("Pilihan tidak valid, coba lagi.");
                continue;
            }
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            if (banyakItem <= 0) {
                System.out.println("Jumlah harus > 0, pesanan diabaikan.");
                continue;
            }
            jumlahPesanan[pilihanMenu - 1] += banyakItem;
            System.out.println("Ditambahkan: " + banyakItem + " x " + daftarMenu[pilihanMenu - 1]);
        }

        // Hitung total per menu dan total keseluruhan
        int totalKeseluruhan = 0;
        System.out.println();
        System.out.println("Rincian pesanan:");
        for (int i = 0; i < daftarMenu.length; i++) {
            if (jumlahPesanan[i] > 0) {
                int subtotal = jumlahPesanan[i] * hargaItem[i];
                totalKeseluruhan += subtotal;
                System.out.printf("- %s x %d = Rp %,d%n", daftarMenu[i], jumlahPesanan[i], subtotal);
            }
        }

        if (totalKeseluruhan == 0) {
            System.out.println("Tidak ada pesanan. Terima kasih.");
            return;
        }

        int totalAkhir = hitungTotalHargaTotal(totalKeseluruhan, isMember, kodePromo);
        System.out.printf("Total harga untuk pesanan Anda: Rp %,d%n", totalAkhir);
    }
}
