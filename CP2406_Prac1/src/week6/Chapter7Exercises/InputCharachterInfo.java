package week6.Chapter7Exercises;

import java.util.Scanner;

public class InputCharachterInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a single charachter: ");
        char aChar = input.next().charAt(0);

        System.out.println("The charachter is " + aChar);
        if(Character.isUpperCase(aChar)){
            System.out.println(aChar + " is uppercase");
        } else {
            System.out.println(aChar + " is not uppercase");
        }
        if(Character.isLowerCase(aChar)) {
            System.out.println(aChar + " is lower case");
        } else {
            System.out.println(aChar + " is not lower case");
        }
        aChar = Character.toLowerCase(aChar);
        System.out.println("After toLowerCase(), aChar is " + aChar);
        aChar = Character.toUpperCase(aChar);
        System.out.println("After toUpperCase(), aChar is " + aChar);
        if(Character.isLetterOrDigit(aChar)){
            System.out.println(aChar + " is a letter or digit");
        } else {
            System.out.println(aChar + " is neither a letter nor a digit");
        }
        if(Character.isWhitespace(aChar)){
            System.out.println(aChar + " is whitespace");
        } else {
            System.out.println(aChar + " is not whitespace");
        }
    }
}
