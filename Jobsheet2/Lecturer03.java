package Jobsheet2;

public class Lecturer03 {
    private String lecturerID;
    private String name;
    private boolean status;
    private int startYear;
    private String expertiseField;

    
    public Lecturer03(String lecturerID, String name, boolean status, int startYear, String expertiseField) {
        this.lecturerID = lecturerID;
        this.name = name;
        this.status = status;
        this.startYear = startYear;
        this.expertiseField = expertiseField;
    }

    public void print() {
        System.out.println("Lecturer ID: " + lecturerID);
        System.out.println("Name: " + name);
        System.out.println("Status: " + (status ? "Active" : "Inactive"));
        System.out.println("Start Year: " + startYear);
        System.out.println("Expertise Field: " + expertiseField);
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int calculateTenure(int yearNow) {
        return yearNow - startYear;
    }

    public void changeExpertiseField(String newField) {
        this.expertiseField = newField;
    }
    public static void main(String[] args) {
    }
}
