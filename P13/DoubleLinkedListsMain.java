public class DoubleLinkedListsMain {

    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        dll.addFirst(new Student03("111", "Anton", "TI-1I", 3.57));
        dll.print();
        dll.addLast(new Student03("112", "Prabowo", "TI-1I", 3.7));
        dll.print();
        dll.addFirst(new Student03("113", "Herco", "TI-1I", 3.89));
        dll.print();
        dll.insertAfter("111", new Student03("114", "Rizki", "TI-1I", 3.8));
        dll.print();
        dll.insertAfter("112", new Student03("115", "Hanzel", "TI-1I", 3.6));
        dll.print();
        dll.insertAfter("120", new Student03("116", "Eiyu", "TI-1I", 3.4));
        dll.print();
        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();
        dll.remove(1);
        dll.print();
    }
}