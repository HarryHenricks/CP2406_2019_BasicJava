package week5.Chapter6Exercises;

public class Perfect {
    public static void main(String[] args) {
        // display every perfect num between 1 through 1000.
        // Perf num is one that equals all nums that divide evenly into it.
        // e.g 6 is perf because 1 2 and 3 divide evenly into it
        // 12 is not because 1 2 3 4 and 6 divide evenly but add to greater than 12


        int factor;

        for (int i = 1; i <= 1000; ++i){

            int total = 0;

            for (int j = i - 1; j > 0; j--){
                if (i % j == 0){ // then j is a factor of i
                    total += j;
                }
            }
            if (total == i){
                System.out.println(i + " is a perfect number");
            }
        }
    }
}
