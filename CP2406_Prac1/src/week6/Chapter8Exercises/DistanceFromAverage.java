package week6.Chapter8Exercises;

import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        double[] doubleArray = new double[20];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a double (or 99999 to exit): ");
        double currentDouble  = input.nextDouble();
        doubleArray[0] = currentDouble;
        int index = 1;
        while (currentDouble != 99999) {
            System.out.println("Enter next double (or 99999 to exit): ");
            currentDouble = input.nextDouble();
            if (currentDouble != 99999) {
                doubleArray[index] = currentDouble;
                ++index;
            }
        }
        double total = 0;
        for (double v : doubleArray) {
            total += v;
        }
        double average = total/ index;
        double distFromAvg;
        for (int i=0; i<index; ++i){
            distFromAvg = doubleArray[i]-average;
            distFromAvg = Math.abs(distFromAvg);
            System.out.println(doubleArray[i] + ": is " + distFromAvg + " from the average");
        }
    }
}
