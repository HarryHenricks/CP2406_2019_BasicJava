package week5.Chapter6Exercises;

public class Factorials {
    public static void main(String[] args) {
        int factNum = 1;

        while (factNum <= 10) {
            int calcFact = factNum;
            int factVal = 1;

            while (calcFact > 1) {
                factVal *= calcFact;
                --calcFact;
            }
            System.out.println(factNum + "! is equal to " + factVal);
            ++factNum;
        }
    }
}
