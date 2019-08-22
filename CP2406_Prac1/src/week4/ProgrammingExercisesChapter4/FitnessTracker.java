package week4.ProgrammingExercisesChapter4;

import java.util.Calendar;
import java.util.Date;

public class FitnessTracker {
    String activity;
    int participationLength; // time spent participating in minutes
    Date participationDate;

    FitnessTracker(String fitnessActivity, int length, Date date){
        activity = fitnessActivity;
        participationLength = length;
        participationDate = date;
    }

    FitnessTracker(){
        activity = "running";
        participationLength = 0;
        participationDate = new Date(2019, Calendar.JANUARY, 1);
        new FitnessTracker(activity, participationLength, participationDate);
    }

    public String getActivity(){
        return activity;
    }
    public int getParticipationLength(){
        return  participationLength;
    }
    public Date getParticipationDate(){
        return participationDate;
    }

    public static void main(String[] args) {

    }

}
