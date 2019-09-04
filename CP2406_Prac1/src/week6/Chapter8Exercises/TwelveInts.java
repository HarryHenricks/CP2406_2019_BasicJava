package week6.Chapter8Exercises;

public class TwelveInts {
    public static void main(String[] args) {
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println("First to last");
        for (int value : intArray) {
            System.out.println(value);
        }
        System.out.println("\nLast to first");
        for (int i=0; i<intArray.length; ++i){
            System.out.println(intArray[11-i]);
        }
    }
}
