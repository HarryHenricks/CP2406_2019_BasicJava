package week7.ProgrammingExercisesChapter10.Question9Rocks;

class SedimentaryRock extends Rock {
    SedimentaryRock(int numberSamples, int weight){
        super(numberSamples, weight);
        super.description = "A rock formed from layers of sediment";
    }
}
