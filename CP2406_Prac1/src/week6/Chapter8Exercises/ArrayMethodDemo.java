package week6.Chapter8Exercises;

public class ArrayMethodDemo {
    public static void main(String[] args) {
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        dispIntegers(intArray);
        dispIntegersReverse(intArray);
        dispIntegerSum(intArray);
        dispIntegersLessThan(5, intArray);
        dispIntegersAboveAvg(intArray);
    }
    private static void dispIntegers(int[] intArray){
        System.out.println("Display all integers");
        for (int value : intArray) {
            System.out.println(value);
        }
    }
    private static void dispIntegersReverse(int[] intArray){
        System.out.println("Display all integers in reverse");
        for (int i=0; i<intArray.length; ++i){
            System.out.println(intArray[intArray.length-1-i]);
        }
    }
    private static void dispIntegerSum(int[] intArray){
        int total = 0;
        for (int value : intArray) {
            total += value;
        }
        System.out.println("The sum of all the integers is: " + total);
    }
    private static void dispIntegersLessThan(int maximum, int[] intArray){
        System.out.println("The numbers less than " + maximum + " are: ");
        for (int value : intArray) {
            if (value < maximum){
                System.out.println(value);
            }
        }
    }
    private static void dispIntegersAboveAvg(int[] intArray){
        System.out.println("The integers above average are: ");
        int avg = 0;
        int countInts = 0;
        for (int value : intArray) {
            avg += value;
            ++countInts;
        }
        avg /= countInts;
        for (int value : intArray){
            if (value > avg){
                System.out.println(value);
            }
        }
    }
}
