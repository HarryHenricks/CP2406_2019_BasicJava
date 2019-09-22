package week8.ProgrammingExercisesChapter11.Question8Student;

public class StudentDemo {
    public static void main(String[] args) {
        Student[] studentArray = new Student[6];
        studentArray[0] = new UndergraduateStudent(23, "Lanister");
        studentArray[1] = new GraduateStudent(54, "Stark");
        studentArray[2] = new StudentAtLarge(23, "Targararyen");
        studentArray[3] = new GraduateStudent(1, "Baratheon");
        studentArray[4] = new UndergraduateStudent(3, "Greyjoy");
        studentArray[5] = new StudentAtLarge(99, "Tyrell");
        for (Student student : studentArray) {
            System.out.println("The students id is " + student.getId() + ", their last name is " + student.getLastName()
                    + " and their tuition costs $" + student.getAnnualTuition() + " per semester");
        }
    }
}
