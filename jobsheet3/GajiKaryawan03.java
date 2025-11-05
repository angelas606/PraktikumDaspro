import java.util.Scanner;

public class GajiKaryawan03 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int gajiPokok;
       double bonus, totalGaji;
       double tunjTransport = 600000;
       double tunjMakan = 400000;

       System.out.println("Masukkan jumlah gaji pokok: ");
       gajiPokok = sc.nextInt();

       bonus = 0.05*gajiPokok;
       totalGaji = gajiPokok+tunjTransport+tunjMakan+bonus-(0.1*gajiPokok);

       System.out.println("Bonus bulanan Anda adalah Rp " + (int) bonus);
       System.out.println("Gaji yang diterima adalah Rp " + (int) totalGaji);
    }
    
}