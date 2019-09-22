package week8.ProgrammingExercisesChapter11.Question8Student;

class StudentAtLarge extends Student {
    StudentAtLarge(int id, String lastName){
        super(id, lastName);
        setAnnualTuition();
    }
    @Override
    void setAnnualTuition(){
        annualTuition = 2000;
    }
}
