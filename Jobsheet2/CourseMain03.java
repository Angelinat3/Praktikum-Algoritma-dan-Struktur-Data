package Jobsheet2;

public class CourseMain03 {
    private String courseID;
    private String name;
    private int credit;
    private int hour;

    public CourseMain03() {
    }
    public CourseMain03(String courseID, String name, int credit, int hour) {
        this.courseID = courseID;
        this.name = name;
        this.credit = credit;
        this.hour = hour;
    }

    public void print() {
        System.out.println("Course ID: " + courseID);
        System.out.println("Course Name: " + name);
        System.out.println("Credit (SKS): " + credit);
        System.out.println("Total Weekly Hours: " + hour);
    }

    public void changeCredit(int newCredit) {
        this.credit = newCredit;
        System.out.println("Credit has been changed to: " + newCredit);
    }

    public void addHour(int hour) {
        this.hour += hour;
        System.out.println(hour + " sucessfully added. New hour is: " + this.hour);
    }

    public void reduceHour(int hour) {
        if (this.hour - hour >= 0) {
            this.hour -= hour;
            System.out.println(hour + " Were reduced. making it: " + this.hour);
        } else {
            System.out.println("Too much reduction!");
        }
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}