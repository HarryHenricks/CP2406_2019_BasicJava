package week7.ProgrammingExercisesChapter10.Question9Rocks;

class MetamorphicRock extends Rock {
    MetamorphicRock(int numberSamples, int weight){
        super(numberSamples, weight);
        super.description = "A rock formed from the metamorphism of another rock type";
    }
}
