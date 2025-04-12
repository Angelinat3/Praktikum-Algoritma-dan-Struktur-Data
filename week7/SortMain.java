public class SortMain {
    public static void main(String[] args) {
        int[] data = {10, 40, 30, 50, 70, 20, 100, 90};

        // Create an instance of MergeSort
        MergeSort mergeSort = new MergeSort();

        // Print initial data
        System.out.println("Sorting with merge sort");
        System.out.println("Initial Data:");
        mergeSort.printArray(data);

        // Sort the data
        mergeSort.sort(data, 0, data.length - 1);

        // Print the sorted array
        System.out.println("Sorted Data:");
        mergeSort.printArray(data);
    }
}