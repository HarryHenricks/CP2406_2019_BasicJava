package week6.Chapter7Exercises;

import java.util.Scanner;

public class Alphabetise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String string1 = input.nextLine();
        System.out.println("Enter second string: ");
        String string2 = input.nextLine();
        System.out.println("Enter third string: ");
        String string3 = input.nextLine();

        int compare12 = string1.compareTo(string2); // if is negative then string 1 is before string 2 alphabetically
        int compare23 = string2.compareTo(string3);

        if (compare12 <= 0 && compare23 <= 0){
            System.out.println("Strings are in alphabetical order");
        } else {
            System.out.println("Strings are not in alphabetical order");
        }
    }
}
