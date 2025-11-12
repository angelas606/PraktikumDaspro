package jobsheet10;

import java.util.Scanner;

public class SurveiTugas03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int responden = 10;
        int pertanyaan = 6;
        int[][] survey = new int[responden][pertanyaan];

        for (int i = 0; i < survey.length; i++) {
            System.out.println("Responden ke-" + (i+1));

            for (int j = 0; j < survey[i].length; j++) {
                int val = -1;
                while (val < 1 || val > 5) {
                    System.out.print("Nilai pertanyaan ke-" + (j+1) + " (1-5): ");
                    if (sc.hasNextInt()) {
                        val = sc.nextInt();
                    } else {
                        sc.next();
                    }
                    if (val < 1 || val > 5) {
                        System.out.println("Masukan tidak valid. Masukkan angka 1-5");
                    }
                }
                survey[i][j] = val;
            }
        }

        System.out.println("\n==== RATA-RATA PER RESPONDEN ====");
        for (int i =0; i < survey.length; i++) {
            int total = 0;

            for (int j= 0; j < survey[0].length; j++) {
                total += survey[i][j];
            }
            
            double rata = (double) total / survey[i].length;
            System.out.printf("Responden %d: %.2f%n", (i+1), rata);
        }

        System.out.println("\n==== RATA-RATA PER PERTANYAAN ====");
        for (int j = 0; j < survey[0].length; j++) {
            int total = 0;
            for (int i = 0; i < survey.length; i++) {
                total += survey[i][j];
            }

            double rata = (double) total / survey.length;
            System.out.printf("Pertanyaan %d: %.2f%n", (j + 1), rata);
        }

        int totalAll = 0;
        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pertanyaan; j++) {
                totalAll += survey[i][j];
            }
        }
        double rataAll = (double) totalAll / (responden * pertanyaan);
        System.out.printf("\n=== RATA-RATA KESELURUHAN ===%n%.2f%n", rataAll);
    }
}
