package week5.Chapter5Exercises;

import java.util.Scanner;

public class CondoSales2 {
    public static void main(String[] args) {
        int condoPrice;
        String viewName = null;

        Scanner input = new Scanner(System.in);
        System.out.println("Summerdale Condo Sales Office \nPlease choose: \n     1 for park view \n     2 for golf " +
                "course view \n     3 for lake view\n");
        int viewChoice = input.nextInt();

        System.out.println("Would you like to add a garage to your room or have a default parking space: \n     1 for " +
                "garage\n     2 for parking space");
        int parkingChoice = input.nextInt();

        if (viewChoice == 1) {
            viewName = "Park view";
            condoPrice = 150000;
        } else if (viewChoice == 2) {
            viewName = "Golf view";
            condoPrice = 170000;
        } else if (viewChoice == 3) {
            viewName = "Lake view";
            condoPrice = 210000;
        } else {
            condoPrice = 0;
            System.out.println("Error, please enter a valid selection");
        }

        if (parkingChoice == 1) {
            condoPrice += 5000;
        }

        System.out.println(viewName + " costs $" + condoPrice);

    }
}
