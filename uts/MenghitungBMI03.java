package uts;

import java.util.Scanner;

public class MenghitungBMI03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Memasukkan berat badan dan tinggi badan 
        System.out.print("Berat Badan (kg) : ");
        double bb = sc.nextDouble();
        System.out.print("Tinggi Badan (m) : ");
        double tb = sc.nextDouble();
        System.out.println();

        //Perhitungan BMI 
        double bmi = bb/(tb*tb);

        //Mengkategorikan nilai BMI
        String kategori;
        if (bmi < 18.5) {
            kategori = "Kurang berat badan (Underweight)";
        } else if (bmi <= 18.5 || bmi < 25) {
            kategori = "Berat badan normal (Normal weight)";
        } else if (bmi <= 25 || bmi < 30) {
            kategori = "Kelebihan berat badan (Overweight)";
        } else {
            kategori = "Obesitas (Obese)";
        }

        //Mengkategorikan risiko penyakit 
        String pesan; 
        if (bmi < 18.5) {
            pesan = "Kekurangan gizi, osteoporosis, penurunan sistem kekebalan tubuh";
        } else if (bmi <= 18.5 || bmi < 25) {
            pesan = "Relatif rendah";
        } else if (bmi <= 25 || bmi < 30) {
            pesan = "Meningkatnya risiko penyakit jantung, diabetes, tekanan darah tinggi";
        } else {
            pesan = "Risiko tinggi penyakit jantung, diabetes, tekanan darah tinggu, masalah pernapasan, dan beberapa jenis kanker";
        } 

        //Menampilkan hasil perhitungan BMI, kategori, dan risiko penyakit yang ditimbulkan
        System.out.println("========== HASIL PERHITUNGAN BMI ==========");
        System.out.println("Nilai BMI: " + bmi );
        System.out.println("Kategori BMI: " + kategori);
        System.out.println("Risiko Penyakit: " + pesan);
    }
}
