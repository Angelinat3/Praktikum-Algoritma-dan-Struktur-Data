package Assignments;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double sideLength;

        do {
            System.out.println("Cube Calculator Menu:");
            System.out.println("1. Calculate Volume");
            System.out.println("2. Calculate Surface Area");
            System.out.println("3. Calculate Perimeter (Total Edge Length)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Exiting the program.");
                break;
            }

            System.out.print("Enter the side length of the cube: ");
            sideLength = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.printf("Volume of the cube: %.2f%n", calculateVolume(sideLength));
                    break;
                case 2:
                    System.out.printf("Surface area of the cube: %.2f%n", calculateSurfaceArea(sideLength));
                    break;
                case 3:
                    System.out.printf("Perimeter (total edge length) of the cube: %.2f%n",
                            calculatePerimeter(sideLength));
                    break;
                default:
                    System.out.println("Invalid choice. Please select an option between 1 and 4.");
            }
        } while (choice != 4);

        sc.close();
    }

    public static double calculateVolume(double sideLength) {
        return Math.pow(sideLength, 3);
    }

    public static double calculateSurfaceArea(double sideLength) {
        return 6 * Math.pow(sideLength, 2);
    }

    public static double calculatePerimeter(double sideLength) {
        return 12 * sideLength;
    }
}
