package week6.Chapter7Exercises;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string >> ");
        String userString = input.nextLine();
        input.close();
        char currentChar;
        char nextChar;
        int countWords = 0;
        for (int i=0; i<userString.length()-1; ++i){
            currentChar = userString.charAt(i);
            nextChar = userString.charAt(i+1);
            if (Character.isLetterOrDigit(currentChar)) {
                if (nextChar == ' ' || nextChar == ',' || nextChar == '.' || nextChar == ':' || nextChar == '?' || nextChar == '!' || nextChar == '-') {
                    ++countWords;
                }
            }
        }
        System.out.println("There are " + countWords + " words in the string");
    }
}
