package week6.Chapter7Exercises;

import java.util.Currency;
import java.util.Scanner;

public class ThreeLetterAcronym {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words to be converted to an acronym: ");
        String acronymWords = input.nextLine();
        input.close();
        String[] stringArray = acronymWords.split(" ");
        char currentChar;
        StringBuilder acronym = new StringBuilder();
        for (String s : stringArray) {
            currentChar = s.charAt(0);
            currentChar = Character.toUpperCase(currentChar);
            acronym.append(currentChar);
        }
        System.out.println(acronym);
    }
}
