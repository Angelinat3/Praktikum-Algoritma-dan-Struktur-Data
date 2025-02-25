public class Function {

    static int[][] stock = {
        {10, 5, 15, 7},  // RoyalGarden 1
        {6, 11, 9, 12},  // RoyalGarden 2
        {2, 10, 10, 5},  // RoyalGarden 3
        {5, 7, 12, 9}    // RoyalGarden 4
    };
    
    static int[] price = {75000, 50000, 60000, 10000};
    static String[] plowel = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    
    static void printLine(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    
    static void ngitung() {
        System.out.println("\n=== Income if all flower were sold out ===\n");
        
        System.out.printf("%-15s", "Branch");
        for (String b : plowel) {
            System.out.printf("%-12s", b);
        }
        System.out.printf("%-15s\n", "Total");
        
        printLine(75);
        
        for (int i = 0; i < stock.length; i++) {
            System.out.printf("%-15s", "RoyalGarden " + (i+1));
            int total = 0;
            
            for (int j = 0; j < stock[i].length; j++) {
                int income = stock[i][j] * price[j];
                total += income;
                System.out.printf("%-12s", "Rp " + income/1000 + "k");
            }
            System.out.printf("%-15s\n", "Rp " + total/1000 + "k");
        }
    }
    
    static void stockupdaterg4() {
        System.out.println("\n=== Ded flower ===\n");
        
        int[] reduction = {1, 2, 0, 5};
        
        System.out.printf("%-15s", "Status");
        for (String b : plowel) {
            System.out.printf("%-12s", b);
        }
        System.out.println();
        printLine(60);
        System.out.printf("%-15s", "Stock");
        for (int mainstock : stock[3]) {
            System.out.printf("%-12d", mainstock);
        }
        System.out.println();
        
        System.out.printf("%-15s", "reduction");
        for (int kurang : reduction) {
            System.out.printf("%-12d", kurang);
        }
        System.out.println();
        
        System.out.printf("%-15s", "Updated stock");
        for (int i = 0; i < stock[3].length; i++) {
            System.out.printf("%-12d", stock[3][i] - reduction[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        ngitung();
        stockupdaterg4();
    }
}