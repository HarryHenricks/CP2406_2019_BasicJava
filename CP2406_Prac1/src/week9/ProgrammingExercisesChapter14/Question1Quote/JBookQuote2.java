package week9.ProgrammingExercisesChapter14.Question1Quote;

import javax.swing.*;

public class JBookQuote2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Favourite book quote");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Display book");
        button.setBounds(125,75,150,100);
        String quote = "<html>He who fights with monsters should look to it that he himself does not become a monster. " +
                "And when you gaze long into an abyss the abyss also gazes into you.</html>";
        JLabel quoteLabel = new JLabel("Quote");
        quoteLabel.setText(quote);
        quoteLabel.setBounds(0, 0, 400, 50);
        frame.getContentPane().add(quoteLabel);
        frame.getContentPane().add(button);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        button.addActionListener(e -> {
            String bookInfo = "Beyond Good and Evil by Friedrich Nietzsche";
            JLabel bookLabel = new JLabel();
            bookLabel.setText(bookInfo);
            bookLabel.setBounds(0, 200, 400, 50);
            frame.getContentPane().add(bookLabel);
            frame.repaint();
        });
    }
}
