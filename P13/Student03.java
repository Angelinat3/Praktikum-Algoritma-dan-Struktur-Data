public class Student03 {
    String nim, name, className;
    double gpa;

    public Student03(){
    }
    public Student03(String nm, String nama, String kls, double ip){
        nim = nm;
        name = nama;
        className = kls;
        gpa = ip;
    }
    void print(){
        System.out.println(nim+" - "+name+" - "+className+" - "+gpa);
    }
}