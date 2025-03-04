package week3;

import java.util.Scanner;

public class ArrayOfObjects {
        public static void main(String[] args) {
                Rectangle[] rectanglArray = new Rectangle[3];
                Scanner sc = new Scanner(System.in);

                for (int i = 0; i < 3; i++) {
                        rectanglArray[i] = new Rectangle();
                        System.out.println("Rectangle " + i);

                        System.out.print("Input length : ");
                        rectanglArray[i].length = sc.nextInt();

                        System.out.print("Input width : ");
                        rectanglArray[i].width = sc.nextInt();
                }
                for (int i = 0; i < 10; i++) {
                        System.out.println("Rectangle " + i);
                        System.out.println("width: " + rectanglArray[0].width + ", length: " + rectanglArray[0].length);
                }
                sc.close();
        }
}