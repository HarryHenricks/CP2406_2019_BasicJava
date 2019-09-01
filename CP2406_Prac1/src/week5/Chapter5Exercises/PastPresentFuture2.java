package week5.Chapter5Exercises;

import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a date in the format dd/mm/yyyy: ");
        String userDate = input.next();

        String dateArray[] = userDate.split("/");
        LocalDate date = LocalDate.of(Integer.parseInt(dateArray[2]), Integer.parseInt(dateArray[1]), Integer.parseInt(dateArray[0]));
        LocalDate today = LocalDate.now();

        if (date.isAfter(today)) {
            System.out.println("The entered date is after today");
        } else if (date.isBefore(today)) {
            System.out.println("The entered date is before today");
        } else if (date.equals(today)) {
            System.out.println("The entered date is today");
        }
    }
}
