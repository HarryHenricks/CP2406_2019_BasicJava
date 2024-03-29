package week8.DebuggingExercisesChapter11;

// An array for different boat types
public class FixDebugEleven2
{
   public static void main(String[] args)
   {
      FixDebugBoat[] ref = new FixDebugBoat[3];
      FixDebugRowboat blueBoat = new FixDebugRowboat();
      FixDebugRowboat redBoat = new FixDebugRowboat();
      FixDebugOceanLiner bigBoat = new FixDebugOceanLiner();
      ref[0] = redBoat;
      ref[1] = blueBoat;
      ref[2] = bigBoat;
      for (FixDebugBoat fixDebugBoat : ref) {
         fixDebugBoat.setPassengers();
         fixDebugBoat.setPower();
         System.out.println(fixDebugBoat.toString());
      }
   }
}
