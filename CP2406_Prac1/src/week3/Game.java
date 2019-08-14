package week3;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Random random = new Random();
    int secret = random.nextInt(10) + 1; // secret variable is assigned a random value between 1 and 10 inclusive
    int count;
    int wins;

    void makeGuess(int value) {
        if (value == secret) {
            wins++;
            count++;
            System.out.print("You won");
        } else {
            count++;
            System.out.print("You lost");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer guess from 1 to 10: ");
        int guess = input.nextInt();
        input.close();

        Game game = new Game();
        game.makeGuess(guess);
    }
}
