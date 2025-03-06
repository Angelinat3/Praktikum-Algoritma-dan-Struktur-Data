|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020076 |
| Nama |  Angelina Thennessa Jo |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/Angelinat3/Praktikum_Algoritma_Dan_Struktur_Data.git) |

# JOBSHEET #2 OBJECTS

2.1.3 Question

1. Mention two characteristics of a class or object!
 - attributes = Data or properties that define the object. Object without attributes is just a helper
 - methods = A function or behaviors that the object can perform.
2. How many attributes does the Student class have? List them!
 - String studentID
 - String name
 - String className
 - double gpa
3. How many methods does the Student class have? List them!
 - void print()
 - void changeClass(String newClass)
 - void updateGPA(double newGPA)
 - String evaluate() (If-else loop)
4. Modify the updateGPA() method to validate that the input IPK is within the range of 0.0 to 4.0. If it is out of range, display a message: "Invalid IPK. Must be between 0.0 and 4.0."
String evaluate() { 
    if (gpa >= 3.5) {
        return "Excellent";
    } else if (gpa >= 3.0) {
        return "Good";
    } else if (gpa >= 2.0) {
        return "Fair";
    } else if (gpa >= 0.0) {
        return "Poor";
    } else{
        return "Invalid IPK. Must be between 0.0 and 4.0.";
    }
}
5. Explain how the evaluate() method evaluates student performance. What criteria does it use, 
and what does it return?
it will analyze that how much gpa is the student input. After the user input the gpa the program is started to analayze with the function we input 
The criteria program use are:
- bigger or equal than 3.5, 3.0, 2.0, 0.0

2.2.3 Question
1. Show the line of code in StudentMain used for instantiation. What is the name of the created object?
   Student03 student1 = new Student03();
2. How do you access attributes and methods of an object?
   We called the "Student03"File to the "StudentMain" then we declare it like :
        student1.studentID = "244107020097";
        student1.name = "Tiara";
        student1.className = "TI-1I";
        student1.gpa = 3.8;

    This explain that "Student1" is using variables from "Student03" File by declare it like that
3. Why does the output of the first and second calls to print() differ?
   for printing student1 and input it on StudentMain by following the Object we used on Student03

2.3.3 Question
1. Show the line of code in Student used to declare the parameterized constructor!
public Student03(String id, String name, String cls, double gpa) {
    studentID = id;
    this.name = name;
    className = cls;
    this.gpa = gpa;
}

2. In StudentMain, explain what the following line of code does:
"Student student2 = new Student("244107020040", "Rizky", "TI-1I", 3.5);"
    This line of code is used to declare the object of the Student class with the value of the studentID, name, className, and gpa attributes.

3. Remove the default constructor from Student, then compile and run the program. What
happens? Explain why.
On StudentMain, the error happen because the default constructor is used to create an object without any parameters
So if the default constructor is removed, the object cannot be created without any parameters

4. After instantiating an object, do methods in Student need to be accessed in order? Explain
No need, because the method in the Student it can be called in random order

5. Create a new object named student<StudentName> using the parameterized constructor from Student class.

>>>>>>> origin/main
