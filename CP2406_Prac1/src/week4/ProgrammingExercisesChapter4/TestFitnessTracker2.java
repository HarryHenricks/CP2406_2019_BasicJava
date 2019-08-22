package week4.ProgrammingExercisesChapter4;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TestFitnessTracker2 {
    @Test void checkFitnessTracker2(){
        FitnessTracker fitnessTracker = new FitnessTracker();
        assertEquals(fitnessTracker.activity, "running");
        assertEquals(fitnessTracker.participationLength, 0);
        assertEquals(fitnessTracker.participationDate, new Date(2019, Calendar.JANUARY, 1));
    }

}