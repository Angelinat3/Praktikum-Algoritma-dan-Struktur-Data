package Jobsheet2;

public class LecturerMain03 {
    private String lecturerID;
    private String name;
    private boolean status;
    private int startYear;

    public LecturerMain03() {
    }
    public LecturerMain03(String lecturerID, String name, boolean status, int startYear) {
        this.lecturerID = lecturerID;
        this.name = name;
        this.status = status;
        this.startYear = startYear;
    }

    public void print() {
        System.out.println("Lecturer ID: " + lecturerID);
        System.out.println("Name: " + name);
        System.out.println("Status: " + (status ? "Active" : "Inactive"));
        System.out.println("Start Year: " + startYear);
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int calculateTenure(int yearNow) {
        return yearNow - startYear;
    }

    public void changeExpertiseField(String newField) {
        System.out.println("Expertise field changed to: " + newField);
    }

    public static void main(String[] args) {
    }
}