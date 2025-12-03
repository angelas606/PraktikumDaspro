package jobsheet13;

import java.util.Scanner;

public class Tugas03 {
    static int hitungRekursif(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return arr[n - 1] + hitungRekursif(arr, n - 1);
    }

    static int hitungIteratif(int[] arr, int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();

        int[] angka = new int[n];
        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[i - 1] = sc.nextInt();
        }

        int iteratifTotal = hitungIteratif(angka, n);
        int rekursifTotal = hitungRekursif(angka, n);

        System.out.println("Total dari " + n + " angka yang dimasukkan (iteratif) adalah: " + iteratifTotal);
        System.out.println("Total dari " + n + " angka yang dimasukkan (rekursif) adalah: " + rekursifTotal);
    }
}
