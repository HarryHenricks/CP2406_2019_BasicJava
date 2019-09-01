package week5.Chapter6Exercises;

public class CountByThrees {
    public static void main(String[] args) {
        for (int i = 3; i <= 300; i += 3){
            if (i % 30 == 0){
                System.out.println(i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
