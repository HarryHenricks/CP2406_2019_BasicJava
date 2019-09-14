package week7.ProgrammingExercisesChapter10.Question4Poems;

public class DemoPoems {
    public static void main(String[] args) {
        Couplet couplet = new Couplet("Demo Couplet");
        Haiku haiku = new Haiku("Demo Haiku");
        Limerick limerick = new Limerick("Demo Limerick");
        System.out.println(couplet.getName() + " has " + couplet.getNumberLines() + " lines");
        System.out.println(haiku.getName() + " has " + haiku.getNumberLines() + " lines");
        System.out.println(limerick.getName() + " has " + limerick.getNumberLines() + " lines");
    }
}
