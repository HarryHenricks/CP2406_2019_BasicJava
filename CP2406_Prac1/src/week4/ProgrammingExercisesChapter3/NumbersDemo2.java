package week4.ProgrammingExercisesChapter3;

import java.util.Scanner;

public class NumbersDemo2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer 1: ");
        int a = input.nextInt();
        System.out.println("Enter integer 2: ");
        int b = input.nextInt();
        input.close();

        displayTwiceTheNumber(a);
        displayTwiceTheNumber(b);

        displayNumberPlusFive(a);
        displayNumberPlusFive(b);

        displayNumberSquared(a);
        displayNumberSquared(b);
    }

    private static void displayTwiceTheNumber(int number){
        int displayValue = number * 2;
        System.out.println("Double the number " + number + " is " + displayValue);
    }

    private static void displayNumberPlusFive(int number){
        int displayValue = number + 5;
        System.out.println("The number " + number + " plus five is " + displayValue);
    }

    private static void displayNumberSquared(int number){
        int displayValue = number * number;
        System.out.println("The number " + number + " squared is " + displayValue);
    }
}