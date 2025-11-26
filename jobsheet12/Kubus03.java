package jobsheet12;

import java.util.Scanner;

public class Kubus03 {
    static int sisi;

    static int hitungLuas() {
        int luas = 6 * sisi * sisi;
        return luas;
    } 

    static int hitungVolume() {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L, vol;
        System.out.print("Masukkan panjang sisi: ");
        sisi = sc.nextInt();

        L = hitungLuas();
        System.out.println("Luas permukaan kubus adalah " + L);

        vol = hitungVolume();
        System.out.println("Volume Kubus adalah " + vol);

    }
}
