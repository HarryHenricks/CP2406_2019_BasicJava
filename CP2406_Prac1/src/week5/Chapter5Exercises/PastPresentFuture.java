package week5.Chapter5Exercises;

import java.util.Calendar;
import java.util.Scanner;

public class PastPresentFuture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a date in the format dd/mm/yyyy: ");
        String date = input.next();

        String dateArray[] = date.split("/");

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH); // for some reason this is returning 8 when it should return 9 as it is september
        ++month; // make month = 9

        if (Integer.parseInt(dateArray[2]) == year) {
            if (Integer.parseInt(dateArray[1]) < month) {
                System.out.println("The entered date is from an earlier month this year");
            } else if (Integer.parseInt(dateArray[1]) > month) {
                System.out.println("The entered date is from a later month this year");
            } else if (Integer.parseInt(dateArray[1]) == month) {
                System.out.println("The entered date is from this month");
            }
        } else {
            System.out.println("The entered date is not from this year");
        }
    }
}
