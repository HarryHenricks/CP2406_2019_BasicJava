package week4.ProgrammingExercisesChapter4;

public class SandwichFilling {
    String fillingType;
    int calsPerServing;

    SandwichFilling(String filling, int calories){
        fillingType = filling;
        calsPerServing = calories;
    }
    String getFillingType(){
        return fillingType;
    }
    int getCalsPerServing(){
        return calsPerServing;
    }
}
