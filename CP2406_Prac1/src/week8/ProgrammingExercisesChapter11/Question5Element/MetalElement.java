package week8.ProgrammingExercisesChapter11.Question5Element;

class MetalElement extends Element {
    MetalElement(String symbol, int atomicNumber, double atomicWeight){
        super(symbol, atomicNumber, atomicWeight);
    }
    @Override
    void describeElement() {
        System.out.println("This element is a metal, metals are good conductors of electricity.");
    }
}
