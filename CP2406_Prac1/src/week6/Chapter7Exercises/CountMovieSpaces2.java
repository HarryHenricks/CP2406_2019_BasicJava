package week6.Chapter7Exercises;

import java.util.Scanner;

public class CountMovieSpaces2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your favourite movie quote: ");
        String favQuote = input.nextLine();
        int countSpaces = 0;
        for (int i=0; i<favQuote.length(); ++i){
            if (favQuote.charAt(i) == ' '){
                ++countSpaces;
            }
        }
        System.out.println("The quote has " + countSpaces + " spaces in it");
    }
}
