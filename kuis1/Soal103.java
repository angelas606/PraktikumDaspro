//Angela Salma_254107060006_SIB-1A_Soal ke-1
import java.util.Scanner;

public class Soal103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiKuis1, nilaiKuis2, nilaiKuis3, nilaiUts, nilaiUas;
        double kuis=0.3, uts=0.3, uas=0.4, totalKuis, nilaiAkhir;

        System.out.println("Masukkan nilai kuis 1: ");
        nilaiKuis1 = sc.nextInt();
        System.out.println("Masukkan nilai kuis 2: ");
        nilaiKuis2 = sc.nextInt();
        System.out.println("Masukkan nilai kuis 3: ");
        nilaiKuis3 = sc.nextInt();
        System.out.println("Masukkan nilai UTS: ");
        nilaiUts = sc.nextInt();
        System.out.println("Masukkan nilai UAS: ");
        nilaiUas = sc.nextInt();

        totalKuis = (nilaiKuis1+nilaiKuis2+nilaiKuis3)/3;
        nilaiAkhir = (totalKuis*kuis)+(nilaiUts*uts)+(nilaiUas*uas);

        System.out.println("Jumlah nilai akhir Mahasiswa: " + nilaiAkhir);
    }
}
