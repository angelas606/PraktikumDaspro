import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jarak, banyakBensin, biayaBensin;
        int hargaBensin = 10000;

        System.out.println("Masukkan jarak perjalanan ");
        jarak = sc.nextInt();

        banyakBensin = jarak / 2;
        biayaBensin = banyakBensin*hargaBensin;

        System.out.println("Banyak bensin yang diperlukan adalah " + banyakBensin + " liter");
        System.out.println("Biaya bensin yang diperlukan adalah Rp " + biayaBensin);
    }
}