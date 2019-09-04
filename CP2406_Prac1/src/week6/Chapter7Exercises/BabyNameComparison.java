package week6.Chapter7Exercises;

import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        // prompt user for 3 first names and concatenates them in every 2 name combination
        // so that new parents can easily compare them to find best name

        Scanner input = new Scanner(System.in);
        String[] stringArray = new String[3];
        int i = 0;
        while (i < stringArray.length){
            System.out.println("Please enter baby name " + (i + 1) + ": ");
            stringArray[i] = input.next();
            ++i;
        }

        for (int j=0; j<stringArray.length-1; ++j){
            System.out.println("Names " + (j+1) + " and " + (j+2) + " are: " + stringArray[j] + " and " + stringArray[j+1]);
            if (stringArray.length > j + 2) {
                System.out.println("Names " + (j+1) + " and " + (j+3) + " are: " + stringArray[j] + " and " + stringArray[j+2]);
            }

        }


    }
}
