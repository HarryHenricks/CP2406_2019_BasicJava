package week5.Chapter5Exercises;

import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter first number: ");
        double number2 = input.nextDouble();

        System.out.print("Enter first number: ");
        double number3 = input.nextDouble();

        if (number1 >= number2 && number1 >= number3){
            if (number2 > number3) {
                System.out.println(number1 + "\n" + number2 + "\n" + number3);
            } else {
                System.out.println(number1 + "\n" + number3 + "\n" + number2);
            }
        } else if (number2 >= number1 && number2 >= number3) {
            if (number1 > number3){
                System.out.println(number2 + "\n" + number1 + "\n" + number3);
            } else {
                System.out.println(number2 + "\n" + number3 + "\n" + number1);
            }
        } else if (number3 >= number1 && number3 >= number2){
            if (number2 > number3){
                System.out.println(number3 + "\n" + number2 + "\n" + number1);
            } else {
                System.out.println(number3 + "\n" + number1 + "\n" + number2);
            }
        }
    }
}
