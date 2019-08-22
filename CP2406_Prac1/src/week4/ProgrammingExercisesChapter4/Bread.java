package week4.ProgrammingExercisesChapter4;

class Bread {
    String breadType;
    int calPerSlice;
    final static String MOTTO = "The staff of life";

    Bread(String bread, int calories){
        breadType = bread;
        calPerSlice = calories;
    }
    private String getBreadType(){
        return breadType;
    }
    private int getCalPerSlice() {
        return calPerSlice;
    }
}
