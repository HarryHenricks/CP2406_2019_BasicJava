package week4.ProgrammingExercisesChapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSandwichFilling {
    @Test void checkSandwichFilling(){
        SandwichFilling tuna = new SandwichFilling("Tuna", 15);
        SandwichFilling salami = new SandwichFilling("Salami", 20);
        SandwichFilling egg_salad = new SandwichFilling("Egg Salad", 13);

        System.out.println(tuna.getFillingType());
        System.out.println(tuna.getCalsPerServing());
        System.out.println(salami.getFillingType());
        System.out.println(salami.getCalsPerServing());
        System.out.println(egg_salad.getFillingType());
        System.out.println(egg_salad.getCalsPerServing());

    }

}