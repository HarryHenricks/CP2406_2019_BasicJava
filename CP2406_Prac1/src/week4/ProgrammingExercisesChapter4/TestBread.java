package week4.ProgrammingExercisesChapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestBread {
    @Test void checkBread() {
        Bread ryeBread = new Bread("Rye", 12);
        Bread whiteBread = new Bread("White", 35);
        Bread wholegrain = new Bread("Wholegrain", 16);

        System.out.println(Bread.MOTTO);
        System.out.println(ryeBread.breadType);
        System.out.println(ryeBread.calPerSlice);
        System.out.println(whiteBread.breadType);
        System.out.println(whiteBread.calPerSlice);
        System.out.println(wholegrain.breadType);
        System.out.println(wholegrain.calPerSlice);
    }
}