package week5.Chapter6Exercises;

import java.util.Scanner;

public class Inbetween {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter integer 1: ");
        int num1 = input.nextInt();
        System.out.println("Please enter integer 2: ");
        int num2 = input.nextInt();

        if (num1 > num2 + 1){
            for (int i = num2 + 1; i < num1; ++i){
                System.out.print(i + " ");
            }
        } else if (num2 > num1 + 1){
            for (int i = num1 + 1; i < num2; ++i){
                System.out.print(i + " ");
            }
        } else {
            System.out.println("There are no integers between " + num1 + " and " + num2);
        }
    }
}
