package jobsheet16;

import java.util.Scanner;

public class CM2Magang03 {
    static class Pendaftar {
        String nama;
        String nim;
        String prodi;
        String perusahaan;
        int semester;
        String status;

        Pendaftar(String nama, String nim, String prodi, String perusahaan, int semester, String status) {
            this.nama = nama;
            this.nim = nim;
            this.prodi = prodi;
            this.perusahaan = perusahaan;
            this.semester = semester;
            this.status = status;
        }
    }

    static Pendaftar[] daftar = new Pendaftar[200];
    static int jumlah = 0;

    static void tambahData(Scanner sc) {
        sc.nextLine(); // consume leftover newline from nextInt()
        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Program Studi: ");
        String prodi = sc.nextLine();
        System.out.print("Perusahaan Tujuan Magang: ");
        String perusahaan = sc.nextLine();
        
        int semester;
        while (true) {
            System.out.print("Semester (6 atau 7): ");
            semester = sc.nextInt();
            sc.nextLine(); 
            if (semester == 6 || semester == 7) {
                break;
            } else {
                System.out.println("Semester harus 6 atau 7. Silakan coba lagi.");
            }
        }

        String status;
        while (true) {
            System.out.print("Status Pendaftaran Magang (Diterima/Menunggu/Ditolak): ");
            status = sc.nextLine().trim();
            if (status.equalsIgnoreCase("Diterima") || status.equalsIgnoreCase("Menunggu") || status.equalsIgnoreCase("Ditolak")) {
                break;
            } else {
                System.out.println("Status tidak valid. Silakan coba lagi.");
            }
        }
        daftar[jumlah++] = new Pendaftar(nama, nim, prodi, perusahaan, semester, status);
        System.out.println("Data pendaftar berhasil ditambahkan. Total pendaftar: " + jumlah);
    }

    static void tampilkanData() {
        System.out.println("=== Daftar Pendaftar Magang ===");
        if (jumlah == 0) {
            System.out.println("Belum ada data pendaftar.");
            return;
        }
        
        System.out.printf("%-3s %-20s %-12s %-18s %-10s %-10s%n", "No", "Nama", "NIM", "Program Studi", "Semester", "Status");
        System.out.println("--------------------------------------------------------------------------------");
        for (int i = 0; i < jumlah; i++) {
            Pendaftar p = daftar[i];
            System.out.printf("%-3d %-20s %-12s %-18s %-10d %-10s%n", i + 1, p.nama, p.nim, p.prodi, p.semester, p.status);
        }
    }

    static void cariProdi(Scanner sc) {
        sc.nextLine();
        System.out.println("--- Cari Pendaftar berdasarkan Program Studi ---");
        if (jumlah == 0) {
            System.out.println("Belum ada data pendaftar.");
            return;
        }

        System.out.print("Masukkan program studi: ");
        String cariProdi = sc.nextLine();

        System.out.println("Hasil pencarian untuk Program Studi: " + cariProdi);
        System.out.printf("%-3s %-20s %-12s %-18s %-10s %-10s%n", "No", "Nama", "NIM", "Program Studi", "Semester", "Status");
        System.out.println("--------------------------------------------------------------------------------");
        
        int total = 1;
        for (int i = 0; i < jumlah; i++) {
            Pendaftar p = daftar[i];
            if (p.prodi.equalsIgnoreCase(cariProdi)) {
                System.out.printf("%-3d %-20s %-12s %-18s %-10d %-10s%n", total++, p.nama, p.nim, p.prodi, p.semester, p.status);
            }
        }
        if (total == 1) System.out.println("Tidak ada pendaftar untuk program studi ini.");
    }

    static void hitungStatus() {
        System.out.println("--- Jumlah Pendaftar per Status ---");
        if (jumlah == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }
        int diterima = 0, menunggu = 0, ditolak = 0;
        for (int i = 0; i < jumlah; i++) {
            Pendaftar p = daftar[i];
            if (p.status.equalsIgnoreCase("Diterima")) diterima++;
            else if (p.status.equalsIgnoreCase("Menunggu")) menunggu++;
            else if (p.status.equalsIgnoreCase("Ditolak")) ditolak++;
        }
        System.out.println("Diterima: " + diterima);
        System.out.println("Menunggu: " + menunggu);
        System.out.println("Ditolak : " + ditolak);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("=== Sistem Pendaftaran Magang Mahasiswa ===");
            System.out.println("1. Tambah Data Magang");
            System.out.println("2. Tampilkan Semua Pendaftar Magang");
            System.out.println("3. Cari Pendaftar berdasarkan Program Studi");
            System.out.println("4. Hitung Jumlah Pendaftar untuk Setiap Status");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    tambahData(sc);
                    break;
                case 2:
                    tampilkanData();
                    break;
                case 3:
                    cariProdi(sc);
                    break;
                case 4:
                    hitungStatus();
                    break;
                case 5:
                    System.out.println("Keluar. Terima kasih.");
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        }
        
    }
}
