package jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
        int menu;

        while (true) {
            System.out.println("\n==== MENU BIOSKOP ====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Nomor baris atau kolom tidak valid!");
                    } else if (penonton[baris-1][kolom-1] != null) {
                        System.out.println("Kursi sudah ditempati!");
                    } else {
                        penonton[baris-1][kolom-1] = nama;
                        System.out.println("Data penonton berhasil disimpan.");
                    }
                    break;
                
                case 2:
                    System.out.println("\n==== DAFTAR PENONTON ====");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String isi = penonton[i][j];
                            System.out.print(isi + "\t");
                        }
                        System.out.println();
                    }
                break;

                case 3:
                    System.out.println("Terima kasih! Program selesai");
                    return;

                default:
                    System.out.println("Menu tidak tersedia, silakan pilih lagi!");
            }
        }

        
    }
}
