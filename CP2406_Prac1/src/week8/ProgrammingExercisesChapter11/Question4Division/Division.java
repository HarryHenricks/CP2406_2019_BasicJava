package week8.ProgrammingExercisesChapter11.Question4Division;

abstract class Division {
    private String divisionName;
    private int accountNumber;
    Division(String divisionName, int accountNumber){
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }
    String getDivisionName(){
        return divisionName;
    }
    int getAccountNumber(){
        return accountNumber;
    }
    abstract void display();
}
