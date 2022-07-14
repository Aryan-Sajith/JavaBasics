package additional_tooling.gui.layouts.Flow_Layout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Creates the JFrame
        JFrame frame = new JFrame();
        // Creates a JPanel
        JPanel panel = new JPanel();

        // Sets up the JPanel
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.LIGHT_GRAY);
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("10"));
        // Sets up the JFrame
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10,10)); // Defines Flow Layout
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.add(panel);
        frame.setVisible(true);
    }

    // FlowLayout = Places components in a row with their preferred size. If row spaced is used up, then
    // the next row is utilized
}
