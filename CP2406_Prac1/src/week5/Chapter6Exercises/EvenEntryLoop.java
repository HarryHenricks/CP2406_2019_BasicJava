package week5.Chapter6Exercises;

import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args) {
        //asks user to type even num or sentinel value 999 to stop.
        // When user types even num disp Good job! then ask for new input.
        // When user types odd num disp error msg and ask for new input.
        // When enters 999 end the program
        final int SENTINEL = 999;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an even number or 999 to exit the program: ");
        int userNum = input.nextInt();

        while (userNum != SENTINEL){
            if (userNum % 2 == 0){
                System.out.println("Good job!");
                System.out.println("Please enter an even number: ");
                userNum = input.nextInt();
            } else {
                System.out.println("Error, not an even number");
                System.out.println("Please enter an even number: ");
                userNum = input.nextInt();
            }
        }
    }
}
