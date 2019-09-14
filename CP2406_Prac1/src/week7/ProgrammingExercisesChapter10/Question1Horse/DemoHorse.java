package week7.ProgrammingExercisesChapter10.Question1Horse;

public class DemoHorse {
    public static void main(String[] args) {
        Horse horse = new Horse("Zebra", "Orange", 1494);
        horse.getHorseInformation();

        RaceHorse raceHorse = new RaceHorse("Black caviar", "Black", 2001, 26);
        raceHorse.getRaceHorseInformation();
    }
}
