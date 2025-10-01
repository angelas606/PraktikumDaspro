package jobsheet5;

import java.util.Scanner;

public class AksesWifi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pengguna (Dosen/Mahasiswa): ");
        String user = sc.nextLine();

        if (user.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses WiFi diberikan (Dosen)");
        } else if (user.equalsIgnoreCase("Mahasiswa")) {
            System.out.println("Masukkan jumlah SKS: ");
            int sks = sc.nextInt();

            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (Mahasiswa)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak (Pengguna tidak dikenali)");
        }
    }
}
