package week4.ProgrammingExercisesChapter3;

import java.util.Scanner;

public class MetricConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer value to be converted: ");
        int value = input.nextInt();
        input.close();

        convertDistance(value);
        convertVolume(value);
    }

    private static void convertDistance(int centimetres){
        double centimetresToInches = 2.54;

        double inches = centimetres/ centimetresToInches;
        System.out.println(centimetres + " centimeters is equal to " + inches + " inches");
    }

    private static void convertVolume(int liters){
        double litersToGallons = 3.7854;

        double gallons = liters/ litersToGallons;
        System.out.println(liters + " liters is equal to " + gallons + " gallons");
    }
}
