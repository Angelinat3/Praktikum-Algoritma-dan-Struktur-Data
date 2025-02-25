package Assignments;
import java.util.Scanner;
public class CityCodes {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char[] CODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[] CITY = {
            "BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR",
            "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"
        };

        // Check if both arrays have the same length
        if (CODE.length != CITY.length) {
            System.out.println("Error: The length of CODE and CITY arrays must be the same.");
            return;
        }

        System.out.println("Table: City Codes and Names");
        System.out.printf("%-5s | %-12s%n", "Code", "City");
        System.out.println("------|------------");
        for (int i = 0; i < CODE.length; i++) {
            System.out.printf("%-5s | %-12s%n", CODE[i], CITY[i]);
        }
        System.out.print("\n\nEnter the plate number: ");
        char carplatecode = sc.next().charAt(0);
        carplatecode = Character.toUpperCase(carplatecode);

        boolean found = false;
        String cities = "";

        for (int i = 0; i < CODE.length; i++) {
            if (CODE[i] == carplatecode) {
                cities = CITY[i];
                found = true;
                break;
            }
        }

        if (found) {
            System.out.printf("The cities code for %c is: %s \n", carplatecode, cities);
        } else {
            System.out.println("Huh??");
        }
    }
}