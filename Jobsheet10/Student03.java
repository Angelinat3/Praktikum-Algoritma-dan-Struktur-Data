public class Student03 {
    public String nim;
    public String name;
    public String className;
    int grade;

    public Student03(String nim, String name, String className) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.grade = -1;
    }

    public void grading(int grade) {
        this.grade = grade;
    }
}