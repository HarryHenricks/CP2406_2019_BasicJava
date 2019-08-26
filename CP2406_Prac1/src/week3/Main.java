package week3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer guess from 1 to 10: ");
        int guess = input.nextInt();
        input.close();

        Game game = new Game();
        game.makeGuess(guess);
    }
}
