import java.util.Scanner;

public class StudiKasus01 {
    public static void main (String [] args){

        Scanner input =new Scanner(System.in);

        int gaji_pokok, tunjangan_anak = 250000, jml_anak, total_tunjangan_anak;
        double potongan_pensiun =0.104, gaji_bersih, total_potongan_pensiun;

        System.out.println("Masukkan jumlah gaji pokok: " );
        gaji_pokok = input.nextInt();
        System.out.println("Masukkan jumlah anak: ");
        jml_anak = input.nextInt();

        total_tunjangan_anak = tunjangan_anak * jml_anak;
        total_potongan_pensiun = potongan_pensiun * gaji_pokok;

        gaji_bersih = gaji_pokok + total_tunjangan_anak - total_potongan_pensiun; 
        
        System.out.println("Total tunjangan anak: " + total_tunjangan_anak);
        System.out.println("Total dana pensiun: " + total_potongan_pensiun);
        System.out.println("Jumlah gaji bersih: " + gaji_bersih);
        
    }
}