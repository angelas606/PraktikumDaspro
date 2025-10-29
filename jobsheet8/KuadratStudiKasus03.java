package jobsheet8;

import java.util.Scanner;

public class KuadratStudiKasus03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("n = " + i + " --> jumlah kuadrat = ");
            int jumlah = 0;
            
            for (int j = 1; j <= i; j++) {
                int kuadrat = j * j;
                jumlah += kuadrat;
                System.out.print(kuadrat);
                
                if (j < i) {
                    System.out.print(" + ");
                }
            }
            
            System.out.println(" = " + jumlah);
        }
    }
}
