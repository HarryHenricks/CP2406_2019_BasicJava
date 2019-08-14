package week3;

import java.util.Random;

public class Game {
    private Random random = new Random();
    int secret = random.nextInt(10) + 1; // secret variable is assigned a random value between 1 and 10 inclusive
    int count;
    int wins;

    void makeGuess(int value) {
        if (value >= 1 && value <=10) {
            wins++;
            count++;
        } else {
            count++;
        }
    }
}
