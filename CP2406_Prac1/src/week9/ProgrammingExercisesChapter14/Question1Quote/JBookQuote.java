package week9.ProgrammingExercisesChapter14.Question1Quote;

import javax.swing.*;

public class JBookQuote {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Favourite book quote");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String quote = "<html>He who fights with monsters should look to it that he himself does not become a monster. " +
                "And when you gaze long into an abyss the abyss also gazes into you.</html>";
        JLabel quoteLabel = new JLabel("Quote");

        quoteLabel.setText(quote);
        frame.add(quoteLabel);

        frame.setSize(300,150);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
