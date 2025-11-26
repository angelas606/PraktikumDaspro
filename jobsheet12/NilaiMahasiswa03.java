package jobsheet12;

import java.util.Scanner;

public class NilaiMahasiswa03 {
    static void isianArray(int[] n, Scanner sc) {
        for (int i = 0; i < n.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            n[i] = sc.nextInt(); 
        }
    }

    static void tampilArray(int[] n) {
        System.out.println("Daftar nilai mahasiswa:");
        for (int i = 0; i < n.length; i++) {
            System.out.println("Mahasiswa " + (i + 1) + " : " + n[i]);
        }
    }

    static double hitTot(int[] n) {
        double total = 0;
        for (int i : n) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();

        int[] nilai = new int[N];
        isianArray(nilai, sc);
        tampilArray(nilai);

        double total = hitTot(nilai);
        System.out.printf("Total nilai seluruh mahasiswa: %.2f%n", total);
    }
}
