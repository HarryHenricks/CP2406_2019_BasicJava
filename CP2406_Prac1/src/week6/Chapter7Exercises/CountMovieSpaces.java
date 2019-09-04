package week6.Chapter7Exercises;

public class CountMovieSpaces {
    public static void main(String[] args) {
        String favQuote = "This is meant to be a famous quote from a movie but I don't really watch movies";
        int countSpaces = 0;
        for (int i=0; i<favQuote.length(); ++i){
            if (favQuote.charAt(i) == ' '){
                ++countSpaces;
            }
        }
        System.out.println("The quote has " + countSpaces + " spaces in it");
    }
}
