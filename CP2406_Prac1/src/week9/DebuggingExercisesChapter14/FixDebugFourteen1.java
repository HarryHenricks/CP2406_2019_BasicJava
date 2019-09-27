package week9.DebuggingExercisesChapter14;
// Creates a frame with a specified size
// Twice as tall as wide
// The size is a constructor argument
import javax.swing.*;

public class FixDebugFourteen1 extends JFrame
{
   private FixDebugFourteen1(int size)
   {
      super("This is my frame");
      JFrame frame = new JFrame(super.getTitle());
      frame.setSize(size, size * 2);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
   public static void main(String[] args)
   {
      FixDebugFourteen1 frame = new FixDebugFourteen1(200);
   } 
}
