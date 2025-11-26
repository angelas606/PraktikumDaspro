package jobsheet12;

public class PengunjungCafe03 {
    static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("Daftar nama pengunjung:");
        for (String pengunjung : namaPengunjung) {
            System.out.println("- " + pengunjung);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}
