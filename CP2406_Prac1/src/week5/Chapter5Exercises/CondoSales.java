package week5.Chapter5Exercises;

import java.util.Scanner;

public class CondoSales {
    public static void main(String[] args) {
        int condoPrice;
        String viewName = null;

        Scanner input = new Scanner(System.in);
        System.out.println("Summerdale Condo Sales Office \nPlease choose: \n     1 for park view \n     2 for golf " +
                "course view \n     3 for lake view\n");
        int usersChoice = input.nextInt();

        if (usersChoice == 1) {
            viewName = "Park view";
            condoPrice = 150000;
        } else if (usersChoice == 2) {
            viewName = "Golf view";
            condoPrice = 170000;
        } else if (usersChoice == 3) {
            viewName = "Lake view";
            condoPrice = 210000;
        } else {
            condoPrice = 0;
        }
        System.out.println(viewName + " costs $" + condoPrice);
    }
}
