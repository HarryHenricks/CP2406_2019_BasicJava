package week6.DebuggingExercisesChapter8;
// Application prompts user showing valid shipping codes
// accepts a shipping code
// and determines if it is valid
import javax.swing.*;
public class FixDebugEight1
{
   public static void main(String args[])
   {
      char userCode;
      String entry, message;
      boolean found = false;
      char[] okayCodes = {'A','C','T','H'};
      StringBuffer prompt = new 
          StringBuffer("Enter shipping code for this delivery\nValid codes are: ");
      for (char okayCode : okayCodes) {
         prompt.append(okayCode);
         prompt.append(", ");
      }
      entry = JOptionPane.showInputDialog(null,
         prompt);

      for (char okayCode : okayCodes) {
         for (int i = 0; i < entry.length(); ++i) {
            userCode = entry.charAt(i);
            if (userCode == okayCode) {
               found = true;
            }
         }
      }
      if(found)
         message = "Good code";
      else
         message = "Sorry code not found";
      JOptionPane.showMessageDialog(null, message);
   }
}