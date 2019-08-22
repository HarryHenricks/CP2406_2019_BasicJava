package week4.ProgrammingExercisesChapter4;

public class Sandwich{
    Bread bread;
    SandwichFilling sandwichFilling;

    Sandwich(String breadType, int calPerSlice, String fillingType, int calsPerServing){
        bread = new Bread(breadType, calPerSlice);
        sandwichFilling = new SandwichFilling(fillingType, calsPerServing);
    }

    public String getBread() {
        return bread.breadType;
    }
    public String getSandwichFilling() {
        return sandwichFilling.fillingType;
    }

    int getSandwichCalories(){
        return 2*bread.calPerSlice + sandwichFilling.calsPerServing;
    }
}
