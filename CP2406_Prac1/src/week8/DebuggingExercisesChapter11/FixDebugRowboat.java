package week8.DebuggingExercisesChapter11;

public class FixDebugRowboat extends FixDebugBoat
{
   FixDebugRowboat()
   {
      super("row");
      setPassengers();
      setPower();
   }
   public void setPassengers()
   {
      super.passengers = 2;
   }
   public void setPower()
   {
      super.power = "oars";
   }
}