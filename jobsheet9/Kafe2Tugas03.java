package jobsheet9;

import java.util.Scanner;

public class Kafe2Tugas03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.println("Daftar menu tersedia:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i]);
        }

        System.out.print("\nMasukkan nama makanan yang dicari: ");
        String cari = sc.nextLine();

        int hasil = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                hasil = i;
                break;
            }
        }

        if (hasil >= 0) {
            System.out.println("Menu '" + menu[hasil] + "' tersedia di nomor " + (hasil+1) + ".");
        } else {
            System.out.println("Maaf, menu '" + cari + "' tidak ada di daftar menu.");
        }
    }
}
