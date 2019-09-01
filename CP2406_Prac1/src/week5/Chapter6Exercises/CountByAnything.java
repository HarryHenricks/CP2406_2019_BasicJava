package week5.Chapter6Exercises;

import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter value to count by: ");
        int countByVal = input.nextInt();
        int loopNum = 0;

        for (int i = 3; i <= 300; i += countByVal){
            ++loopNum;
            if (loopNum % 10 == 0){
                System.out.println(i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
