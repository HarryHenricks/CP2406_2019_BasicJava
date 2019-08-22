package week4.ProgrammingExercisesChapter3;

public class Percentages {
    public static void main(String[] args) {
        double a = 1.25;
        double b = 6.4;
        computePercent(a,b);
        computePercent(b,a);
    }

    private static void computePercent(double a, double b){
        double ratio = a/b * 100;
        System.out.println(a + " is " + ratio +" percent of " + b);
    }
}
