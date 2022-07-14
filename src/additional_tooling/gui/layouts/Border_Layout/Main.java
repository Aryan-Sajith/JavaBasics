package additional_tooling.gui.layouts.Border_Layout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JFrame
        JFrame frame = new JFrame();
        // Primary 5 Panels
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        // Sub Panels
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        // Sets up the colors for the primary 5 panels!
        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.blue);
        panel4.setBackground(Color.pink);
        panel5.setBackground(Color.yellow);

        // Sets up the colors for the sub panels!
        panel6.setBackground(Color.black);
        panel7.setBackground(Color.orange);
        panel8.setBackground(Color.DARK_GRAY);
        panel9.setBackground(Color.CYAN);
        panel10.setBackground(Color.magenta);

        // Adds the sub panels to the center frame(panel5)
        panel5.setLayout(new BorderLayout());
        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.SOUTH);
        panel5.add(panel8,BorderLayout.WEST);
        panel5.add(panel9,BorderLayout.EAST);
        panel5.add(panel10,BorderLayout.CENTER);

        // Sets up the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setLayout(new BorderLayout()); //Sets the BorderLayout
        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.WEST);
        frame.add(panel5,BorderLayout.CENTER);
        frame.setVisible(true);

    }

    // BorderLayout = A layout with 5 Main areas: NORTH, SOUTH, WEST, EAST, and CENTER.
}
