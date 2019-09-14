package week7.ProgrammingExercisesChapter10.Question4Poems;

public class Poem {
    private String name;
    private int numberLines;
    Poem(String name, int numberLines){
        this.name = name;
        this.numberLines = numberLines;
    }
    String getName(){
        return name;
    }
    int getNumberLines(){
        return numberLines;
    }


}
