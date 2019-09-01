package week5.Chapter6Exercises;

import java.util.Scanner;

public class DiagonalOs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Os would you like displayed? ");
        int numOs = input.nextInt();
        StringBuilder spaces = new StringBuilder();

        for (int i = 1; i <= numOs; ++i){
            System.out.println(spaces + "O");
            spaces.append(" ");
        }
    }
}

