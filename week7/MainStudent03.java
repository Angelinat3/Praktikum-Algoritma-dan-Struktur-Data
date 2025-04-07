import java.util.Scanner;

public class MainStudent03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        SearchStudent03 data = new SearchStudent03();
        int amountStudent = 5;

        System.out.println("---------------------------------------");
        System.out.println("Input Student Data according from the smallest NIM");
        for (int i = 0; i < amountStudent; i++) {
            System.out.println("----------");
            System.out.print("NIM \t : ");
            int nim = s.nextInt();
            System.out.print("Name \t : ");
            String name = sl.nextLine();
            System.out.print("Age \t : ");
            int age = s.nextInt();
            System.out.print("GPA \t : ");
            double gpa = s.nextDouble();

            Students03 std = new Students03(nim, age, name, gpa);
            data.add(std);
        }

        System.out.println("---------------------------------------");
        System.out.println("Entire Student Data");
        data.display();
        System.out.println("______________________________________");
        System.out.println("______________________________________");
        System.out.print("Search Student by NIM: ");
        int search = s.nextInt();
        System.out.println("Using Sequential Search");
        int position = data.findSeqSearch(search);
        data.showPosition(search, position);
        data.showData(search, position);

        System.out.println("========================================");
        System.out.print("Search Student by NIM: ");
        System.out.println("Using Binary Search");
        int position1 = data.FindBinarySearch(search, 0, amountStudent - 1);
        data.showPosition(search, position1);
        data.showData(search, position1);
    }
}
