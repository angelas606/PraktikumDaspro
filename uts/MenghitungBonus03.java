package uts;

import java.util.Scanner;

public class MenghitungBonus03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Memasukkan nilai kinerja karyawan, lama bekerja, jumlah gaji pokok, dan status sertifikasi
        System.out.print("Masukkan nilai kinerja karyawan: ");
        int kinerja = sc.nextInt();
        System.out.print("Masukkan lama bekerja (tahun): ");
        int lamaKerja = sc.nextInt();
        System.out.print("Masukkan jumlah gaji pokok (Rp): ");
        int gaji = sc.nextInt();
        System.out.print("Apakah memiliki sertifikasi? (ya/tidak): ");
        String sertifikasi = sc.next();
        System.out.println();

        //Perhitungan bonus karyawan berdasarkan nilai kinerja dan lama bekerja 
        double bonus = 0;
        if (kinerja < 70) {
            bonus = 0;
        } else if (kinerja >= 70 && kinerja < 90) {
            if (lamaKerja < 2) {
                bonus = 0.1*gaji;
            } else if (lamaKerja <= 2 || lamaKerja < 5) {
                bonus = 0.3*gaji;
            } else {
                bonus = 0.5*gaji;
            }
        } else if (kinerja <= 90) {
            if (lamaKerja < 2) {
                bonus = 0.2*gaji;
            } else if (lamaKerja <= 2 || lamaKerja < 5) {
                bonus = 0.4*gaji;
            } else {
                bonus = 0.7*gaji;
            }
        }

        //Menghitung bonus karyawam berdasarkan sertifikasi
        if (kinerja >= 70 && sertifikasi.equalsIgnoreCase("ya")) {
            bonus += 500000;
        }

        //Menampilkan hasil akhir perhitungan bonus karyawan
        System.out.println("========== HASIL PERHITUNGAN BONUS ==========");
        System.out.println("Nilai kinerja : " + kinerja);
        System.out.println("Lama bekerja : " + lamaKerja + " tahun");
        System.out.println("Jumlah gaji pokok : " + gaji);
        System.out.println("Status sertifikasi : " + sertifikasi);
        System.out.println("---------------------------------------");
        System.out.println("Total bonus : Rp" + (int) bonus);
    }
}
