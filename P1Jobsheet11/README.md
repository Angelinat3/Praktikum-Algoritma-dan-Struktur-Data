|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020076 |
| Nama |  Angelina Thennessa Jo |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/Angelinat3/Praktikum_Algoritma_Dan_Struktur_Data.git) |

# JOBSHEET 11 
## 2.1 Experiment 1: Implementing Single Linked List

1. In the project created for this semester, create a new package named week12.
2. Create the following classes:

![image](https://github.com/user-attachments/assets/b3c51ccb-0d40-43a2-b067-6012b75ce637)

3. Implement Student following this class diagram
4. The following code is the Student class implementation

![image](https://github.com/user-attachments/assets/8bf4568c-f8ba-4fc6-8eaa-2fe0c7265664)

5. The following code snippet depicts the Node class implementation. Please make a note that the Node class manages the Student object data, that is why we create Student attribute within Node class. You will need to modify it based on the data type of data that you manage.

![image](https://github.com/user-attachments/assets/f367ba84-78b7-4d31-a8e6-0b03ab16e965)

6-14 Create a new class named SingleLinkedList

![image](https://github.com/user-attachments/assets/079cf94b-d8d2-428a-b80b-975d35ac652d)

![image](https://github.com/user-attachments/assets/022aed77-44a6-43fe-999d-fe7a8c76b53e)

![image](https://github.com/user-attachments/assets/005ec6fd-a4bd-4653-9bd7-85fc18c691b1)

15. Create a new Main class, with a main method inside. Then create a SingleLinkedList object.

![image](https://github.com/user-attachments/assets/eaa7482c-0695-4e5d-906e-d337976c67c3)

16. Add 4 student objects, std1, std2, std3 and std4.

![image](https://github.com/user-attachments/assets/588592ca-8728-4bf7-8ae0-e249bbc92a9e)

17. Add the students object into SingleLinkedList object, following these scenarios:

![image](https://github.com/user-attachments/assets/d383d1bd-6196-4b5e-a03b-c3f24da757b7)

Output Verification

![image](https://github.com/user-attachments/assets/4790579a-1be6-4cb2-bbdb-3b5eb813ce3e)

## 2.1.2 Questions!
1. Why does compiling the program code result in the message "Linked List is Empty" on the first line?
Because after putting the SingleLinkedList object, the sll print method is executed without element so it does the print out.
2. Explain the general purpose of the variable temp in each method!
3. Modify the code so that data can be added via keyboard input!

![image](https://github.com/user-attachments/assets/8f7831d3-34a4-46a7-bf22-67adc936a0fc)


4. What would happen if we did not use the tail attribute? Would it affect the code implementation? Please explain.
No, but the process will take much longer due some operation for adding or removing the elements, less efficiency.

# 2.2 Experiment 2: Accessing Element in Single Linked List
1. Open SingleLinkedList class that is already created in Experiment 1.
2. Add a getData() method to get data at a specific index in the SingleLinkedList class.

![image](https://github.com/user-attachments/assets/ee5402a6-13d0-4cbc-829a-71c1b654464f)

3. Add a new method to get the index of a data specified. This method is named indexOf().

![image](https://github.com/user-attachments/assets/69878f37-35f4-4e02-aa6a-ad9b2092c91e)

4. Add a new mwthod named removeFirst() to remove the first element in single linked list object

![image](https://github.com/user-attachments/assets/6f09be49-0f39-4d6d-bad9-fc242437b405)

5. Add a method to remove the last element in the SingleLinkedList class, named removelast()

![image](https://github.com/user-attachments/assets/9ea74644-282a-4ddc-86d5-fd4189239482)

6. As the next step, the remove() method will be implemented.

![image](https://github.com/user-attachments/assets/0d255fa0-107b-45e4-a748-233e029d58a4)

7. Implement a method to removeAt() a node by a specified index.

![image](https://github.com/user-attachments/assets/edb3e863-2c40-4f1a-b8d0-ddf485698e94)

8. Next, try accessing and deleting data in the main method of the Main class by adding the following code.

![image](https://github.com/user-attachments/assets/030e1f72-eb1a-44ca-83e0-da72ae3851e0)


9. Re-run the Main class

![image](https://github.com/user-attachments/assets/37902359-07ba-4f8a-b991-7ce49a77b75f)

## 2.2.3 Questions
1. Why is the break keyword used in the remove function? Explain!
Because after finish the "next" to node loop, it should be terminated and run the necessary operations.
2. Explain the purpose of the code below in the remove method.

![image](https://github.com/user-attachments/assets/5e4c9740-74db-40c2-a1fd-92324523b75a)

## 3. Assignments
Create a queue-based program for student service operations with the following requirements:
a. Implement the queue using a Linked List-based Queue.
b. The program should be a new project, not a modification of an existing example.
c. When a student wants to join the queue, they must register their information.
d. Include functions to check if the queue is empty, check if it is full, and clear the queue.
e. Implement adding a student to the queue.
f. Implement calling the next student in the queue.
g. Display the first (front) and last (rear) student in the queue.
h. Display the total number of students still in the queue.
