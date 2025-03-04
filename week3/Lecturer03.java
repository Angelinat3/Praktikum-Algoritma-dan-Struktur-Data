package week3;

public class Lecturer03 {
    private String id;
    private String name;
    private Boolean gender;
    private int age;

    public Lecturer03(String id, String name, Boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}