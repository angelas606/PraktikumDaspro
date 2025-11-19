package kuis2;
// Angela Salma_254107060006_SIB-1A_Soal ke-1
import java.util.Scanner;

public class Soal103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah elemen array 
        System.out.print("Masukkan jumlah elemen array: ");
        int jml = sc.nextInt();

        // Input nilai array n 
        int[] n = new int[jml];
        for (int i = 0; i < n.length; i++) {
            System.out.print("Massukkan nilai array ke-" + (i + 1) + " : ");
            n[i] = sc.nextInt();
        }

        // Menghitung jumlah bilangan genap dan ganjil 
        int genap = 0, ganjil = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                genap++;
            } else {
                ganjil ++;
            }
        }

        // Menampilkan jumlah bilangan genap dan ganjil 
        System.out.println();
        System.out.println("Jumlah bilangan genap dalam array adalah: " + genap);
        System.out.println("Jumlah bilangan ganjil dalam array adalah: " + ganjil);
    }
}
