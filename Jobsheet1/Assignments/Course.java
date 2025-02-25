package Assignments;
import java.util.Scanner;
public class Course {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of courses: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] courseName = new String[n];
        int[] creditHours = new int[n];
        int[] semester = new int[n];
        String[] lectureDay = new String[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for course " + (i + 1) + ":");
            System.out.print("Course Name: ");
            courseName[i] = sc.nextLine();
            System.out.print("Credit Hours (SKS): ");
            creditHours[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Lecture Day: ");
            lectureDay[i] = sc.nextLine();
        }

        int choice;
        do {
            System.out.println("\nCourse Schedule Menu:");
            System.out.println("1. Display all courses");
            System.out.println("2. Display courses scheduled on a specific day");
            System.out.println("3. Display courses for a specific semester");
            System.out.println("4. Search for a course by name");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    displayAllCourses(courseName, creditHours, semester, lectureDay);
                    break;
                case 2:
                    System.out.print("Enter the lecture day: ");
                    String day = sc.nextLine();
                    displayCoursesByDay(courseName, creditHours, semester, lectureDay, day);
                    break;
                case 3:
                    System.out.print("Enter the semester: ");
                    int sem = sc.nextInt();
                    displayCoursesBySemester(courseName, creditHours, semester, lectureDay, sem);
                    break;
                case 4:
                    System.out.print("Enter the course name: ");
                    String name = sc.nextLine();
                    searchCourseByName(courseName, creditHours, semester, lectureDay, name);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select an option between 1 and 5.");
            }
        } while (choice != 5);

        sc.close();
    }
   static void displayAllCourses(String[] courseName, int[] creditHours, int[] semester, String[] lectureDay) {
        System.out.println("\nAll Courses:");
        for (int i = 0; i < courseName.length; i++) {
            System.out.printf("Course Name: %s, Credit Hours: %d, Semester: %d, Lecture Day: %s%n",
                    courseName[i], creditHours[i], semester[i], lectureDay[i]);
        }
    }
    static void displayCoursesByDay(String[] courseName, int[] creditHours, int[] semester, String[] lectureDay, String day) {
        System.out.println("\nCourses on " + day + ":");
        for (int i = 0; i < courseName.length; i++) {
            if (lectureDay[i].equalsIgnoreCase(day)) {
                System.out.printf("Course Name: %s, Credit Hours: %d, Semester: %d, Lecture Day: %s%n",
                        courseName[i], creditHours[i], semester[i], lectureDay[i]);
            }
        }
    }
    static void displayCoursesBySemester(String[] courseName, int[] creditHours, int[] semester, String[] lectureDay, int sem) {
        System.out.println("\nCourses in Semester " + sem + ":");
        for (int i = 0; i < courseName.length; i++) {
            if (semester[i] == sem) {
                System.out.printf("Course Name: %s, Credit Hours: %d, Semester: %d, Lecture Day: %s%n",
                        courseName[i], creditHours[i], semester[i], lectureDay[i]);
            }
        }
    }
    static void searchCourseByName(String[] courseName, int[] creditHours, int[] semester, String[] lectureDay, String name) {
        boolean found = false;
        for (int i = 0; i < courseName.length; i++) {
            if (courseName[i].equalsIgnoreCase(name)) {
                System.out.printf("Course Name: %s, Credit Hours: %d, Semester: %d, Lecture Day: %s%n",
                        courseName[i], creditHours[i], semester[i], lectureDay[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Course not found.");
        }
    }
}