package week7.ProgrammingExercisesChapter10.Question9Rocks;

class IgneousRock extends Rock {
    IgneousRock(int numberSamples, int weight){
        super(numberSamples, weight);
        super.description = "A rock formed from magma or lava";
    }
}
