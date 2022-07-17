package additional_tooling.gui.JLayeredPane;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Sets up JLabels to add to the JLayeredPane
        JLabel blue = new JLabel();
        blue.setOpaque(true);
        blue.setBackground(Color.blue);
        blue.setBounds(50,50,100,100);

        JLabel green = new JLabel();
        green.setOpaque(true);
        green.setBackground(Color.green);
        green.setBounds(100,100,200,200);

        JLabel red = new JLabel();
        red.setOpaque(true);
        red.setBackground(Color.red);
        red.setBounds(150,150,300,300);

        // Sets up the JLayered Pane
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
        // Adds JButtons to the JLayeredPane... we use Integer.valueOf() to choose where each element
        // is stacked relative to each other!
        layeredPane.add(blue, Integer.valueOf(2));
        layeredPane.add(green, Integer.valueOf(1));
        layeredPane.add(red, Integer.valueOf(0));

        // Sets up the JFrame
        JFrame frame = new JFrame();
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    // JLayeredPane = A swing container that provides a 3rd dimension for positioning components
    //      Examples: Depth, Z-Index, etc.
}
