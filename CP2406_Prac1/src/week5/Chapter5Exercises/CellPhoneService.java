package week5.Chapter5Exercises;

import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the maximum values a month you use for: \nMinutes spent talking ");
        int numTalkMins = input.nextInt();
        System.out.println("Text messages sent ");
        int numTextMessages = input.nextInt();
        System.out.println("Gigabytes of data used ");
        int dataUsedInGB = input.nextInt();

        if (numTalkMins < 500 && numTextMessages == 0 && dataUsedInGB == 0) {
            System.out.println("You should choose plan A at $49 per month");
        } else if (numTalkMins < 500 && numTextMessages != 0 && dataUsedInGB == 0) {
            System.out.println("You should choose plan B at $55 per month");
        } else if (numTalkMins >= 500 && numTextMessages < 100 && dataUsedInGB == 0) {
            System.out.println("You should choose plan C at $61 per month");
        } else if (numTalkMins >= 500 && dataUsedInGB == 0) { // numTextMessages must be 100 or greater otherwise other if statement would execute
            System.out.println("You should choose plan D at $70 per month");
        } else if (dataUsedInGB < 2) {
            System.out.println("You should choose plan E at $79 per month");
        } else {
            System.out.println("You should choose plan F at $87 per month");
        }


    }
}
