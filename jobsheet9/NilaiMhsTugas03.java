package jobsheet9;

import java.util.Scanner;

public class NilaiMhsTugas03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai yang akan di input: ");
        int jumlah = sc.nextInt();

        int[] nilaiMhs = new int[jumlah];
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        double total = 0;
        int max = 0, min = 100;
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > max) {
            max = nilaiMhs[i];
            } if (nilaiMhs[i] < min) {
            min = nilaiMhs[i];
            }
        }

        double rata = total/nilaiMhs.length;

        System.out.println();
        System.out.println("Rata-rata nilai: " + rata);
        System.out.println("Nilai mahasiswa tertinggi: " + max);
        System.out.println("Nilai mahasiswa tereendah: " + min);
        System.out.println();
        System.out.println("========== Rekap Nilai Mahasiswa ==========");

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + " adalah " + nilaiMhs[i]);
        }
    }
}
