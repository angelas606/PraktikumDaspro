import java.util.Scanner;

public class StudiKasus02 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int lebar_tanah, panjang_tanah, luas_tanah, panjang_sisi, luas_persegi, diameter, jari_jari;
        double phi = 3.14, luas_lingkaran, luas_tanah_rumput, luas_dua_kolam;
        
        System.out.println("Masukkan lebar tanah: ");
        lebar_tanah = sc.nextInt();
        System.out.println("Masukkan panjang tanah: ");
        panjang_tanah = sc.nextInt();
        System.out.println("Masukkan panjang sisi kolam: ");
        panjang_sisi = sc.nextInt();
        System.out.println("Masukkan diameter kolam: ");
        diameter = sc.nextInt();

        jari_jari = diameter / 2;
        luas_tanah = lebar_tanah*panjang_tanah;
        luas_persegi = panjang_sisi*panjang_sisi;
        luas_lingkaran = phi*jari_jari*jari_jari;
        luas_dua_kolam = luas_lingkaran+luas_persegi;
        luas_tanah_rumput = luas_tanah-(luas_lingkaran+luas_persegi);

        System.out.println("Luas tanah: "+ luas_tanah);
        System.out.println("Luas kolam berbentuk persegi: "+ luas_persegi);
        System.out.println("Luas kolam berbetuk lingkaran: "+ luas_lingkaran);
        System.out.println("Luas dua kolam: "+ luas_dua_kolam);
        System.out.println("Luas tanah yang ditanami rumput: "+ luas_tanah_rumput);
    }
    
}
