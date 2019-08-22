package week4.ProgrammingExercisesChapter3;

import java.util.Scanner;

public class Percentages2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first double: ");
        double a = input.nextDouble();
        System.out.println("Enter second double: ");
        double b = input.nextDouble();
        input.close();

        computePercent(a,b);
        computePercent(b,a);
    }

    private static void computePercent(double a, double b){
        double ratio = a/b * 100;
        System.out.println(a + " is " + ratio +" percent of " + b);
    }
}
