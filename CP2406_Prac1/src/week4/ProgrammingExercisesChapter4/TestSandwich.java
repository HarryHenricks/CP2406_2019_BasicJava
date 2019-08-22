package week4.ProgrammingExercisesChapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSandwich {
    @Test void checkSandwich(){
        Sandwich hamSandwich = new Sandwich("White", 10, "Ham", 15);
        Sandwich salamiSandwich = new Sandwich("Wholegrain", 6, "Salami", 13);
        Sandwich turkeySandwich = new Sandwich("Rye", 8, "Turkey", 10);
        System.out.println(hamSandwich.getBread());
        System.out.println(hamSandwich.getSandwichFilling());
        System.out.println(hamSandwich.getSandwichCalories());

        System.out.println(salamiSandwich.getBread());
        System.out.println(salamiSandwich.getSandwichFilling());
        System.out.println(salamiSandwich.getSandwichCalories());

        System.out.println(turkeySandwich.getBread());
        System.out.println(turkeySandwich.getSandwichFilling());
        System.out.println(turkeySandwich.getSandwichCalories());

    }
}