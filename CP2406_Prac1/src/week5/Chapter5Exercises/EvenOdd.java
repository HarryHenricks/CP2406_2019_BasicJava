package week5.Chapter5Exercises;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even");
        } else if (number % 2 == 1) {
            System.out.println("The number " + number + " is odd");
        }
    }
}
