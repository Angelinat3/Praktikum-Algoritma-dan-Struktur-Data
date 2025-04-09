public class StudentDemo03 {
    public static void main(String[] args) {
        TopStudents topStudents = new TopStudents(5);
          
        topStudents.add(new Student03("2201", "Alice", "A", 3.9));
        topStudents.add(new Student03("2202", "Bob", "B", 3.7));
        topStudents.add(new Student03("2203", "Charlie", "C", 3.8));
        topStudents.add(new Student03("2204", "David", "D", 3.6));
        topStudents.add(new Student03("2205", "Eve", "E", 4.0));

        System.out.println("Original student list:");
        topStudents.print();

        topStudents.bubbleSort();
        System.out.println("Sorted student list (by GPA, descending):");
        topStudents.print();
    }
}