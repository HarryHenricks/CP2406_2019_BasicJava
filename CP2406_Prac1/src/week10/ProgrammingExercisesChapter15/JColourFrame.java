package week10.ProgrammingExercisesChapter15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JColourFrame extends JFrame implements ActionListener {
    // Create a JFrame that uses BorderLayout. Place a JButton in the center region.
    // Each time the user clicks the JButton, change the background colour in one of the other regions.
    public static void main(String[] args) {
        JColourFrame jColourFrame = new JColourFrame();
    }

    public JColourFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JButton backgroundColour = new JButton("Change background colour");
        backgroundColour.addActionListener(this);
        add(backgroundColour, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int random = (int) (Math.random() * 4 + 1);
        if (random == 1){
            setBackground(Color.BLACK);
        }
    }
}
