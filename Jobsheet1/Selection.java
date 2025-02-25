import java.util.Scanner;

public class Selection {
    static int Tugas, kuis, UTS, UAS;
    static String Value;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=====================");
        System.out.print("Masukkan Nilai Tugas: ");
        Tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        UTS = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        UAS = sc.nextInt();
        

        input();
        average();
        Quality_Value(Tugas, Value);
        sc.close();
    }

    static void input() {
        System.out.println("=====================");
        System.out.println("=====================");
        if ((Tugas < 0 || Tugas > 100) || (kuis < 0 || kuis > 100) || (UTS < 0 || UTS > 100)
                || (UAS < 0 || UAS > 100)) {
            System.out.println("INVALID INPUT");
            System.out.println("=====================");
            System.out.println("=====================");
            System.exit(0);
        }
    }

    static void average() {
        double result = ((Tugas * 20) + (kuis * 20) + (UTS * 30) + (UAS * 30)) / 100;
        System.out.println("Nilai akhir : " + result);
    }

    static void Quality_Value(double result, String value) {
        if (result > 80 && result <= 100) {
            value = "A";
        } else if (result > 73 && result <= 80)
            value = "B+";
        else if (result > 65 && result <= 73)
            value = "B";
        else if (result > 60 && result <= 65)
            value = "C+";
        else if (result > 50 && result <= 60)
            value = "C";
        else if (result > 39 && result <= 50)
            value = "D";
        else {
            value = "E";
        }

        System.out.println("Nilai Huruf :" + value);
        System.out.println("=====================");
        System.out.println("=====================");

        if (value.equals("A") || value.equals("B+") || value.equals("B") || value.equals("C+") || value.equals("C")) {
            System.out.println("Congratulation you pass");
        } else {
            System.out.println("Sorry you FAIL!!");
        }
    } 
}