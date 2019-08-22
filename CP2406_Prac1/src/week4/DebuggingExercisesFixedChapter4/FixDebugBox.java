package week4.DebuggingExercisesFixedChapter4;

public class FixDebugBox
{
   private int width;
   private int length;
   private int height;
   private FixDebugBox()
   {
      length = 1;
      width = 1;
      height = 1;
   }
   FixDebugBox(int width1, int length1, int height1)
   {
      width = width1;
      length = length1;
      height = height1;
   }
   void showData()
   {
     System.out.println("Width: "  + width + "  Length: " +
       length + "  Height: " + height);
   }
   double getVolume()
   { 
     double vol = length * width * height;
     return vol;
   }
}
