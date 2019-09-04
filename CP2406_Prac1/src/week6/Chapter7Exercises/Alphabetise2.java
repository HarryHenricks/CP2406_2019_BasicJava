package week6.Chapter7Exercises;

import java.util.Scanner;

public class Alphabetise2 {
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
        int compare13 = string1.compareTo(string3);

        if (compare12 <= 0 && compare23 > 0 && compare13 <= 0){ // if order is 1, 3, 2
            System.out.println(string1 + "\n" + string3 + "\n" + string2);
        } else if (compare12 > 0 && compare23 <= 0 && compare13 <= 0) { // if 2, 1, 3
            System.out.println(string2 + "\n" + string1 + "\n" + string3);
        } else if (compare12 > 0 && compare13 > 0) { // if 3, 2, 1
            System.out.println(string3 + "\n" + string2 + "\n" + string1);
        } else if (compare12 <= 0 && compare13 > 0) { // if 3, 1, 2
            System.out.println(string3 + "\n" + string1 + "\n" + string2);
        } else {
            System.out.println("Strings are already in alphabetical order");
        }


    }
}
