public class BinaryTreeArrayMain03 {
    public static void main(String[] args) {

    BinaryTreeArray03 bta = new BinaryTreeArray0();
    Student03 m1 = new Student03("244107020138", "Devin", "TI-1I", 3.57);
    Student03 m2 = new Student03("244107020023", "Dewi", "TI-1I", 3.85);
    Student03 m3 = new Student03("244107020225", "Wahyu", "TI-1I", 3.21);
    Student03 m4 = new Student03("244107020076", "Angelina", "TI-1I", 3.54);
    Student03 m5 = new Student03("244107020223", "Andhika", "TI-1I", 3.72);
    Student03 m6 = new Student03("244107020226", "Bima", "TI-1I", 3.37);
    Student03 m7 = new Student03("244107020181", "Eiyu", "TI-1I", 3.46);

    Student03[] data = {m1, m2, m3, m4, m5, m6, m7};

    bta.populateData(data, data.length-1);
    
    System.out.println("In-order traversal:");
    bta.traverseInOrder(0);
    
    }
}