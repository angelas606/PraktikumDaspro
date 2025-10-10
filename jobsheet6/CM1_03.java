package jobsheet6;

import java.util.Scanner;

public class CM1_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input data mahasiswa
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM  : ");
        int nim = sc.nextInt();
        System.out.println();

        //Input nilai MK 1 Algoritma dan Pemrograman
        System.out.println("--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS\t : ");
        int nilai_uts = sc.nextInt();
        System.out.print("Nilai UAS\t : ");
        int nilai_uas = sc.nextInt();
        System.out.print("Nilai Tugas\t : ");
        int nilai_tugas = sc.nextInt();
        System.out.println();

        //Input nilai MK 2 Struktur Data 
        System.out.println("--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS\t : ");
        int nilai_uts1 = sc.nextInt();
        System.out.print("Nilai UAS\t : ");
        int nilai_uas1 = sc.nextInt();
        System.out.print("Nilai Tugas\t : ");
        int nilai_tugas1 = sc.nextInt();
        System.out.println();

        //Menghitung nilai akhir 
        double nilai_akhir = (0.3 * nilai_uts) + (0.4 * nilai_uas) + (0.3 * nilai_tugas);
        double nilai_akhir1 = (0.3 * nilai_uts1) + (0.4 * nilai_uas1) + (0.3 * nilai_tugas1);

        //Koversi nilai ke nilai huruf 
        String huruf1, huruf2;
        if (nilai_akhir >= 80 &&  nilai_akhir <= 100) {
            huruf1 = "A";
        } else if (nilai_akhir >= 73 &&  nilai_akhir <= 80) {
            huruf1 = "B+";
        } else if (nilai_akhir >= 65 &&  nilai_akhir <= 73) {
            huruf1 = "B";
        } else if (nilai_akhir >= 60 &&  nilai_akhir <= 65) {
            huruf1 = "C+";
        } else if (nilai_akhir >= 50 &&  nilai_akhir <= 60) {
            huruf1 = "C";
        } else if (nilai_akhir >= 39 &&  nilai_akhir <= 50) {
            huruf1 = "D";
        } else {
            huruf1 = "E";
        } 

        if (nilai_akhir1 >= 80 &&  nilai_akhir1 <= 100) {
            huruf2 = "A";
        } else if (nilai_akhir1 >= 73 &&  nilai_akhir1 <= 80) {
            huruf2 = "B+";
        } else if (nilai_akhir1 >= 65 &&  nilai_akhir1 <= 73) {
            huruf2 = "B";
        } else if (nilai_akhir1 >= 60 &&  nilai_akhir1 <= 65) {
            huruf2 = "C+";
        } else if (nilai_akhir1 >= 50 &&  nilai_akhir1 <= 60) {
            huruf2 = "C";
        } else if (nilai_akhir1 >= 39 &&  nilai_akhir1 <= 50) {
            huruf2 = "D";
        } else {
            huruf2 = "E";
        } 

        //Status kelulusan per mata kuliah  
        String status1 = (nilai_akhir >= 60) ? "LULUS" : "TIDAK LULUS";
        String status2 = (nilai_akhir1 >= 60) ? "LULUS" : "TIDAK LULUS";

        //Menghitung rata-rata nilai mata kuliah 
        double rata = (nilai_akhir + nilai_akhir1) / 2;

        //Status kelulusan semester 
        String statusSemester;
        if (status1.equals("LULUS") && status1.equals("LULUS")) {
            if (rata >= 70) {
                statusSemester = "LULUS (Rata-rata >= 70)";
            } else {
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
            }
        } else {
            statusSemester = "TIDAK LULUS (Salah satu mata kuliah TIDAK LULUS)";
        }

        //Laporan nilai akhir 
        System.out.println("\n================ HASIL PENILAIAN AKADEMIK ================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%-22s %-8s %-5s %-7s %-12s %-12s %-10s\n",
                "Mata Kuliah", "UTS", "UAS", "Tugas", "Nilai Akhir", "Nilai Huruf", "Status");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Algoritma Pemrograman\t" + nilai_uts + "\t" + nilai_uas + "\t" + nilai_tugas + "\t" + 
                           String.format("%.2f", nilai_akhir) + "\t\t" + huruf1 + "\t" + status1);
        System.out.println("Struktur Data\t\t" + nilai_uts1 + "\t" + nilai_uas1 + "\t" + nilai_tugas1 + "\t" + 
                           String.format("%.2f", nilai_akhir1) + "\t\t" + huruf2 + "\t" + status2);
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("\nRata-rata Nilai Akhir : %.2f\n", rata);
        System.out.println("Status Semester       : " + statusSemester);

    }
}
