public class SortingMain03 {
    public static void main(String[] args) {
        int[] a = {34, 7, 23, 32, 5, 62};
        int[] b = {30, 20, 2, 8, 14};
        int[] c = {40, 10, 4, 9, 3};

        Sorting03 sorting1 = new Sorting03(a);
        System.out.println("Original array (Bubble Sort):");
        sorting1.print();  
        sorting1.bubbleSort(); 
        System.out.println("Sorted array (Bubble Sort):");
        sorting1.print();  
        Sorting03 sorting2 = new Sorting03(b);
        System.out.println("Original array (Selection Sort):");
        sorting2.print();  
        sorting2.selectionSort(); 
        System.out.println("Sorted array (Selection Sort):");
        sorting2.print(); 

        Sorting03 sorting3 = new Sorting03(c);
        System.out.println("Original array (Insertion Sort):");
        sorting3.print();  
        sorting3.insertionSort();  
        System.out.println("Sorted array (Insertion Sort):");
        sorting3.print();  
    }
}
