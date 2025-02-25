package Jobsheet2;

public class StudentMain {
    public static void main(String[] args) {
        Student03 student1 = new Student03();
        student1.studentID = "244107020097";
        student1.name = "Tiara";
        student1.className = "TI-1I";
        student1.gpa = 3.8;
        student1.print();
        student1.changeClass("TI-2I");
        student1.updateGPA(3.9);
        Student03 student2 = new Student03(
            "244107020040",
            "Rizky",
            "TI-1I",
            3.5);
        student2.updateGPA(3.3);
        Student03.studentAngel = new Student03(
            "244107020076 ",
            "Angel",
            "TI-1I",
            3.5);
        student1.print();
        student2.print();
    }
}