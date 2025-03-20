import java.util.Scanner;

public class SumMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input element number: ");
        int element = input.nextInt();
        
        Sum sm = new Sum(element);
        for (int i = 0; i < element; i++) {
            System.out.print("Input profit #" + (i + 1) + ": ");
            sm.profits[i] = input.nextDouble();
        }
        
        System.out.println("Profit total using BF: " + sm.totalBF());
        System.out.println("Profit total using DC: " + sm.totalDC(sm.profits, 0, element - 1));
        //System.out.println("highest Midterm Score DC: " + sm.highestScoreDC(sm.profits, 0, element - 1));
        //System.out.println("Lowest Midterm Score using DC: " + sm.lowestScoreDC(sm.profits, 0, element - 1));
        //System.out.println("Average Score using BF: " + sm.averageScoreBF());
    }
}