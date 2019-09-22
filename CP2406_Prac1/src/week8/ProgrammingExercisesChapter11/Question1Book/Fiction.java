package week8.ProgrammingExercisesChapter11.Question1Book;

public class Fiction extends Book {
    Fiction(String title){
        super(title);
        setPrice(24.99);
    }
    @Override
    public void setPrice(double price) {
        super.price = price;
    }

}
