package week4.ProgrammingExercisesChapter4;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TestFitnessTracker {
    @Test void checkActivity(){
        FitnessTracker fitnessTracker = new FitnessTracker();
        assertEquals(fitnessTracker.activity, "running");
    }
    @Test void checkParticipationLength(){
        FitnessTracker fitnessTracker = new FitnessTracker();
        assertEquals(fitnessTracker.participationLength, 0);
    }
    @Test void checkParticipationDate(){
        FitnessTracker fitnessTracker = new FitnessTracker();
        Date date = new Date(2019, Calendar.JANUARY, 1);
        assertEquals(fitnessTracker.participationDate, date);
    }
    @Test void checkAssignedValues(){
        FitnessTracker fitnessTracker = new FitnessTracker("Swimming", 34, new Date(2019, Calendar.FEBRUARY, 11));
        assertEquals(fitnessTracker.activity, "Swimming");
        assertEquals(fitnessTracker.participationLength, 34);
        assertEquals(fitnessTracker.participationDate, new Date(2019, Calendar.FEBRUARY, 11));
    }
}