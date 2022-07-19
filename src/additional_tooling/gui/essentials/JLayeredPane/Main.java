package additional_tooling.gui.essentials.JLayeredPane;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Sets up JLabels to add to the JLayeredPane
        JLabel blueLabel = new JLabel();
        blueLabel.setOpaque(true);
        blueLabel.setBackground(Color.blue);
        blueLabel.setBounds(50,50,100,100);

        JLabel greenLabel = new JLabel();
        greenLabel.setOpaque(true);
        greenLabel.setBackground(Color.green);
        greenLabel.setBounds(100,100,200,200);

        JLabel redLabel = new JLabel();
        redLabel.setOpaque(true);
        redLabel.setBackground(Color.red);
        redLabel.setBounds(150,150,300,300);

        // Sets up the JLayered Pane
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);
        // Adds JButtons to the JLayeredPane... we use Integer.valueOf() to choose where each element
        // is stacked relative to each other!
        layeredPane.add(blueLabel, Integer.valueOf(2));
        layeredPane.add(greenLabel, Integer.valueOf(1));
        layeredPane.add(redLabel, Integer.valueOf(0));

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
