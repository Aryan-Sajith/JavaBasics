package additional_tooling.gui.JLabel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JLabel = A GUI display for a string of text, an image, or both... A COMPONENT

        // Creates an image icon to add to the label!
        ImageIcon image = new ImageIcon("/Users/aryansajith/IdeaProjects/JavaBasics/src/additional_tooling/gui/JLabel/Business.jpeg");

        // Creates a border to add to the label!
        Border border = BorderFactory.createLineBorder(Color.orange,3);

        // JLabel Properties
        JLabel label = new JLabel();
        label.setText("Aryan Sajith the coder!"); // Sets JLabel text
        label.setIcon(image); // Sets JLabel image


        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.RED); // Text color
        label.setFont(new Font("Times New Roman",Font.PLAIN,20)); // Text font
        label.setIconTextGap(-25); // Text-to-Image Spacing

        label.setBackground(Color.BLACK); // Sets Background Color
        label.setOpaque(true); // Displays Background Color

        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // Vertical Position of Text+Image inside label
        label.setHorizontalAlignment(JLabel.CENTER); // Horizontal Position of Text+Image inside label

        label.setBounds(125,125,250,250); // Sets (x,y) pos in frame alongside dimensions


        // Sets up the JFrame to put the label on!
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500, 500);
        //frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);
        frame.pack(); //Makes the frame fit to the label size!

    }
}
