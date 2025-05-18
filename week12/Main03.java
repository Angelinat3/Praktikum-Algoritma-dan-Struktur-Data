package week12;

public class Main03 {
    public static void main(String[] args) {
        SingleLinkedList03 sll = new SingleLinkedList03();

        Student03 std1 = new Student03("001", "Student 1", "TI-1I", 3.89);
        Student03 std2 = new Student03("002", "Student 2", "TI-1I", 3.45);
        Student03 std3 = new Student03("003", "Student 3", "TI-1I", 3.20);
        Student03 std4 = new Student03("004", "Student 4", "TI-1I", 3.00);

        sll.print();
        sll.addFirst(std4);
        sll.print();
        sll.addLast(std1);
        sll.print();
        sll.insertAfter(std3, "Student 4");
        sll.print();
        sll.insertAt(2, std2);
        sll.print();

        System.out.println("Data at index 1 is:");
        Student03 data = sll.getData(1);
        data.print();
        int idx = sll.indexOf("Student 1");
        System.out.println("Student 1 is located at index: " + idx);
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}