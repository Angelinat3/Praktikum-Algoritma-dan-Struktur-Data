|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020076 |
| Nama |  Angelina Thennessa Jo |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/Angelinat3/Praktikum_Algoritma_Dan_Struktur_Data.git) |

# JOBSHEET VII SEARCHING

7.1 Learning Objective
After learning this practicum course,students will be able to:
1. Define Searching algorithm
2. Create and declare searching algorithm structure
3. Implement searching algorithms
7.2 Sequential Search Method

![image](https://github.com/user-attachments/assets/de88cf13-10de-4aa6-8cf3-c60d731b8852)

7.1 Steps
1. Open your project
2. Then, create a new package named week7.
3. Create new Students class, then declare following attributes:

![image](https://github.com/user-attachments/assets/b9b34f92-d993-451f-b103-6468db65bb6d)

4. Create a constructor in Students class with parameters (int ni, String nm, int age, double gpa), as follows:

![image](https://github.com/user-attachments/assets/691bcd95-2c76-43c6-a77f-686d408ef36a)

5. Create display() method with void as its return type

![image](https://github.com/user-attachments/assets/c2a68c97-474b-4fd9-be10-e9f0567b6a79)

6. Create a new SearchStudent class as follows.

![image](https://github.com/user-attachments/assets/ed3d162d-4efb-4e48-a2a8-367a8234c4ca)

7. Create method add() at that class! This will be used for adding objects from Students class to listStd attribute

![image](https://github.com/user-attachments/assets/4fcfb999-7f8c-47c4-8e3f-739f89543ea0)

8. Create method display() in class SearchStudent! This display() method will be used to print all student data available in this class. Pay attention on how we use for-loops differently (popularly known as foreach). Even so, the concepts are still the same

![image](https://github.com/user-attachments/assets/83815954-3c51-46eb-8b5c-489ebe91b014)

9. Create method findSeqSearch() with integer as its return type. Then fill in the function with sequential search algorithm.

![image](https://github.com/user-attachments/assets/c420e04d-44bd-4211-aff4-8689c5a81d28)

10. Create method showPosition() with void as its return type. And write the following code

![image](https://github.com/user-attachments/assets/0dee9976-503d-4eeb-ab31-12a9bb367b9d)

11. Create method showData() with void as its return type. And write the following code

![image](https://github.com/user-attachments/assets/f8bf8f91-3e11-4d61-8889-e04ee62973ca)

12. Create a main class named MainStudent
13. In main method, instantiate an object in SearchStudent that consists of 5 Students, then add all students object by calling add() function in object SearchStudent

![image](https://github.com/user-attachments/assets/f302ae66-c079-43be-97f6-7eb5ea77bca8)

14. Add method display() to print all inserted data

![image](https://github.com/user-attachments/assets/dcd9816d-570a-49d7-9986-90d9ada7a72b)

15. To search students by their NIM, create a search variable to hold input from user. Then call method findSeqSearch() with its parameter is the search variable we’ve declared before

![image](https://github.com/user-attachments/assets/50922a3e-78bb-4da7-aa8a-fac4b476bdda)

16. Call method showPosition() from class SearchStudent.
17. Call method showData() from class SearchStudent.

![image](https://github.com/user-attachments/assets/998d5fcd-a07f-4f97-9449-f51d423e55cc)

18. Run the program and see the result

![image](https://github.com/user-attachments/assets/e98b509a-2a00-43eb-9e8d-6e5808a52501)

![image](https://github.com/user-attachments/assets/cc6dbbbc-c36e-47c4-950c-f7f712848fae)

![image](https://github.com/user-attachments/assets/20178b26-9934-4ee0-b383-92c570eaf598)


## 7.3 Question
1. What is the difference between the methods displayData and displayPosition in
StudentSearch class?

Displaydata will show all the data and displayposition will locate the one with the NIM were input to, and if there's none
"System.out.println("Data : " + x + " is not found")".

2. What is the function of break in this following program code?

![image](https://github.com/user-attachments/assets/9a2a07aa-c46b-4604-9d28-ba8aaf0c6076)

Break in that function means if the data (NIM) was found or matched, the program will stop checking for another.

3. If the NIM data inserted is not sorted from smallest to biggest value, will the program encounter an error? Is the result still correct? Why is that?

No, there will be no error because it's using a sequential search which is scan the array one by one until the data matches.

4. Look at findSeqSearch method, why position is initialized by -1 instead of 0?

With "int position = -1", it can distinguish the data with the "data not found" if we insert the wrong NIM.

## 7.3 Binary Search Method
1. Still in SearchStudent class, add a new method findBinarySearch() with integer as its data type. Then declare the content of method findBinarySearch with using binary search as its searching algorithm

![image](https://github.com/user-attachments/assets/6c01e65b-9306-4e02-be4c-e7e7e9039ea5)

2. Call method findBinarySearch() from SearchStudent class in StudentsMain. Then call method showPosition() and showData()

![image](https://github.com/user-attachments/assets/f8d837f0-4045-4b7a-98eb-6a0b137566b3)

3. Run and see the result

![image](https://github.com/user-attachments/assets/b3b2a127-d833-45f1-b1f5-bfba9b693e5a)

## 7.3 Question
1. Show the program code in which runs the divide process!

![image](https://github.com/user-attachments/assets/dae67fbd-0bfb-47d0-857f-61546690f944)


2. Show the program code in which runs the conquer process!

![image](https://github.com/user-attachments/assets/3fd9c193-e409-4314-9406-ae3155f64416)


3. If inserted NIM data is not sorted, will the program give the correct result? Why?

No, because the binary search split the search in half, thinking the data is sorted

4. If inserted NIM data is sorted from largest to smallest value (e.g 20215, 20214 20212, 20211,20210) and element being searched is 20210. How is the result of binary search? does it return the correct one? if not, then change the code so that the binary search executed
properly

Since the implementation data is sorted in ascending order, it will not work correctly.
We need to change the ascending order to descending like this one.

![image](https://github.com/user-attachments/assets/c308810e-aefd-402d-b982-33fc1db67e9b)


5. Modify program above so that the students amount inserted is matched with user input

![image](https://github.com/user-attachments/assets/39b95620-49bb-4ca3-9e05-d962bc20cd2f)

## 7.4 Review Divide and Conquer
1. Add a new class MergeSort
2. In this class, we will create method mergeSort() that receives an array in its parameter

![image](https://github.com/user-attachments/assets/e962cf57-4e55-405e-a271-cec6502e82ea)

3. Create merge() method to do data merging process from left side to the right
4. Implement merge() process as follows:

![image](https://github.com/user-attachments/assets/594cfafe-357a-4a1f-82da-eacf2d7500be)

5. Create sort method
6. Implement these following codes in sort method

![image](https://github.com/user-attachments/assets/5f2a7800-9d41-4852-a855-6a52498d50fc)

7. In method mergeSort, call method sort with the data that wants to be sorted and initial data range as its parameter
8. Add method printArray

![image](https://github.com/user-attachments/assets/20763435-473e-4921-a9dd-c8d5a754cd85)

9. Finally, declare the data to be sorted by using sorting processin SortMain(?) class

![image](https://github.com/user-attachments/assets/58bc7ead-edf2-4c55-876b-916cecdecb56)

7.5 Assignments
1. In the previous practical session on Jobsheet 5, which included three classes—
Lecturer, LecturerData, and LecturerDemo add the following methods:
a. sequentialSearch(): Used to search for lecturer data by name using the Sequential Search algorithm.
b. binarySearch(): Used to search for lecturer data by age using the Binary Search algorithm.

Establish a rule to detect and display a warning message if the search returns multiple results! Ensure that the implemented algorithm aligns with the given case!

