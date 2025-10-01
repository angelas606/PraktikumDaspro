package jobsheet5;

import java.util.Scanner;

public class SistemPerpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Apakah membawa kartu mahasiswa atau sudah regisgtrasi online? (kartu/registrasi): ");
        String syarat = sc.nextLine();

        if (syarat.equalsIgnoreCase("kartu") || syarat.equalsIgnoreCase("registrasi")) {
            System.out.println("Izin masuk diberikan");
        } else {
            System.out.println("Izin masuk ditolak");
        }
    }
}
