import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga, uangMuka, sisaCicilan, lamaCicilan;
        double cicilanPerBulan;
        double bunga = 0.01;

        System.out.println("Masukkan harga motor: ");
        harga = sc.nextInt();
        System.out.println("Masukkan uang muka: ");
        uangMuka = sc.nextInt();
        System.out.println("Masukkan lama cicilan dalam bulan: ");
        lamaCicilan = sc.nextInt();

        //Hitung sisa cicilan 
        sisaCicilan = harga-uangMuka;
        cicilanPerBulan = (sisaCicilan/lamaCicilan) + (sisaCicilan*bunga);

        System.out.println("Jumlah cicilan per bulan adalah Rp " + cicilanPerBulan);

    }
}
