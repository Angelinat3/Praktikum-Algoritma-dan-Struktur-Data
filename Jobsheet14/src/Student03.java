public class Student03 {
    String nim, name, className;
    double ipk;
    
    public Student03() {}
    public Student03(String nm, String name, String kls, double ipk){
        this.nim = nm;
        this.name = name;
        this.className = kls;
    }
    void print(){
        System.out.println(nim+" - "+name+" - "+className+" - "+ipk);
    }
}