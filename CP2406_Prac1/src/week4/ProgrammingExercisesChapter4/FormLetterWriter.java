package week4.ProgrammingExercisesChapter4;

public class FormLetterWriter {
    public static void main(String[] args) {
        displaySolution("Gates");
        displaySolution("Bill", "Gates");
    }

    private static void displaySolution(String last){
        System.out.println("Dear Mr. or Ms. " + last);
        System.out.println("Thank you for your recent order.");
    }

    private static void displaySolution(String first, String last){
        System.out.println("Dear " + first + " " + last);
        System.out.println("Thank you for your recent order.");
    }
}
