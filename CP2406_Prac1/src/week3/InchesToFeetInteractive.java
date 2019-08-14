package week3;

import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Number of inches: ");
        int inches = input.nextInt();
        input.close();

        int feet = java.lang.Math.round(inches/ 12);
        int remainder = inches % 12;

        if (feet == 1 && remainder == 1) {
            System.out.println(feet + " Foot and " + remainder + " Inch");
        } else if (feet != 1 && remainder == 1) {
            System.out.println(feet + " Feet and " + remainder + " Inch");
        } else if (feet == 1 && remainder != 1) {
            System.out.println(feet + " Foot and " + remainder + " Inches");
        } else {
            System.out.println(feet + " Feet and " + remainder + " Inches");
        }
    }
}
