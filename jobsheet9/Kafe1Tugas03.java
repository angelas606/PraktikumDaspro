package jobsheet9;

import java.util.Scanner;

public class Kafe1Tugas03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        String[] pesanan = new String[jumlah];
        int[] harga = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan pesanan: ");
            pesanan[i] = sc.nextLine();
        }

        int total = 0;
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan harga untuk '" + pesanan[i] + "': ");
            harga[i] = sc.nextInt();
            if (harga[i] < 0) {
                System.out.println("Harga tidak boleh negatif. Diset ke 0.");
                harga[i] = 0;
            }
            total += harga[i];
        }

        System.out.println();
        System.out.println("Daftar pesanan:");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%d. %s - Rp %,d%n", i+1, pesanan[i], harga[i]);
        }
        System.out.println("-----------------------------");
        System.out.printf("Total biaya: Rp %,d%n", total);
    }
}
