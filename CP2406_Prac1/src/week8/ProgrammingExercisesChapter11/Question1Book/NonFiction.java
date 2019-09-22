package week8.ProgrammingExercisesChapter11.Question1Book;

public class NonFiction extends Book {
    NonFiction(String title){
        super(title);
        setPrice(37.99);
    }
    @Override
    public void setPrice(double price){
        super.price = price;
    }
}
