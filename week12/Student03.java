package week12;

public class Student03 {
    private String nim;
    public String name;
    private String className;
    private double gpa;

    public Student03() {
    }

    public Student03(String nim, String name, String className, double gpa) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.gpa = gpa;
    }

    public void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + gpa);
    }

    public String getName() {
        return name;
    }
}
