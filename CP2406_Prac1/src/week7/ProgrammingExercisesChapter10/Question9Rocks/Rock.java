package week7.ProgrammingExercisesChapter10.Question9Rocks;

class Rock {
    private int numberSamples;
    String description;
    private int weight;
    Rock(int numberSamples, int weight){
        this.numberSamples = numberSamples;
        this.weight = weight;
        description = "Unclassified";
    }
    int getNumberSamples(){
        return numberSamples;
    }
    int getWeight(){
        return weight;
    }
    String getDescription(){
        return description;
    }
}
