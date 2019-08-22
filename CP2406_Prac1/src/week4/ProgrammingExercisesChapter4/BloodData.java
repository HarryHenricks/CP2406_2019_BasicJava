package week4.ProgrammingExercisesChapter4;

class BloodData {
    String bloodType;
    char Rh_factor;

    BloodData(){
        bloodType = "O";
        Rh_factor = '+';
    }
    BloodData(String type, char factor){
        bloodType = type;
        Rh_factor = factor;
    }
    String getBloodType(){
        return bloodType;
    }
    char getFactor(){
        return Rh_factor;
    }
    void setBloodType(String type){
        bloodType = type;
    }
    void setFactor(char factor){
        Rh_factor = factor;
    }
}
