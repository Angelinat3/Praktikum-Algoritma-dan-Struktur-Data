import java.util.Scanner;

public class StudentDemo03 {
    public static void main(String[] args) {
        StudentAssignmentStack stack = new StudentAssignmentStack(5);
        Scanner scan = new Scanner(System.in);
        int choice;

        try {
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Submit Assignment");
                System.out.println("2. Grade Assignment");
                System.out.println("3. View Top Assignment");
                System.out.println("4. View All Assignments");
                System.out.print("Choose a menu: ");
                choice = scan.nextInt();
                scan.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Name: ");
                        String name = scan.nextLine();
                        System.out.print("NIM: ");
                        String nim = scan.nextLine();
                        System.out.print("Class name: ");
                        String className = scan.nextLine();

                        Student03 std = new Student03();
                        std.nim = nim;
                        std.name = name;
                        std.className = className;
                        stack.push(std);
                        System.out.printf("%s's assignment submitted successfully!\n", name);
                        break;

                    case 2:
                        Student03 graded = stack.pop();
                        if (graded != null) {
                            System.out.println("Assigment graded: " + graded.name);
                            System.out.print("Enter (0-100): ");
                            int grade = scan.nextInt();
                            scan.nextLine();
                            graded.grading(grade);
                            System.out.printf("A score of %s is %d\n", graded.name, grade);
                        }
                        break;

                    case 3:
                        Student03 lihat = stack.peek();
                        if (lihat != null) {
                            System.out.println("One who turn the last assigment is " + lihat.name);
                        }
                        break;

                    case 4:
                        System.out.println("All assignments:");
                        System.out.println("Name\tNIM\tClass Name");
                        System.out.println("===================================");
                        stack.print();
                        break;

                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } while (choice >= 1 && choice <= 4);
        } finally {
            scan.close();
        }
    }
}