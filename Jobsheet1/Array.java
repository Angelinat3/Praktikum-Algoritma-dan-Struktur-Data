import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] matkul = {
            "Pancasila",
            "Konsep Teknologi Informasi", 
            "Critical Thinking dan Problem Solving",
            "Matemaika Dasar",
            "Rekayasa Perangkat lunak",
            "Basic Programming",
            "Basic Programming Lab",
            "Keselamatan dan Kesehatan Kerja" 
        };
        int [] bobotSKS = {2,2,2,3,2,2,3,2};
        int n = matkul.length;
        double[] score = {75,85,70,85,85,62,62,85};
        
        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (int i = 0; i < n; i++) {
            System.out.println("masukkan nilai Angka untuk MK "+ matkul[i] + ": "  + score[i] );
        }
        
        System.out.println("==============================");
        System.out.println("=====Hasil Konversi Nilai=====");
        System.out.println("==============================");
        System.out.printf("%-40s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        double totalBobotSKS = 0;
        int totalSKS = 0;
        
        for (int i = 0; i < n; i++) {
            String nilaiHuruf;
            double bobotNilai;
            
            if (score[i] > 80 && score[i] <= 100) {
                nilaiHuruf = "A";
                bobotNilai = 4.00;
            } else if (score[i] > 73 && score[i] <= 80) {
                nilaiHuruf = "B+";
                bobotNilai = 3.50;
            } else if (score[i] > 65 && score[i] <= 73) {
                nilaiHuruf = "B";
                bobotNilai = 3.00;
            } else if (score[i] > 60 && score[i] <= 65) {
                nilaiHuruf = "C+";
                bobotNilai = 2.50;
            } else if (score[i] > 50 && score[i] <= 60) {
                nilaiHuruf = "C";
                bobotNilai = 2.00;
            } else if (score[i] > 39 && score[i] <= 50) {
                nilaiHuruf = "D";
                bobotNilai = 1.00;
            } else {
                nilaiHuruf = "E";
                bobotNilai = 0.00;
            }
            
            System.out.printf("%-40s %-15.2f %-15s %-15.2f\n", 
                matkul[i], score[i], nilaiHuruf, bobotNilai);
            totalBobotSKS += (bobotNilai * bobotSKS[i]);
            totalSKS += bobotSKS[i];
        }
        System.out.println("==============================");
        double ip = totalBobotSKS / totalSKS;
        System.out.printf("IP : %.2f\n", ip);

        sc.close();
    }
}