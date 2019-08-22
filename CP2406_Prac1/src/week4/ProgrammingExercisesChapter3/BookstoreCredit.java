package week4.ProgrammingExercisesChapter3;

import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.next();
        System.out.println("Enter your GPA: ");
        float GPA = input.nextFloat();
        input.close();

        calculateBookstoreCredit(name, GPA);
    }
    private static void calculateBookstoreCredit(String name, float GPA){
        float bookstoreCredit = 10 * GPA;
        System.out.print(name + " with a GPA of " + GPA + " you will receive credit for the bookstore in the amount of $" + bookstoreCredit);
    }
}
