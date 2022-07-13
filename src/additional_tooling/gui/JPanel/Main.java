package additional_tooling.gui.JPanel;

import javax.swing.*;
import java.awt.*;

// JPanel = A GUI component that acts as a container to hold other components

public class Main {
    public static void main(String[] args) {

        // ImageIcon to include in the JLabel!
        ImageIcon icon = new ImageIcon("/Users/aryansajith/IdeaProjects/JavaBasics/src/additional_tooling/gui/JPanel/Books.jpeg");


        // JLabel component to add to the red panel!
        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        //label.setVerticalAlignment(JLabel.TOP);
        //label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0,0,250,250);

        // JPanel = A GUI component that acts as a container to hold other components
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN); // Panel background
        greenPanel.setBounds(0,0,250,250); // Panel Layout manually defined
        greenPanel.setLayout(null);
        greenPanel.add(label);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red); // Panel background
        redPanel.setBounds(250,0,250,250); // Panel Layout manually defined
        redPanel.setLayout(null);


        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue); // Panel background
        bluePanel.setBounds(0,250,500,250); // Panel Layout manually defined
        bluePanel.setLayout(null);

        // Sets up the JFrame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.add(greenPanel);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.setVisible(true);
    }
}
