package jobsheet7;

import java.util.Scanner;

public class ParkirStudiKasus03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;
        System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
        jenis = sc.nextInt();

        while (jenis != 0) {
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                total += 12500;
                } else if (jenis == 1) {
                total += durasi * 3000;
                } else if (jenis == 2) {
                total += durasi * 2000;
                } 

                System.out.println("Biaya parkir: Rp " + total);
                System.out.println();

            } else {
                System.out.println("Jenis kendaraan tidak valid");
                System.out.println();
            }
            
            System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
            jenis = sc.nextInt();
        } 
        
        System.out.println("Total biaya parkir: Rp " + total);
    }
}
