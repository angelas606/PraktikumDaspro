package kuis2;
// Angela Salma_254107060006_SIB-1A_Soal ke-2
import java.util.Scanner;

public class Soal203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nilai = new int[4][3];

        // Input nilai untuk setiap siswa dan matkul
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Masukkan nilai Mahasiswa ke-" + (i + 1));

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Masukkan nilai mata kuliah " + (j + 1) + " : ");
                nilai[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // Hitung rata-rata dan status tiap siswa
        for (int i = 0; i < nilai.length; i++) {
            int total = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                total += nilai[i][j];
            }
            
            double rata = (double) total / nilai[i].length;
            String status = rata >= 60 ? "Lulus" : "Tidak Lulus";
            System.out.printf("Siswa %d: rata-rata = %.2f, status = %s%n", (i + 1), rata, status);
        }
    }
}
