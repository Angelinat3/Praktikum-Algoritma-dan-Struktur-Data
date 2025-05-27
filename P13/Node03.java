public class Node03 {
    Student03 data;
    Node03 prev;
    Node03 next;
    
    Node03(){
    }
    Node03(Student03 data){
        this.data = data;
        prev = null;
        next = null;
    }
    Node03(Node03 prev, Student03 data, Node03 next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}