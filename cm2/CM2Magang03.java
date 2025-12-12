package cm2;

import java.util.Scanner;

public class CM2Magang03 {
    static String[] nama = new String[200];
    static String[] nim = new String[200];
    static String[] prodi = new String[200];
    static String[] perusahaan = new String[200];
    static int[] semester = new int[200];
    static String[] status = new String[200];
    static int jumlah = 0;

    // Fungsi unuk menambah data pendaftar magang
    static void tambahData(Scanner sc) {
        sc.nextLine(); 
        System.out.print("Nama Mahasiswa: ");
        String inputNama = sc.nextLine();
        System.out.print("NIM: ");
        String inputNim = sc.nextLine();
        System.out.print("Program Studi: ");
        String inputProdi = sc.nextLine();
        System.out.print("Perusahaan Tujuan Magang: ");
        String inputPerusahaan = sc.nextLine();
        
        int inputSemester;
        while (true) {
            System.out.print("Semester (6 atau 7): ");
            inputSemester = sc.nextInt();
            sc.nextLine(); 
            if (inputSemester == 6 || inputSemester == 7) {
                break;
            } else {
                System.out.println("Semester harus 6 atau 7. Silakan coba lagi.");
            }
        }

        String inputStatus;
        while (true) {
            System.out.print("Status Pendaftaran Magang (Diterima/Menunggu/Ditolak): ");
            inputStatus = sc.nextLine().trim();
            if (inputStatus.equalsIgnoreCase("Diterima") || inputStatus.equalsIgnoreCase("Menunggu") || inputStatus.equalsIgnoreCase("Ditolak")) {
                break;
            } else {
                System.out.println("Status tidak valid. Silakan coba lagi.");
            }
        }
        nama[jumlah] = inputNama;
        nim[jumlah] = inputNim;
        prodi[jumlah] = inputProdi;
        perusahaan[jumlah] = inputPerusahaan;
        semester[jumlah] = inputSemester;
        status[jumlah] = inputStatus;
        jumlah++;
        System.out.println("Data pendaftar berhasil ditambahkan. Total pendaftar: " + jumlah);
    }
    
    // Fungsi untuk menampilkan semua data pendaftar magang
    static void tampilkanData() {
        System.out.println("=== Daftar Pendaftar Magang ===");
        if (jumlah == 0) {
            System.out.println("Belum ada data pendaftar.");
            return;
        }
        
        System.out.printf("%-3s %-20s %-12s %-18s %-10s %-10s%n", "No", "Nama", "NIM", "Program Studi", "Semester", "Status");
        System.out.println("--------------------------------------------------------------------------------");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-3d %-20s %-12s %-18s %-10d %-10s%n", i + 1, nama[i], nim[i], prodi[i], semester[i], status[i]);
        }
    }

    // Fungsi untuk mencari pendaftar berdasarkan program studi
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
            if (prodi[i].equalsIgnoreCase(cariProdi)) {
                System.out.printf("%-3d %-20s %-12s %-18s %-10d %-10s%n", total++, nama[i], nim[i], prodi[i], semester[i], status[i]);
            }
        }
        if (total == 1) System.out.println("Tidak ada pendaftar untuk program studi ini.");
    }

    // Fungsi untuk menghitung jumlah pendaftar untuk setiap status
    static void hitungStatus() {
        System.out.println("--- Jumlah Pendaftar per Status ---");
        // Apabila belum ada pendaftar 
        if (jumlah == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        int diterima = 0, menunggu = 0, ditolak = 0; 
        for (int i = 0; i < jumlah; i++) {
            if (status[i].equalsIgnoreCase("Diterima")) diterima++;
            else if (status[i].equalsIgnoreCase("Menunggu")) menunggu++;
            else if (status[i].equalsIgnoreCase("Ditolak")) ditolak++;
        }
        System.out.println("Diterima: " + diterima);
        System.out.println("Menunggu: " + menunggu);
        System.out.println("Ditolak : " + ditolak);
    }

    // Fungsi main 
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