|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020076 |
| Nama |  Angelina Thennessa Jo |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/Angelinat3/Praktikum_Algoritma_Dan_Struktur_Data.git) |

# JOBSHEET 13
1. Observe the class diagram of Student, Node, and DoubleLinkedLists
2. Create a new package named P13 or by using your preferred name
3. Create a class within the package named Student. In this class, declare the attributes according to the class diagram above. Also, add the constructor and methods as specified in the diagram.

![image](https://github.com/user-attachments/assets/297c02c8-6f09-43ac-8258-18d52315dfaf)

4. Create a class within the package named Node. In this class, declare the attributes according to the class diagram above. Then, add the constructor as specified in the diagram.

![image](https://github.com/user-attachments/assets/5e0bba3f-b5f8-4780-826c-2940fc57d9e7)

5. Create a new class named DoubleLinkedLists in the same package as Node. In the DoubleLinkedLists class, declare the attributes according to the class diagram above.

![image](https://github.com/user-attachments/assets/9c27afd3-8641-4a1c-bd94-2eab0afaa1ef)

6. Add constructor to initialize head and tail attributes to be null;

![image](https://github.com/user-attachments/assets/be0ada33-0036-49fa-8fa3-82443eadb9cc)

7. Create a new method isEmpty() that will return true in case the double linked list is still empty.

![image](https://github.com/user-attachments/assets/6eb7b0a6-d15d-4549-b9e8-29a16f273f60)

8. Next, create the addFirst() method. This method will perform data insertion at the front of the linked list.

![image](https://github.com/user-attachments/assets/f05d72e9-e276-4a72-8d43-6c3778936be8)

9. In addition, create the addLast() method to insert data at the end of the linked list.

![image](https://github.com/user-attachments/assets/37132f2d-06e9-4bc3-9c4f-7bde6226603d)

10. To insert data after the node that contains the specified key, you can do it as follows.

![image](https://github.com/user-attachments/assets/13b08206-37c6-4c59-a4f5-ca6dcfcb61e5)

11. To display the contents of the linked list, create a print() method. This method will print all elements in the linked list, regardless of its size.

![image](https://github.com/user-attachments/assets/c2fac69b-c0f1-4ca0-86c7-c1bce9ad93d7)

12. Next, create the DoubleLinkedListsMain class to execute all the methods available in the DoubleLinkedLists class.

![image](https://github.com/user-attachments/assets/238bb34b-2890-40cb-86d3-9194f11b326d)

## Output Verification

![image](https://github.com/user-attachments/assets/28484672-b6b8-433e-aacf-b6f2c62648be)

## 2.3 Questions
1. Explain the difference between a singly linked list and a doubly linked list.

Double linked list have 2 pointer prev and next with 2 travesal head-tail and vice versa

2. Observe the Node class, which contains the attributes next and prev. What are the purposes of these attributes?

next = linked to the next node prev = to the prev pointer

3. Examine the constructor in the DoubleLinkedLists class. What is the purpose of this constructor?

![image](https://github.com/user-attachments/assets/ccf191b9-52de-4fc6-ac33-3b749f664598)

There is no data

4. In the addFirst() method, what is the meaning of the following code?

![image](https://github.com/user-attachments/assets/bd0e7fd5-9605-4756-9715-cecd14e7d268)

addFirst = we need to check if it still empty or not

5. In the addFirst() method, what does the statement head.prev = newNode mean?

Connect previous pointer of head to the newNode

6. In the insertAfter() method, what is the meaning of current.next.prev = newNode?

Connect tmp to the previous linked to newNode

7. In the experiment 1 code, in which method the traversal process implemented? What is the meaning of temp = temp.next ?

InsertAfter & print, we move temp to the next node

8. In the insertAfter() method, what is the following code for?

![image](https://github.com/user-attachments/assets/20297246-9cf9-4fce-97cd-e3bf9548c158)

Do we have to implement it? What if we remove it?

In the insert after we need to check weather head = tail mean data is empty, yes; it will error because there is temp.next.prev = newNode (if it empty we need to access null object, since there is no object then.. it’s error)

9. In the insertAfter() what is this statement if(temp.data.nim.equalsIgnoreCase(key)) for?

After adding the data we did’t break the code so it’s still scanning to the end of the data

# Experiment 2
