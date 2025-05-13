public class StudentAssignmentStack {
    private final Student03[] stack;
    private int top;
    private final int size;

    public StudentAssignmentStack(int size) {
        this.size = size;
        top = -1;
        stack = new Student03[size];
    }

    public boolean isFull() {
        if(top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if(top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Student03 std) {
        if (!isFull()) {
            top++;
            stack[top] = std;
        }
        System.out.println("Stack is already full!!");
    }

    public Student03 pop() {
        if (!isEmpty()) {
            Student03 std = stack[top];
            top--;
            return std;
        } else {
            System.out.println("There's no data in Stack!!");
            return null;
        }
    }

    public Student03 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
        
    }

    void print(){
        for(int i=0;i<=top;i++){
        System.out.println(stack[i].nim+"\t"+stack[i].name+"\t"+stack[i].className);
        }
        System.out.println("");
        }
        

    public String convertToBinary(int grade) {
        return Integer.toBinaryString(grade);
    }
}