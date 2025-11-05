public class ContohVariabel03 {
    public static void main(String[] args) {
        String hobi = "mendengarkan musik";
        boolean pandai = true;
        char jenisKelamin ='P';
        byte umur = 18;
        double ipk = 4.00, tinggi = 1.53;
        
        System.out.println("Hobi saya adalah "+ hobi);
        System.out.println("Apakah pandai? " + pandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umur);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}
