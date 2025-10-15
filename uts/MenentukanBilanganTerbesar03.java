package uts;

import java.util.Scanner;

public class MenentukanBilanganTerbesar03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Memasukkan nilai angka 
        System.out.print("Masukkan angka pertama: ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = sc.nextInt();
        System.out.print("Masukkan angka ketiga: ");
        int angka3 = sc.nextInt();
        System.out.println();

        //Menentukan nilai anbka yang paling besar 
        int max = angka1;
        if (angka2 > max) {
            max = angka2;
        } 

        if (angka3 > max) {
            max = angka3;
        }

        //Menampilkan hasil akhir bilangan terbesar 
        System.out.println("============== Hasil ==============");
        if (angka1 == max && angka2 == max && angka3 == max ) {
            System.out.println("Semua angka sama besar: " + max);
        } else if ((angka1 == max && angka2 == max) || (angka1 == max && angka3 == max) || (angka2 == max && angka3 == max)) {
            System.out.println("Ada beberapa angka terbesar yaitu: ");
            if (angka1 == max) System.out.println(angka1 + "");
            if (angka2 == max) System.out.println(angka2 + "");
            if (angka3 == max) System.out.println(angka3 + "");
        } else {
            System.out.println("Angka terbesar adalah: " + max);
        }
    }
}
