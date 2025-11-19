package kuis2;
// Angela Salma_254107060006_SIB-1A_Soal ke-3
import java.util.Scanner;

public class Soal303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] kursi = new char[5][6];
        int menu, baris, kolom;

        // Inisialisasi semua kursi sebagai 'O' 
        for (int i = 0; i < kursi.length; i++) {
            for (int j = 0; j < kursi[i].length; j++) {
                kursi[i][j] = 'O';
            }
        }

        while (true) {
            System.out.println("==== MENU BIOSKOP ====");
            System.out.println("1. Tampilkan denah kursi");
            System.out.println("2. Pesan Kursi");
            System.out.println("3. Batalkan pemesanan kursi");
            System.out.println("4. Hitung jumlah kursi kosong dan terisi");
            System.out.println("5. Keluar");
            menu = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (menu) {
                // Menu 1: menampilkan denah kursi 
                case 1:
                    System.out.println("==== DENAH KURSI ====");
                    for (int i = 0; i < kursi.length; i++) {
                        for (int j = 0; j < kursi[i].length; j++) {
                            System.out.print(kursi[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                // Menu 2: memesan kursi 
                case 2:
                    System.out.print("Masukkan baris (1-5): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-6): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > kursi.length || kolom < 1 || kolom > kursi[0].length) {
                        System.out.println("Posisi tidak valid. Baris 1-5, kolom 1-6.");
                    } else if (kursi[baris-1][kolom-1] == 'O') {
                        kursi[baris-1][kolom-1] = 'X';
                        System.out.println("Pemesanan berhasil. Kursi terisi.");
                    } else {
                        System.out.println("Kursi sudah terisi.");
                    }
                    System.out.println();
                    break;

                // Menu 3: membatalkan pemesanan kursi 
                case 3:
                    System.out.print("Masukkan baris (1-5) untuk membatalkan: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-6) untuk membatalkan: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > kursi.length || kolom < 1 || kolom > kursi[0].length) {
                        System.out.println("Posisi tidak valid. Baris 1-5, kolom 1-6.");
                    } else if (kursi[baris-1][kolom-1] == 'X') {
                        kursi[baris-1][kolom-1] = 'O';
                        System.out.println("Pembatalan berhasil. Kursi kosong.");
                    } else {
                        System.out.println("Kursi kosong.");
                    }
                    System.out.println();
                    break;

                // Menu 4: menghitung jumlah kursi kosong dan terisi 
                case 4:
                    int kosong = 0, terisi = 0;
                    for (int i = 0; i < kursi.length; i++) {
                        for (int j = 0; j < kursi[i].length; j++) {
                            if (kursi[i][j] == 'O') {
                                kosong++;
                            } else if (kursi[i][j] == 'X') {
                                terisi++;
                            }
                        }
                    }
                    System.out.println("Jumlah kursi kosong: " + kosong);
                    System.out.println("Jumlah kursi terisi: " + terisi);
                    System.out.println();
                    break;
                
                // Menu 5: keluar dari program 
                case 5:
                    System.out.println("Keluar. Terima Kasih.");
                    return;
                
                // Default apaabila user memasukkan angka menu yang tidak valid 
                default:
                    System.out.println("Menu tidak tersedia, silakan pilih lagi!");
                    System.out.println();
            }

        }

    }
}