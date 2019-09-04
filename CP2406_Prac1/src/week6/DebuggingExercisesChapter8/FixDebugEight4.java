package week6.DebuggingExercisesChapter8;
// Allows user to enter a series of words
// and displays them in reverse order
import javax.swing.*;
public class FixDebugEight4
{
   public static void main(String[] args)
   {
      int x = 0, y;
      String array[] = new String[100];
      String entry;
      final String STOP = "XXX";
      StringBuffer message = new
          StringBuffer("The words in reverse order are\n");
     
      entry = JOptionPane.showInputDialog(null,
        "Enter any word\n" +
        "Enter " + STOP + " when you want to stop");
      while(!(entry.equals(STOP)))
      {
         array[x] = entry;
         entry = JOptionPane.showInputDialog(null,
            "Enter another word\n" +
            "Enter " + STOP + " when you want to stop");
         ++x;
      }
      for(y = 0; y < x; ++y)
      {
         message.append(array[x-y-1]);
         message.append("\n");
      }
      JOptionPane.showMessageDialog(null, message);
   }
}

