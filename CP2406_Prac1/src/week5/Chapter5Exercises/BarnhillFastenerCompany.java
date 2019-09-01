package week5.Chapter5Exercises;

import java.util.Scanner;

public class BarnhillFastenerCompany {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your skill level and hourly rate: " +
                "\n1 - $17 per hour" +
                "\n2 - $20 per hour" +
                "\n3 - $22 per hour");
        int skillLevel = input.nextInt();
        int hourlyRate = 0;
        if (skillLevel == 1){
            hourlyRate = 17;
        } else if (skillLevel == 2){
            hourlyRate = 20;
        } else if (skillLevel == 3){
            hourlyRate = 22;
        }
        System.out.println("How many hours per week do you work?");
        int hoursWorked = input.nextInt();
        double totalPay = 0;
        if (hoursWorked > 40){
            totalPay = 1.5*hoursWorked*hourlyRate; // bonus 1.5 pay if hours worked is over 40
        } else if (hoursWorked >= 0){ // ensure the user hasn't entered a negative value
            totalPay = hoursWorked*hourlyRate;
        }

        if (skillLevel == 2 || skillLevel == 3){
            System.out.println("Would you like to add one of the following insurance options?" +
                    "\n1 - Medical insurance - $32.50" +
                    "\n2 - Dental insurance - $20.00" +
                    "\n3 - Long-term disability insurance - $10.00");
            int insuranceChoice = input.nextInt();
            if (insuranceChoice == 1){
                totalPay -= 32.5;
            } else if (insuranceChoice == 2){
                totalPay -= 20;
            } else if (insuranceChoice == 3){
                totalPay -= 10;
            }
        }
        System.out.println("The total earnings of the employee for this week is $" + totalPay);
    }
}
