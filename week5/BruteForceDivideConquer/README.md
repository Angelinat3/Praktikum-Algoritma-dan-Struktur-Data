|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020076 |
| Nama |  Angelina Thennessa Jo |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/Angelinat3/Praktikum_Algoritma_Dan_Struktur_Data.git) |

# JOBSHEET V BRUTE FORCE AND DIVIDE CONQUER

## Calculating Factorial Using Brute Force and Divide and Conquer Algorithms
## 5.2.1. Experiment Steps
1. Create a new project named BruteForceDivideConquer (or continue the previous project) and a package called week5.
2. Create a new class, Factorial
3. Complete the Factorial class with the attributes and methods as illustrated in the class diagram above.

![Faktorial](https://github.com/user-attachments/assets/8edb0fbc-33fd-41a1-869e-f59c50c2d35c)

## 5.2.2. Verification of Experiment Results

![522](https://github.com/user-attachments/assets/7577b4c2-e908-4d42-be66-9b69fab784a6)

## 5.2.3. Questions
1. In the base case of the Divide and Conquer algorithm for calculating factorial, explain the differences in the code structure between the if and else conditions!
If the "n" is 1 means the condition will stop counting because it is the factorial, wile on else condition, it will keep counting until reach the "if" value case.


2. Is it possible to modify the loop in the factorialBF() method to use an alternative to the for loop? Please explain and give example if needed!
Yes, it is possible for example using "while".
When the "for" has one construct model, and it will initialized inside the loop.
While the "while" has a it's own condition for the loop and it will initialized before the loop begin.

![Screenshot 2025-03-21 014637](https://github.com/user-attachments/assets/30f00dd5-96f6-4b8f-a1a1-ce020d5a5aac)

3. Please explain the differences between facto = facto*i; and int facto = n * factorialDC(n-1); !
"facto = facto*i;"
Means it using a loop to count or multiply the value in order.
"int facto = n * factorialDC(n-1);"
Facto value is "n" and will be multiplied with factorial "n-1".


4. Make a conclusion about the differences in how each method works. factorialBF() and factorialDC()!
FactorialBF initial value is 1, then multiplies by each integer 1 to "n" using loop.
FactorialDC if the "n" value is 1, then it is 1. "n-1" value will be multiplied by "n".

## Calculating Exponentiation Using Brute Force and Divide and Conquer Algorithms
## 5.3.1. Experiment Steps

1. In the week5 package, create a new class named Power. Inside this class, define attributes for the
base number and its exponent.
2. Add parameterized constructor
3. Add powerBF()method
4. Add powerDC()method

![Screenshot 2025-03-21 020837](https://github.com/user-attachments/assets/966ea799-eca3-4d11-a267-f5d878cb8e2d)
