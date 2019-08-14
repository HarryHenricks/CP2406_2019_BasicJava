package week3;

import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of dollars: ");
        int dollars = input.nextInt();
        input.close();

        int twenties = dollars/ 20;
        int remainder = dollars % 20;
        int tens = remainder/ 10;
        remainder = remainder % 10;
        int fives = remainder/ 5;
        remainder = remainder % 5;
        int ones = remainder;

        System.out.println("Denominations: \n" + twenties + " x 20s\n" + tens + " x 10s\n" + fives + " x 5s\n" + remainder + " x 1s");
    }
}
