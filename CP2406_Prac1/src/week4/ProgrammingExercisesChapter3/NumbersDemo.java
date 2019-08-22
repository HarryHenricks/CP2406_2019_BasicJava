package week4.ProgrammingExercisesChapter3;

public class NumbersDemo {
    public static void main(String[] args) {
        int a = 4;
        int b = 13;

        displayTwiceTheNumber(a);
        displayTwiceTheNumber(b);

        displayNumberPlusFive(a);
        displayNumberPlusFive(b);

        displayNumberSquared(a);
        displayNumberSquared(b);
    }

    private static void displayTwiceTheNumber(int number){
        int displayValue = number * 2;
        System.out.println("Double the number " + number + " is " + displayValue);
    }

    private static void displayNumberPlusFive(int number){
        int displayValue = number + 5;
        System.out.println("The number " + number + " plus five is " + displayValue);
    }

    private static void displayNumberSquared(int number){
        int displayValue = number * number;
        System.out.println("The number " + number + " squared is " + displayValue);
    }
}
