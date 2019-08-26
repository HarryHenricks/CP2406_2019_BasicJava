package week4.ProgrammingExercisesChapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestBloodData {
    @Test void checkBloodData(){
        BloodData bloodData = new BloodData();
        assertEquals(bloodData.bloodType, "O");
        assertEquals(bloodData.Rh_factor, '+');
    }
}